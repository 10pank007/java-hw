package hw2.part3;

import hw2.part3.Book;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@Data
public class Magazine extends Book {
    private boolean isPopular;
    private int countOfSubscribers;

    public Magazine(int quality, int pages, String genres, int price, boolean isPopular, int countOfSubscribers) {
        super(quality, pages, genres, price);
        this.isPopular = isPopular;
        this.countOfSubscribers = countOfSubscribers;
    }
}
