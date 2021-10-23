package Bai_Tap;
import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chuoi: ");
        String input = sc.nextLine();
        input = formatString(input);
        System.out.println(input);
        sc.close();
    }

    public static String formatString(String input) {
        String s1 = input.trim();
        while (s1.indexOf("  ") != -1) {
            s1 = s1.replace("  ", " ");
        }
        return s1;
    }

}