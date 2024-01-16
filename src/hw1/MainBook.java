package hw1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainBook {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.setTitle("title1");
        book1.setPages(10);
        String[] authors1 = {"author1", "author2"};
        book1.setAuthors(authors1);
        book1.setGenre("genre1");

        Book book2 = new Book();
        book2.setTitle("title2");
        book2.setPages(20);
        String[] authors2 = {"author3", "author4"};
        book2.setAuthors(authors2);
        book2.setGenre("genre2");

        Book book3 = new Book();
        book3.setTitle("title3");
        book3.setPages(30);
        String[] authors3 = {"author5", "author6"};
        book3.setAuthors(authors3);
        book3.setGenre("genre3");

        Book book4 = new Book();
        book4.setTitle("title4");
        book4.setPages(40);
        String[] authors4 = {"author7", "author8"};
        book4.setAuthors(authors4);
        book4.setGenre("genre4");

        Book book5 = new Book();
        book5.setTitle("title5");
        book5.setPages(50);
        String[] authors5 = {"author9", "author10"};
        book5.setAuthors(authors5);
        book5.setGenre("genre5");

        Book [] arrBooks = new Book[5];
        arrBooks[0] = book1;
        arrBooks[1] = book2;
        arrBooks[2] = book3;
        arrBooks[3] = book4;
        arrBooks[4] = book5;
        for (Book arrBook : arrBooks) {
            System.out.println(arrBook);
        }

        List<Book> listBooks = new ArrayList<>();
        listBooks.add(book1);
        listBooks.add(book2);
        listBooks.add(book3);
        listBooks.add(book4);
        listBooks.add(book5);
        for (Book listBook : listBooks) {
            System.out.println(listBook.getTitle() + " " + listBook.getPages() + " " + Arrays.toString(listBook.getAuthors()) + " " + listBook.getTitle());
        }

    }
}
