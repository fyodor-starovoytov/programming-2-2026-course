public class Phone {
    private String brand;
    private int batteryLevel;

    public Phone(String brand, int batteryLevel) {
        if (batteryLevel < 0 || batteryLevel > 100){
            IO.println("ERROR: Battery must be inside 0 - 100 range");
            return;
        }
        this.brand = brand;
        this.batteryLevel = batteryLevel;
    }

    public void sendMessage(String person, String message){
        if (!hasBatteryCharge()){
            IO.println("Battery empty. Cannot send message.");
            return;
        }
        IO.println("Sending a message to " + person + ": " + message);
        reduceBatteryCharge(5);
    }

    public void call(String person, int minutes){
        if (!hasBatteryCharge()){
            IO.println("Battery empty. Cannot make a call.");
            return;
        }
        IO.println("Calling " + person + ", duration: " + minutes + " minutes");
        reduceBatteryCharge(minutes);
    }

    public void charge(int percentage){
        if (percentage < 0){
            IO.println("ERROR: Can't charge negative amount");
            return;
        }

        this.batteryLevel = Math.min(this.batteryLevel + percentage, 100);
    }

    public void printInfo(){
        IO.println("The battery level of the " + brand + " phone is " + batteryLevel + "%.");
    }

    private void reduceBatteryCharge(int amount){
        this.batteryLevel = Math.max(this.batteryLevel - amount, 0);
    }

    private boolean hasBatteryCharge(){
        return this.batteryLevel > 1;
    }
}
