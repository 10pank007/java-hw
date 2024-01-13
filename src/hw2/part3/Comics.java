package hw2.part3;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor

public class Comics extends Book {
    private boolean isAdult;

    public Comics(int quality, int pages, String genres, int price, boolean isAdult) {
        super(quality, pages, genres, price);
        this.isAdult = isAdult;
    }
}
