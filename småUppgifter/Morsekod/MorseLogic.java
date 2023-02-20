package Morsekod;


import java.util.HashMap;

public class MorseLogic {
    static String[] englishLetters = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "1", "2", "3", "4", "5", "6", "7", "8", "9", "0", "!", ",", "?", ".", "'", " "};
    static String[] Morsecode = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", ".----", "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.", "-----", "-.-.--", "--..--", "..--..", ".-.-.-", ".----.", " "};

    private String letters;
    private String upperLetter;

    private static String myMorse;
    private static String myLetters;

    public MorseLogic() {
        letters = "";
        upperLetter = "";
        myMorse = "";
        myLetters = "";
    }


    public String getMorseToEnglish() {

        return myLetters;
    }

    public String getEnglishToMorse() {

        return myMorse;
    }

    public String getLetters() {

        return letters;
    }

    public String getUpperLetter() {

        return upperLetter;
    }

    public static HashMap<String, String> LettersToMorse = new HashMap<>();
    public static HashMap<String, String> MorseToLetters = new HashMap<>();

    static {
        for (int i = 0; i < englishLetters.length && i < Morsecode.length; i++) {
            LettersToMorse.put(englishLetters[i], Morsecode[i]);
            MorseToLetters.put(Morsecode[i], englishLetters[i]);
        }
    }


    public void TranslatFromEnglish(String input) {


        String[] character = input.split("");
        for (int i = 0; i < input.length(); i++) {

            upperLetter = input.toUpperCase();
            letters = letters + upperLetter.charAt(i);
            character[i] = String.valueOf(upperLetter.charAt(i));

            if (LettersToMorse.get(character[i]) == null) {


                System.out.println("PLease use english letters only");
                break;
            }
            myMorse = myMorse + LettersToMorse.get(character[i]) + " ";

        }

    }


    public void TranslateFromMorse(String input) {


        String[] character = input.split(" ");


        for (int i = 0; i < character.length; i++) {

            if (MorseToLetters.get(character[i]) == null) {
                System.out.println("Please use: " + ". & - " + "only");
                break;
            }

            myLetters = myLetters + MorseToLetters.get(character[i]);

        }


    }
}





