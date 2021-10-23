package Bai_Tap;

import java.util.Scanner;

public class Bai15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chuoi 1: ");
        String str1 = sc.nextLine();
        System.out.println("Nhap chuoi 2: ");
        String str2 = sc.nextLine();
        int i = str2.length() / 2;
        String left = str2.substring(0, i);
        String right = str2.substring(i);
        System.out.println(left + str1 + right);
    }
}
