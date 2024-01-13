package hw2.part5JSONPleaceholder;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Comment {
    private int postId;
    private int id;
    private String name;
    private String email;
    private String body;
}
