void main() {
    PiggyBank mikaelAccount = new PiggyBank("LordOfTheR1ng!", "Mikael");
    mikaelAccount.printBalance();
    mikaelAccount.withdraw(10, "lordOfTheR1ng!");
    mikaelAccount.withdraw(10, "LordOfTheR1ng!");
    mikaelAccount.printBalance();
    mikaelAccount.deposit(40);
    mikaelAccount.printBalance();
    mikaelAccount.withdraw(10, "LordOfTheR1ng!");
    mikaelAccount.printBalance();
}
