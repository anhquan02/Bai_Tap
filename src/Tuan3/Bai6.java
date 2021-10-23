package Bai_Tap;

public class Bai6 {
    public static void main(String[] args) {

        String str = "Le Anh Quan", nstr = "";
        char ch;
        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            nstr = ch + nstr;
        }
        System.out.println("Reversed word: " + nstr);
    }
}
