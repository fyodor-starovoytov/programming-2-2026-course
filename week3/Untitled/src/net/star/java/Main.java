import net.star.java.DayPass;
import net.star.java.LiftPass;
import net.star.java.SeasonPass;

void main() {

    DayPass pass0 = new DayPass("Eero", 40, 3);
    SeasonPass seasonPass0 = new SeasonPass("Aino", 35);
    DayPass pass1 = new DayPass("Fedor", 40, 1);

    List<LiftPass> passList = new ArrayList<>();
    
    passList.add(pass0);
    passList.add(pass1);
    passList.add(seasonPass0);

    int sum = 0;
    for (LiftPass pass : passList){
        sum = sum + pass.price();
    }

    IO.println(sum + "€");
    IO.println(pass0.price() + "€");

}
