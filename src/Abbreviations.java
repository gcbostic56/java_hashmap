import java.util.HashMap;

public class Abbreviations {
    private HashMap<String, String> Abbreviations;

    public Abbreviations() {
       this.Abbreviations = new HashMap<>();
    }

    public void addAbbreviation(String abbreviation, String explanation) {
        Abbreviations.put(abbreviation, explanation);
    }

    public boolean hasAbbreviation(String abbreviation) {
        return this.Abbreviations.containsKey(abbreviation);
    }

    public String findExplanationFor(String abbreviation) {
        return this.Abbreviations.get(abbreviation);
    }
   
}
