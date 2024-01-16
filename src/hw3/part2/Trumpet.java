package hw3.part2;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Trumpet implements Instrument {
    private int diameter;
    @Override
    public void play() {
        System.out.println("playing trumpet with " + this.diameter + " diameter");
    }
}
