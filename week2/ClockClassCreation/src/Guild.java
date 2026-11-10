import java.util.ArrayList;
import java.util.List;

public class Guild {
    private String name;
    private List<ClockSmith> smiths;

    public Guild(String name) {
        this.name = name;
        this.smiths = new ArrayList<>();
    }

    public void fixAllCLocks(List<Clock> clocks){
        for (Clock clock : clocks){
            this.smiths.getFirst().fixClock(clock);
        }
    }
}
