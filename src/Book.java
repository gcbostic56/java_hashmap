import java.util.HashMap;

public class Book {
    private String name;
    private String content;
    private int published;

    public Book(String name, int published, String content) {
        this.name = name;
        this.published = published;
        this.content = content;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPublished() {
        return this.published;
    }

    public void setPublished(int published) {
        this.published = published;
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String toString() {
        return "Name: " + this.name + " (" + this.published + ")\n"
            + "Content: " + this.content;
    }
    public static void printValues(HashMap<String, Book> hashmap) {
        for (Book whatever : hashmap.values()) {
            System.out.println(whatever);
        }
    }
    public static void printValueIfNameContains(HashMap<String, Book> hashmap, String text) {
        for (String stringThree : hashmap.keySet()) {
            if (stringThree.contains(text)) {
            System.out.println(hashmap.get(stringThree));
            }
        }
    }
}
