package Bai_Tap;

public class Bai7 {
    public static void main(String[] args) {
        String str = "abfaj41nkj41o1";
        String[] arr = str.split("");
        String result = "";
        for (String a : arr) {
            if (a.matches("[0-9]")) {
                result += "$";
            } else {
                result += a;
            }
        }
        System.out.println(result);
    }
}
