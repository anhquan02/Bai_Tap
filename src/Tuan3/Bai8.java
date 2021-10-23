package Bai_Tap;

import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chuoi thu nhat");
        String str1 = sc.nextLine();
        System.out.println("Nhap chuoi thu hai");
        String str2 = sc.nextLine();

        String[] temp = str2.split(str1);
        System.out.println(temp.length - 1);
        sc.close();
    }
}
