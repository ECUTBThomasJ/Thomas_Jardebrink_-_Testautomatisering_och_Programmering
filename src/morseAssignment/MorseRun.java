package morseAssignment;

import java.util.Scanner;

public class MorseRun {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        Morse mt = new Morse();

        String input = "";

        System.out.printf("%n%s", "## ------- Program for translating English to Morse and vice versa -------- ##");
        System.out.printf("%n%s", "## ------------------------------------------------------------------------ ##");
        System.out.printf("%n%s", "## - Morse code represented with star (*) for short and dash (-) for long - ##");
        System.out.printf("%n%s", "## ---- Word spaces in morse represented with spaces and a pipe ( | ) ----- ##");
        System.out.printf("%n%s", "## ----- Enter either English or Morse to be translated on row below ------ ##");
        System.out.printf("%n%s", "### (!!! to exit): ");

        input = kb.nextLine();

        while (!input.equals("!!!")) {

            input = mt.translate(input);

            if (!input.equals("### - Invalid Input - ###")) {
                System.out.printf("%n%s%s", "Translated text: ", input);
            } else {
                System.out.printf("%n%s", "Unable to translate one or more characters.");
                System.out.printf("%n%s", "Please use only *, - and | for Morse, and only");
                System.out.printf("%n%s%n", "letters (A-Z), numbers (0-9) and . , ? for English.");
            }

            System.out.printf("%n%s", "Enter either English or Morse to be translated: ");
            input = kb.nextLine();
        }
    }
}
