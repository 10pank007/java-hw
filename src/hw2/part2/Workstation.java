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
}
