package Morsekod;

import java.util.Scanner;

public class MorsekodMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean mybool= true;
        while (mybool) {
            System.out.println("Press 1 to translate from English to morse");
            System.out.println("Press 2 to translate from morse to English");


            MorseLogic morseTranslation = new MorseLogic();

            try {

                switch (Integer.parseInt(scan.nextLine())) {


                    case 1:
                        System.out.println("Please enter your words");
                        String text = scan.nextLine();


                        morseTranslation.TranslatFromEnglish(text);
                        System.out.println(morseTranslation.getEnglishToMorse());
                        mybool=false;
                        break;
                    case 2:
                        System.out.println("Please enter your morse");
                        text = scan.nextLine();

                        morseTranslation.TranslateFromMorse(text);
                        System.out.println(morseTranslation.getMorseToEnglish());
                        mybool=false;
                        break;
                    default:
                        System.out.println("please choose 1 or 2");

                }

            } catch (NumberFormatException e) {
                System.out.println("This was a NumberFormatException: " + e.getMessage());
            }


        }
    }
}
