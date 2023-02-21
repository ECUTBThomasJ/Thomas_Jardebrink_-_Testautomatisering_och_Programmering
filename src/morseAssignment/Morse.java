package morseAssignment;

import java.util.HashMap;

public class Morse {

    private String[] englishChars = new String[]{"A", "B", "C", "D", "E", "F",
            "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T",
            "U", "V", "W", "X", "Y", "Z", "1", "2", "3", "4", "5", "6", "7", "8", "9",
            "0", ".", ",", "?", " "};

    private String[] morseChars = new String[]{"*-", "-***", "-*-*", "-**", "*", "**-*",
            "--*", "****", "**", "*---", "-*-", "*-**", "--", "-*", "---", "*--*", "--*-",
            "*-*", "***", "-", "**-", "***-", "*--", "-**-", "-*--", "--**", "*----",
            "**---", "***--", "****-", "*****", "-****", "--***", "---**", "----*", "-----",
            "*-*-*-", "--**--", "**--**", "|"};

    private HashMap<String, String> morseMap = new HashMap<>();

    public Morse() {
        for (int i = 0; i < morseChars.length; i++) {
            morseMap.put(englishChars[i], morseChars[i]);
            morseMap.put(morseChars[i], englishChars[i]);
        }
    }

    public String translate(String input) {

        input = input.toUpperCase();

        String output = "";

        if (isMorse(input)) {
            String[] morseLetters = input.split(" ");
            for (int i = 0; i < morseLetters.length; i++) {
                output += morseMap.get(morseLetters[i]);
            }

        } else if (isEnglish(input)) {
            String[] englishLetters = input.split("");
            for (int i = 0; i < englishLetters.length; i++) {
                if (i == (englishLetters.length - 1)) {
                    output += morseMap.get(englishLetters[i]);
                } else {
                    output += (morseMap.get(englishLetters[i]) + " ");
                }
            }
        } else {
            output = "### - Invalid Input - ###";
        }
        return output;
    }

    private boolean isEnglish(String input) {
        boolean english = true;

        for (int i = 0; i < input.length(); i++) {
            if (!((input.charAt(i) >= 'A' && input.charAt(i) <= 'Z') || (input.charAt(i) >= '0'
                    && input.charAt(i) <= '9') || (input.charAt(i) == '.') || (input.charAt(i) == ',')
                    || (input.charAt(i) == '?') || (input.charAt(i) == ' '))) {
                english = false;
            }
        }

        String[] englishChars = input.split("");
        for (int i = 0; i < englishChars.length; i++) {
            if (morseMap.get(englishChars[i]) == null) {
                english = false;
            }
        }
        return english;
    }

    private boolean isMorse(String input) {
        boolean morse = true;

        for (int i = 0; i < input.length(); i++) {
            if (!((input.charAt(i) == '*') || (input.charAt(i) == '-')
                    || (input.charAt(i) == ' ') || (input.charAt(i) == '|'))) {
                morse = false;
            }
        }

        String[] morseCode = input.split(" ");
        for (int i = 0; i < morseCode.length; i++) {
            if (morseMap.get(morseCode[i]) == null) {
                morse = false;
            }
        }
        return morse;
    }
}
