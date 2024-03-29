package hw2.part2;

import hw2.part2.Laptop;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Ultrabook extends Laptop {
    private int butteryLife;

    public Ultrabook(int speed, double memory, boolean isDigital, int reliability, String accessories, int size, int butteryLife) {
        super(speed, memory, isDigital, reliability, accessories, size);
        this.butteryLife = butteryLife;
    }
}
