package hw5.part3;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Car {
    private String carBrand;
    private double enginePower;
    private Owner owner;
    private int price;
    private int yearOfManufacture;

//    public void changeEnginePower() {
//        this.enginePower += (this.enginePower * 0.1);
//    }
}
