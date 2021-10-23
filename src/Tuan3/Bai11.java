package Bai_Tap;

import java.util.Scanner;

public class Bai11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong mang: ");
        int n = Integer.parseInt(sc.nextLine());
        String[] arr = new String[n];
        int dem = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap ten thu: " + (i + 1));
            arr[i] = sc.nextLine();
            if (getTen(arr[i]).equalsIgnoreCase("An")) {
                dem++;
            }
        }
        System.out.println("Co " + dem + " ten An");
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
