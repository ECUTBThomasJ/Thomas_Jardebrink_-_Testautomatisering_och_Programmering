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

    public Morse(){
        for (int i = 0; i < morseChars.length; i++){
            morseMap.put(englishChars[i], morseChars[i]);
            morseMap.put(morseChars[i], englishChars[i]);
        }
    }
    public String translate(String input){
        String output = "";

        //Någon form av koll om det är bokstäver eller siffror.
      /*  for (int i = 0; i < input.length(); i++) {
            input.charAt(i)
        }*/

        if ((input.contains("*") || input.contains("-"))){
            String[] morseLetters = input.split(" ");
            String[] translated = new String[morseLetters.length];
            for (int i = 0; i < morseLetters.length; i++) {
                translated[i] = morseMap.get(morseLetters[i]);
                if(translated[i] != null){
                    output += (translated[i]);
                }else{
                    output += "#";
                }
            }

        }else{
            String[] englishLetters = input.split("");
            String[] translated = new String[englishLetters.length];
            for (int i = 0; i < englishLetters.length; i++) {
                translated[i] = morseMap.get(englishLetters[i]);
                if(translated[i] != null){
                    if(i == (englishLetters.length - 1)){
                        output += (translated[i]);
                    }else{
                        output += (translated[i] + " ");
                    }
                }else {
                    output += "#";
                }
            }
        }
        return output;
    }
}
