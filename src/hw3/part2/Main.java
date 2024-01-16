package hw3.part2;

public class Main {
    public static void main(String[] args) {
        Instrument [] instruments = new Instrument[3];
        instruments[0] = new Drum(10);
        instruments[1] = new Guitar(6);
        instruments[2] = new Trumpet(7);
        for (Instrument instrument : instruments) {
            instrument.play();
        }
    }
}
