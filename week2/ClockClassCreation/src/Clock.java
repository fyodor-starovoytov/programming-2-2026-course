public class Clock {

    private int hours;
    private int minutes;

    public Clock(int hours, int minutes){
        if (hours >= 0 && hours < 24 && minutes >= 0 && minutes < 60) {
            this.hours = hours;
            this.minutes = minutes;
        }
        else {
            IO.println("Minutes or hours out of available threshold: " + hours + " " + minutes);
        }
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
