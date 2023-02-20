package Morsekod;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MorsekodTest {


    @org.junit.jupiter.api.Test
    public void UpperCaseLetters() {
        MorseLogic myLetters = new MorseLogic();

        //act
        myLetters.TranslatFromEnglish("hej");

        String actual = myLetters.getUpperLetter();
        String expected = "HEJ";

        //Assert
        assertEquals(expected, actual);

    }

    @org.junit.jupiter.api.Test
    public void splitCharacters() {
        MorseLogic myLetters = new MorseLogic();

        //act
        myLetters.TranslatFromEnglish("hej");

        String actual = myLetters.getLetters();
        String expected = "H" + "E" + "J";

        //Assert
        assertEquals(expected, actual);
    }


    @org.junit.jupiter.api.Test
    public void TranslateToEnglish() {
        MorseLogic myLetters = new MorseLogic();

        //act
        myLetters.TranslatFromEnglish("a");

        String actual = myLetters.getEnglishToMorse();
        String expected = ".- ";

        //Assert
        assertEquals(expected, actual);

    }

    @org.junit.jupiter.api.Test
    public void TranslateToEnglish3Letters() {
        MorseLogic myLetters = new MorseLogic();

        //act
        myLetters.TranslatFromEnglish("aac");

        String actual = myLetters.getEnglishToMorse();
        String expected = ".- .- -.-. ";

        //Assert
        assertEquals(expected, actual);

    }

    @org.junit.jupiter.api.Test
    public void TranslateToMorse() {
        MorseLogic myLetters = new MorseLogic();

        //act
        myLetters.TranslateFromMorse(".-");

        String actual = myLetters.getMorseToEnglish();
        String expected = "A";

        //Assert
        assertEquals(expected, actual);

    }

    @org.junit.jupiter.api.Test
    public void TranslateToMorse2Morse() {
        MorseLogic myLetters = new MorseLogic();

        //act
        myLetters.TranslateFromMorse(".- .-");

        String actual = myLetters.getMorseToEnglish();
        String expected = "AA";

        //Assert
        assertEquals(expected, actual);

    }


}
