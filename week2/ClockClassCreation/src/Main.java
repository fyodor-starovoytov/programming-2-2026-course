void main() {
    Clock clock = new Clock(10, 15);
    clock.setHours(11);
    clock.displayTime(); // 11:15
    clock.setHours(23);
    clock.displayTime(); // 23:15
    clock.setHours(24);
    clock.displayTime(); // 23:15
    clock.setHours(1);
    clock.displayTime(); // 01:15

    clock.setHours(-1);
    clock.displayTime(); // 01:15
    clock.setMinutes(0);
    clock.displayTime(); // 01:00
    clock.setMinutes(60);
    clock.displayTime(); // 01:00
    clock.setMinutes(30);
    clock.displayTime(); // 01:30
    clock.setMinutes(5);
    clock.displayTime(); // 01:05
    clock.setMinutes(-5);
    clock.displayTime(); // 01:05
}
