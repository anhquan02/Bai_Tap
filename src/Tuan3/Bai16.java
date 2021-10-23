package Bai_Tap;

import java.util.Scanner;

public class Bai16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chuoi 1: ");
        String str1 = sc.nextLine();
        System.out.println("Nhap chuoi 2: ");
        String str2 = sc.nextLine();
        System.out.println(str2.contains(str1));
    }
}
