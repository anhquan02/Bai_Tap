package Bai_Tap;

public class Bai3 {
    public static void main(String[] args) {
        System.out.println(getTen("le anh quan"));
    }

    public static String getTen(String input) {
        String str = input.substring(input.lastIndexOf(" ") + 1);
        String firstLetter = str.substring(0, 1);
        String remainingLetters = str.substring(1, str.length());

        firstLetter = firstLetter.toUpperCase();

        str = firstLetter + remainingLetters;
        return str;

    }
}
