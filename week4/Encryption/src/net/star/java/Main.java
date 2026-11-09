import net.star.java.Encryptor;
import net.star.java.Hacker;
import net.star.java.NextLetter;
import net.star.java.Reverser;

void main() {
    List<Encryptor> encryptors = List.of(
            new NextLetter(),
            new Reverser(),
            new Hacker()
    );

    String original = "NOW THERE IS TROUBLE. Save the world.";

    for (Encryptor e : encryptors) {
        String encrypted = e.encrypt(original);
        System.out.println("Sending encrypted message to Agent 007: " + encrypted);

        String decrypted = e.decrypt(encrypted);
        System.out.println("The agent receives and decrypts it: " + decrypted);
    }
}
