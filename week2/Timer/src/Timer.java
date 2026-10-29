public class Timer {
    private int minutes;
    private int seconds;

    public Timer() {
        this.minutes = 0;
        this.seconds = 0;
    }

    public Timer(int minutes, int seconds) {
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public void addSeconds(int seconds) {
        if (seconds <= 0) {
            IO.println("Error: seconds have to be over 0");
            return;
        }

        int minutesToAdd = 0;
        int secondsToAdd = seconds;

        if (seconds + this.seconds > 59) {
            minutesToAdd = minutesToAdd + (seconds + this.seconds) / 60;
            secondsToAdd = (secondsToAdd + this.seconds) % 60;
        }
        this.minutes = this.minutes + minutesToAdd;
        this.seconds = secondsToAdd;
    }

    public void addMinutes(int minutes) {
        if (minutes <= 0) {
            IO.println("Error: minutes have to be over 0");
            return;
        }
        this.minutes = this.minutes + minutes;
    }

    public String toString() {
        String secondsToPrint = String.valueOf(seconds);
        String minutesToPrint = String.valueOf(minutes);
        if (seconds < 10) {
            secondsToPrint = "0" + secondsToPrint;
        }
        if (minutes < 10) {
            minutesToPrint = "0" + minutesToPrint;
        }
        return minutesToPrint + ":" + secondsToPrint;
    }
}
