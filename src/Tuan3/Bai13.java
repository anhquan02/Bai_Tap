package Bai_Tap;

import java.util.Scanner;

public class Bai13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong mang: ");
        int n = Integer.parseInt(sc.nextLine());
        String[] arr = new String[n];
        int dem = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap ten thu: " + (i + 1));
            arr[i] = sc.nextLine();
            if (getTen(arr[i])) {
                dem++;
            }
        }
        System.out.println("Co " + dem + " nguoi ten bat dau voi H");
    }

    public static boolean getTen(String input) {
        String str = input.substring(input.lastIndexOf(" ") + 1);
        String firstLetter = str.substring(0, 1);

        firstLetter = firstLetter.toUpperCase();
        return firstLetter.equals("H");

    }
}
