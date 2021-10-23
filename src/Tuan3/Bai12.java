package Bai_Tap;

import java.util.Scanner;

public class Bai12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong mang: ");
        int n = Integer.parseInt(sc.nextLine());
        String[] arr = new String[n];
        int dem = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap ten thu: " + (i + 1));
            arr[i] = sc.nextLine();
            String[] arr_split = arr[i].split(" ");
            for (int j = 0; j < arr_split.length; j++) {
                if (arr_split[j].equalsIgnoreCase("Thi")) {
                    dem++;
                }
            }
        }

        System.out.println("Co " + dem + " nguoi co ten dem la Thi");
    }
}
