package Bai_Tap;

import java.util.Scanner;

public class Bai9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chuoi");
        String str = sc.nextLine();
        System.out.println("Nhap i: ");
        int i = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap j: ");
        int j = Integer.parseInt(sc.nextLine());
        String[] arr = str.split("");
        String temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        str = String.join("", arr);
        System.out.println(str);

    }
}
