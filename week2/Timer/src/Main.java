public class Main {
    public static void main(String[] args) {
        Timer timer1 = new Timer();
        IO.println(timer1.toString());

        timer1.addMinutes(1);
        IO.println(timer1.toString());

        timer1.addSeconds(30);
        IO.println(timer1.toString());

        timer1.addSeconds(30);
        IO.println(timer1.toString());

        timer1.addSeconds(90);
        IO.println(timer1.toString());

        Timer timer2 = new Timer(10, 15);
        IO.println(timer2.toString());
    }
}
