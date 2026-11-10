public class Clock {

    private int hours;
    private int minutes;
    private boolean isBroken;
    private static int amountFixedClocks = 0;

    public Clock(int hours, int minutes, boolean isBroken){
        if (hours >= 0 && hours < 24 && minutes >= 0 && minutes < 60) {
            this.hours = hours;
            this.minutes = minutes;
            this.isBroken = isBroken;
        }
        else {
            IO.println("Minutes or hours out of available threshold: " + hours + " " + minutes);
        }
    }

    public void fix(){
        this.isBroken = false;
        amountFixedClocks++;
    }

    public void setHours(int hours) {
        if (hours >= 0 && hours < 24) {
            this.hours = hours;
        }
        else {
            IO.println("Hours out of available threshold: " + hours);
        }
    }

    public void setMinutes(int minutes) {
        if (minutes >= 0 && minutes < 60) {
            this.minutes = minutes;
        }
        else {
            IO.println("Minutes out of available threshold: " + minutes);
        }
    }

    public void displayTime(){
        String hoursToPrint = String.valueOf(hours);
        String minutesToPrint = String.valueOf(minutes);
        if (hours < 10){
            hoursToPrint ="0" + hoursToPrint;
        }
        if (minutes < 10){
            minutesToPrint ="0" + minutesToPrint;
        }
        IO.println(hoursToPrint + ":" + minutesToPrint);
    }
}
