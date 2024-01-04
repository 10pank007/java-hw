package hw1;

import java.util.ArrayList;
import java.util.List;

public class MainPost {
    public static void main(String[] args) {
        JSON_Post json_post1 = new JSON_Post();
        json_post1.setId(1);
        json_post1.setUserId(1);
        json_post1.setBody("body1");
        json_post1.setTitle("title1");

        JSON_Post json_post2 = new JSON_Post();
        json_post2.setId(2);
        json_post2.setUserId(2);
        json_post2.setBody("body2");
        json_post2.setTitle("title2");

        JSON_Post json_post3 = new JSON_Post();
        json_post3.setId(3);
        json_post3.setUserId(3);
        json_post3.setBody("body3");
        json_post3.setTitle("title3");

        JSON_Post json_post4 = new JSON_Post();
        json_post4.setId(4);
        json_post4.setUserId(4);
        json_post4.setBody("body4");
        json_post4.setTitle("title4");

        JSON_Post json_post5 = new JSON_Post();
        json_post5.setId(5);
        json_post5.setUserId(5);
        json_post5.setBody("body5");
        json_post5.setTitle("title5");

        JSON_Post[] arrJson_posts = new JSON_Post[]{json_post1, json_post2, json_post3, json_post4, json_post5};
        for (JSON_Post jsonPost : arrJson_posts) {
            System.out.println(jsonPost);
        }

        List<JSON_Post> listJson_posts = new ArrayList<>();
        listJson_posts.add(json_post1);
        listJson_posts.add(json_post2);
        listJson_posts.add(json_post3);
        listJson_posts.add(json_post4);
        listJson_posts.add(json_post5);

        for (JSON_Post listJsonPost : listJson_posts) {
            System.out.print(listJsonPost.getId() + " " + listJsonPost.getUserId() + " " + listJsonPost.getBody() + " " + listJsonPost.getTitle() + "\n");
        }
    }
}
