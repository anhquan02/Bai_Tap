package Bai_Tap;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chuoi: ");
        String str2 = sc.nextLine();

        String[] temp = str2.split("abc");
        System.out.println(temp.length - 1);
        sc.close();
    }

}
