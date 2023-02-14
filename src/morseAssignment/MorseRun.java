package morseAssignment;

import java.util.Scanner;


//För try/catch out of memory och integer max

public class MorseRun {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        Morse mt = new Morse();

        String input = "";

        System.out.printf("%n%s", "## ------- Program for translating English to Morse and vice versa -------- ##");
        System.out.printf("%n%s", "## ------------------------------------------------------------------------ ##");
        System.out.printf("%n%s", "## - Morse code represented with star (*) for short and dash (-) for long - ##");
        System.out.printf("%n%s", "## ---- Word spaces in morse represented with spaces and a pipe ( | ) ----- ##");
        System.out.printf("%n%s", "## -------------- Non-translated characters represented by ¤ -------------- ##");
        System.out.printf("%n%s", "## ----- Enter either English or Morse to be translated on row below ------ ##");
        System.out.printf("%n%s","### (!!! to exit): ");

        input = kb.nextLine();

        while(!input.equals("!!!")){

            input = mt.translate(input);

            if(!input.equals("")){
                System.out.printf("%n%s%s", "Translated text: ", input);
            } else{
                System.out.printf("%n%s", "Unable to translate one or more characters.");
            }

            System.out.printf("%n%s", "Enter either english or morse to be translated: ");
            input = kb.nextLine();
        }
    }
}
