void main() {
    Clock clock = new Clock(10, 15, false);
    List<Clock> clocks = new ArrayList<>();

    int i = 0;
    while (i < 100){
        if (clocks.size() == 50){
            clocks.add(new Clock(0, 0, true));

            i++;
            continue;
        }
        clocks.add(new Clock(0, 0, false));
        i++;
    }

}
