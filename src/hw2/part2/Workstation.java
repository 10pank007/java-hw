package hw2.part2;

import hw2.part2.Laptop;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
public class Workstation extends Laptop {
    private String software;

    public Workstation(int speed, double memory, boolean isDigital, int reliability, String accessories, int size, String software) {
        super(speed, memory, isDigital, reliability, accessories, size);
        this.software = software;
    }
}
