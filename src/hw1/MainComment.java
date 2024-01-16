package hw1;

import java.util.ArrayList;
import java.util.List;

public class MainComment {
    public static void main(String[] args) {
        JSON_Comment jsonComment1 = new JSON_Comment(1, 1, "name1", "email1", "body1");
        JSON_Comment jsonComment2 = new JSON_Comment(2, 2, "name2", "email2", "body2");
        JSON_Comment jsonComment3 = new JSON_Comment(3, 3, "name3", "email3", "body3");
        JSON_Comment jsonComment4 = new JSON_Comment(4, 4, "name4", "email4", "body4");
        JSON_Comment jsonComment5 = new JSON_Comment(5, 5, "name5", "email5", "body5");

        JSON_Comment [] arr_json_comments = new JSON_Comment[]{jsonComment1, jsonComment2, jsonComment3, jsonComment4, jsonComment5};
        for (JSON_Comment arrJsonComment : arr_json_comments) {
            System.out.println(arrJsonComment);
        }

        List<JSON_Comment> listJsonComment = new ArrayList<>();
        listJsonComment.add(jsonComment1);
        listJsonComment.add(jsonComment2);
        listJsonComment.add(jsonComment3);
        listJsonComment.add(jsonComment4);
        listJsonComment.add(jsonComment5);

        System.out.println("*************");

        for (JSON_Comment jsonComment : listJsonComment) {
            System.out.println(jsonComment);
        }
    }

}
