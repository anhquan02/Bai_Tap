package Bai_Tap;

import java.util.Scanner;

public class Bai10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong mang: ");
        int n = Integer.parseInt(sc.nextLine());
        String[] arr = new String[n];
        int max = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap chuoi thu: " + (i + 1));
            arr[i] = sc.nextLine();
            max = max < arr[i].length() ? arr[i].length() : max;
        }
        for (int i = 0; i < n; i++) {
            if (arr[i].length() == max) {
                System.out.println("Chuoi dai nhat: " + arr[i]);
            }
        }

    }
}
