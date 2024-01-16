package hw4.part3;

public class Main {
    public static void main(String[] args) {

//        Створити клас Зооклуб. В цьому класі створити одне поле: private Map <Person, List <Pet>> club;
//        В зооклубі створити методи, та застосувати їх
//        1) додати учасника в клуб;
//        2) додати тваринку до учасника клубу.
//        3) видалити тваринку з власника.
//        4) видалити учасника клубу.
//        5) видалити конкретну тваринку з усіх власників.
//        6) вивести на екран зооклуб.
//        Подумати яким повинен бути Person, щоб була можливість додавати йому тваринку.
//                Подумати яким повинен бути Pet, щоб була можливість видаляти конкретну тваринку

        Person person1 = new Person("ivan");
        Person person2 = new Person("petro");
        Person person3 = new Person("bohdan");
        Person person4 = new Person("ilona");
        Person person5 = new Person("diana");
        ZooClub zooClub = new ZooClub();
        zooClub.addPersonToClub(person1);
        zooClub.addPersonToClub(person2);
        zooClub.addPersonToClub(person3);
        zooClub.addPersonToClub(person4);
        zooClub.addPersonToClub(person5);
        System.out.println(zooClub);

        zooClub.addAnimalToPerson(person1, new Cat(8, "Taison", true));
        zooClub.addAnimalToPerson(person1, new Cat(5, "Musia", false));
        System.out.println(zooClub);



    }
}
