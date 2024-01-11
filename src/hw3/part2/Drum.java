package hw3.part2;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Drum implements Instrument{
    private int Size;
    @Override
    public void play() {
        System.out.println("playing drum with " + this.Size + " size");
    }
}
