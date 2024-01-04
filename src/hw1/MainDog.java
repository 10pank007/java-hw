package hw1;

import java.util.ArrayList;
import java.util.List;

public class MainDog {
    public static void main(String[] args) {
       Dog dog1 = new Dog("name1", 1, "poroda1");
       Dog dog2 = new Dog("name2", 2, "poroda2");
       Dog dog3 = new Dog("name3", 3, "poroda3");
       Dog dog4 = new Dog("name4", 4, "poroda4");
       Dog dog5 = new Dog("name5", 5, "poroda5");

       Dog [] arrDogs = new Dog[] {dog1, dog2, dog3, dog4, dog5};
        for (Dog arrDog : arrDogs) {
            System.out.println(arrDog);
        }

        System.out.println("*********");

        List<Dog> listDogs = new ArrayList<>();
        listDogs.add(dog1);
        listDogs.add(dog2);
        listDogs.add(dog3);
        listDogs.add(dog4);
        listDogs.add(dog5);

        for (int i = 0; i < listDogs.size(); i++) {
            System.out.println(listDogs.get(i));
        }


    }
}
