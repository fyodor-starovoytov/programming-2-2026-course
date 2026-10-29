import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;

public class PiggyBank {
    private double balance;
    private String owner;
    private final byte[] HASHED_PASSWORD;
    private final byte[] SALT;

    public PiggyBank(String owner, String PASSWORD) {

        this.SALT = generateSalt();
        this.HASHED_PASSWORD = hashPassword(PASSWORD, SALT);
        this.owner = owner;
        this.balance = 0.0;
    }

    public void deposit(double amount){
        if (amount <= 0){
            IO.println("ERROR: Must deposit over 0");
            return;
        }

        balance = balance + amount;
    }

    public double withdraw(double amount, String suppliedPassword){
        if (Arrays.equals(hashPassword(suppliedPassword, SALT), HASHED_PASSWORD)){
            if (balance - amount >= 0){
                balance = balance-amount;
                return amount;
            }
            IO.println("ERROR: Not enough balance");
            return 0.0;
        }
        IO.println("Wrong username or password");
        return 0.0;
    }

    public void printBalance(){
        IO.println("Hello " + owner + ", the balance of your piggy bank is " + balance + " euros.");
    }

    private byte[] hashPassword(String suppliedPassword, byte[] salt){

        // Using SHA-512 instead of stronger algorithms like Argon2, because for the sake of the practice.
        MessageDigest md = null;
        try {
            md = MessageDigest.getInstance("SHA-512");
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }

        md.update(salt);
        return md.digest(suppliedPassword.getBytes(StandardCharsets.UTF_8));
    }

    private byte[] generateSalt(){
        SecureRandom random = new SecureRandom();
        byte[] salt = new byte[16];
        random.nextBytes(salt);
        return salt;
    }
}

