package hw4.part3;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

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
}
