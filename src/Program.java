import java.util.HashMap;

public class Program {
    private HashMap<String, String> hashmap;

    public Program() {
        this.hashmap = new HashMap<>();
    }

    public static void printKeys(HashMap<String, String> hashmap) {
        for (String keyTime : hashmap.keySet()) {
            System.out.println(keyTime);
        }
    }
    public static void printKeysWhere(HashMap<String, String> hashmap, String text) {
        for (String anotherKeyTime : hashmap.keySet()) {
        if (anotherKeyTime.contains(text)) {
            System.out.println(anotherKeyTime);;
        }
        }
    }
    public static void printValuesOfKeysWhere(HashMap<String, String> hashmap, String text) {
        for (String stringThree : hashmap.keySet()) {
            if (stringThree.contains(text)) {
                System.out.println(hashmap.get(stringThree));
            }
        }
    }

}
