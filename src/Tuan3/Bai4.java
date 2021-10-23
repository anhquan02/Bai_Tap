package Bai_Tap;

public class Bai4 {
    public static void main(String[] args) {
        System.out.println(getTen("le anh quan"));
    }

    public static String getTen(String input) {
        String str = input.substring(0, +input.indexOf(" "));
        String firstLetter = str.substring(0, 1);
        String remainingLetters = str.substring(1, str.length());

        firstLetter = firstLetter.toUpperCase();

        str = firstLetter + remainingLetters;
        return str;

    }
}
