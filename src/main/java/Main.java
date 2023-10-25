import øvelse7.Keyword;
import øvelse8.Card;
import øvelse9.Bil;
import øvelse9.Trailer;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("----------------------Keyword----------------------");

        Keyword keyword = new Keyword("Apple","Edible Fruit");
        ArrayList<Keyword> appleKeywords = new ArrayList<>(Arrays.asList(
                new Keyword("Pineapple","Edible Fruit with hard shell"),
                new Keyword("Pomegranate","Edible Fruit with small pods")));
        keyword.setKeywords(appleKeywords);

        String searchWord1 = "Apple";
        if (keyword.matches(searchWord1)){
            System.out.println(keyword.getWord()+" matches "+searchWord1);
        } else System.out.println(keyword.getWord()+" doesn't match "+searchWord1);

        String searchWord2 = "Pear";
        if (keyword.matches(searchWord2)){
            System.out.println(keyword.getWord()+" matches "+searchWord2);
        } else System.out.println(keyword.getWord()+" doesn't match "+searchWord2);

        System.out.println("See also:\n"+keyword.seeAlso());

        System.out.println("\n----------------------Card----------------------");

        Card cardBadConstruct = new Card("hartz",15);
        Card diamonds4 = new Card("diamonds",4);
        System.out.println(cardBadConstruct); //should be defaulted to hearts-1
        System.out.println("testing normal beats method");
        System.out.println(diamonds4+" vs "+cardBadConstruct+" --- wins? "+
                cardBadConstruct.beats(diamonds4));

        System.out.println("testing suit-beats method");
        Card spade11 = new Card("spades",11);
        Card hearts9 = new Card("hearts",9);
        Card diamonds12 = new Card("diamonds",12);
        Card clubs3 = new Card("clubs",3);


        System.out.println(spade11+" vs "+hearts9+" --- wins? "+hearts9.beatsSuit(spade11));
        System.out.println(hearts9+" vs "+diamonds12+" --- wins? "+diamonds12.beatsSuit(hearts9));
        System.out.println(diamonds12+" vs "+clubs3+" --- wins? "+clubs3.beatsSuit(diamonds12));
        System.out.println(clubs3+" vs "+spade11+" --- wins? "+spade11.beatsSuit(clubs3));
        System.out.println(clubs3+" vs "+hearts9+" --- wins? "+hearts9.beatsSuit(clubs3));

        System.out.println("\n----------------------Bil&Trailer----------------------");

        Bil bil = new Bil(1500);
        Trailer trailer1 = new Trailer(1500);
        Trailer trailer2 = new Trailer(2700);

        if(bil.attachTrailer(trailer1)){
            System.out.println("Weight of Bil + Trailer: "+bil.getTotalWeight());
        }else System.out.println("Can't attach trailer!");

        if(bil.attachTrailer(trailer2)){
            System.out.println("Weight of Bil + Trailer: "+bil.getTotalWeight());
        }else System.out.println("Can't attach trailer!");

    }
}
