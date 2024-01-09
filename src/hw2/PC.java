package hw2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PC {
    private int speed;
    private double memory;
    private boolean isDigital;
    private int reliability;
}
