package hw3.part1;

public class Main {
    public static void main(String[] args) {
        Printable [] printables = new Printable[] {new Book(), new Magazine()};
        for (Printable printable : printables) {
            printable.print();
        }
    }
}
