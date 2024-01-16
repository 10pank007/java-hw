package hw4.part3;

import lombok.*;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cat extends Pet {
    private boolean isHappy;
    @Override
    void sayHello() {
        System.out.println("Miaw");
    }

    public Cat(int age, String name, boolean isHappy) {
        super(age, name);
        this.isHappy = isHappy;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "isHappy=" + isHappy + " " + super.getAge() + " " + super.getName() + "} ";
    }
}
