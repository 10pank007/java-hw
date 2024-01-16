package hw4.part2;

import hw2.part4.Car;
import hw2.part4.Employe;
import hw2.part4.GENDER;
import hw2.part4.Skills;

import java.util.Set;
import java.util.TreeSet;

public class MainTreeSet {
    public static void main(String[] args) {
        Set<Employe> employes = new TreeSet<>();
        employes.add(new Employe(1,
                "bohdan",
                "pankiv",
                "pankivbogdan96@gmail.com",
                27,
                GENDER.MALE,
                new Skills[]{new Skills("java", 2), new Skills("js", 1)},
                new Car("VW", 2020, 10)));
        employes.add(new Employe(2,
                "pavlo",
                "gavrishko",
                "pavlogavrishko@gmail.com",
                27,
                GENDER.MALE,
                new Skills[]{new Skills("java", 1)},
                new Car("Ford", 2019, 8)));
        employes.add(new Employe(3,
                "tetiana",
                "pankiv",
                "tania0201@gmail.com",
                22,
                GENDER.FEMALE,
                new Skills[]{},
                new Car("Nisan", 2023, 10)));
        employes.add(new Employe(4,
                "nikola",
                "sakulich",
                "sakul@gmail.com",
                28,
                GENDER.MALE,
                new Skills[]{new Skills("java", 1), new Skills("js", 1), new Skills("docker", 2), new Skills("sql", 4)},
                new Car("Tesla", 2020, 10)));
        employes.add(new Employe(5,
                "petro",
                "kud",
                "kud97@gmail.com",
                27,
                GENDER.MALE,
                new Skills[]{new Skills("java", 1)},
                new Car("Lada", 1900, 5)));
        employes.add(new Employe(6,
                "solomia",
                "diachenko",
                "miadia@gmail.com",
                25,
                GENDER.FEMALE,
                new Skills[]{new Skills("java", 1), new Skills("react", 2)},
                new Car("Audi", 2023, 10)));
        employes.add(new Employe(7,
                "alina",
                "vorobets",
                "alia@gmail.com",
                29,
                GENDER.FEMALE,
                new Skills[]{new Skills("java", 1), new Skills("html", 9), new Skills("css", 8), new Skills("react", 5), new Skills("docker", 1)},
                new Car("VW", 2020, 10)));
        employes.add(new Employe(8,
                "anastasia",
                "gerelyshyn",
                "nastia93@gmail.com",
                31,
                GENDER.FEMALE,
                new Skills[]{new Skills("java", 1), new Skills("html", 2), new Skills("css",3)},
                new Car("Opel", 2022, 6)));
        employes.add(new Employe(9,
                "diana",
                "popovich",
                "diamond007@gmail.com",
                24,
                GENDER.FEMALE,
                new Skills[]{new Skills("java", 1), new Skills("js", 8)},
                new Car("Hundai", 1999, 7)));
        employes.add(new Employe(10,
                "zahar",
                "pushkar",
                "zohan96@gmail.com",
                27,
                GENDER.FEMALE,
                new Skills[]{new Skills("java", 1)},
                new Car("BMW", 2020, 9)));
        System.out.println(employes);
    }


}
