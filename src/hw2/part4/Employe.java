package hw2.part4;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@Data
@NoArgsConstructor
public class Employe implements Comparable<Employe> {
    private int id;
    private String name;
    private String surname;
    private String email;
    private int age;
    private GENDER gender;
    private Skills[] skills;
    private Car car;


    @Override
    public int compareTo(Employe o) {
        return this.getSkills().length - o.getSkills().length;
    }
}
