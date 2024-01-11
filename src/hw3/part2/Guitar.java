package hw3.part2;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Guitar implements Instrument {
    private int countOfThread;
    @Override
    public void play() {
        System.out.println("playing guitar with " + this.countOfThread + " threads");
    }
}
