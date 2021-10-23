package Bai_Tap;

public class Bai5 {
    public static void main(String[] args) {
        String str = "0000010";
        String[] arr = str.split("");
        String result = "";
        for (String a : arr) {
            if (a.equals("0")) {
                result += "1";
            } else {
                result += "0";
            }
        }
        System.out.println(result);
    }
}
