package models;

import java.util.ArrayList;

public class Post {

    private String content;
    public static ArrayList<Post> instances = new ArrayList <>();

    public Post (String content) {
        this.content = content;
        instances.add(this); //Also new. Can you figure out what I do and how I work?
    }
    public String getContent() {
        return content;
    }

    public static ArrayList<Post> getAll(){
        return instances;
    }
    public static void clearAllPosts() {
        instances.clear();
    }
}