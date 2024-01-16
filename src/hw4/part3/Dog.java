package hw4.part3;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Dog extends Pet{
    private int size;
    @Override
    void sayHello() {
        System.out.println("Gow");
    }

    public Dog(int age, int name, int size) {
        super(age, name);
        this.size = size;
    }
}
