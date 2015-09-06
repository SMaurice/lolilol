package fr.john;
/**
 * Created by John on 06/09/2015.
 */
public class Beer {

    private int max;

    public Beer(int maximum) {
        max = maximum;
    }

    public String fizzbuzz() {
        return fizzbuzz(max);
    }

    public static String fizzbuzz(int max) {
        int j = 1;
        String sortie="";


        do {
            if (j % 3 == 0) {
                sortie = sortie + "Buzz ";
            }
            if (j % 5 == 0) {
                sortie = sortie + "Fizz ";
            }

            j += 1;
        }
        while (j <= max);

        return sortie;
    }

}
