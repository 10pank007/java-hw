package hw2.part3;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book extends Papyrus {
    private int pages;
    private String genres;
    private int price;

    public Book(int quality, int pages, String genres, int price) {
        super(quality);
        this.pages = pages;
        this.genres = genres;
        this.price = price;
    }
}
