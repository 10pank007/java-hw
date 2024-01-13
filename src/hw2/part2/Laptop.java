package hw2.part2;

import hw2.part2.PC;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Laptop extends PC {
    private String accessories;
    private int size;

    public Laptop(int speed, double memory, boolean isDigital, int reliability, String accessories, int size) {
        super(speed, memory, isDigital, reliability);
        this.accessories = accessories;
        this.size = size;
    }
}
