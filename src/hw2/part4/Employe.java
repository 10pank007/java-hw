package hw2.part4;

import lombok.AllArgsConstructor;
import lombok.Data;


@AllArgsConstructor
@Data
public class Employe {
    private int id;
    private String name;
    private String surname;
    private String email;
    private int age;
    private GENDER gender;
    private Skills[] skills;
    private Car car;
}
