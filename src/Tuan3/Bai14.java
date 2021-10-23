package Bai_Tap;

import java.util.Scanner;

public class Bai14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n: ");
        int n = Integer.parseInt(sc.nextLine());
        System.out.println(getString(n));
    }

    public static String getString(int n) {
        String S1 = "1111100000";
        while (n != 1) {
            String[] arr = S1.split("");
            String temp = arr[9];
            for (int i = 9; i > 0; i--) {
                int j = i - 1;
                arr[i] = arr[j];
            }
            arr[0] = temp;
            S1 = String.join("", arr);
            n--;
        }
        return S1;
    }

}
