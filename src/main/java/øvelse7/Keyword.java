package øvelse7;

import java.util.ArrayList;

public class Keyword {
    private String word;
    private String definition;
    private ArrayList<Keyword> keywords;

    public Keyword (String word, String definition){
        this.word = word;
        this.definition = definition;
    }

    public String getWord(){
        return word;
    }

    public String getDefinition(){
        return definition;
    }

    public boolean matches(String searchWord){
        return searchWord.equalsIgnoreCase(word);
    }

    public void setKeywords(ArrayList<Keyword> keywords){
        this.keywords = keywords;
    }

    public String seeAlso(){
        StringBuilder string = new StringBuilder();
        string.append(word + " : "+definition);

        for (Keyword keyword: keywords) {
            string.append("\n"+keyword.word + " : "+keyword.definition);
        }

        return string.toString().trim();
    }
}
