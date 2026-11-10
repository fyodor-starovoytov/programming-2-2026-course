public class ClockSmith {
    private String name;
    private int amountOfClocksFixed;

    public ClockSmith(String name) {
        this.name = name;
        this.amountOfClocksFixed = 0;
    }

    public void fixClock(Clock clock){
        clock.fix();
        this.amountOfClocksFixed++;
    }
}
