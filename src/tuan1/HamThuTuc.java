package tuan1;

import java.util.Scanner;

public class HamThuTuc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        do {
            menu();
            int option = sc.nextInt();
            int n;
            System.out.print("Nhap N: ");
            switch (option) {
                case 1:
                    n = sc.nextInt();
                    System.out.printf("Dap an: %.2f \n" , calBai1(n));
                    break;
                case 2:
                    n = sc.nextInt();
                    System.out.printf("Dap an: %.2f \n" , calBai2(n));
                    break;
                case 3:
                    n = sc.nextInt();
                    System.out.printf("Dap an: %.2f \n" , calBai3(n));
                    break;
                case 4:
                    n = sc.nextInt();
                    System.out.printf("Dap an: " + calBai4(n)+"\n");
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Khong hop le!");
            }
        } while (true);
    }

    public static void menu() {
        System.out.println("---------------------------------------------");
        System.out.println("1. Cho số tự nhiên N bất kỳ. Tính tổng S=1+1/(1+2) + 1/(1+2+3) +…+ 1/(1+2+3+..+N)");
        System.out.println("2. Cho số tự nhiên N bất kỳ, tính tổng S= 1+ 1/2! + 1/3! + … + 1/N!");
        System.out.println("3. Cho số tự nhiên N bất kỳ,tính tổng S=1+1/(1+2!) + 1/(1+2!+3!)+ ..+ 1/(1+2!+3!+..+N!)");
        System.out.println("4. So thu N trong day fibonaxi");
        System.out.println("0. Thoat");
        System.out.println("---------------------------------------------");
        System.out.print("Moi chon: ");
    }

    public static long tinhTong(int n) {
        long sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static double calBai1(int n) {
        double sum = 0;
        long temp = 0;
        for (int i = 1; i <= n; i++) {
            temp = tinhTong(i);
            sum = sum + (double) 1 / temp;
        }
        return sum;
    }

    public static double calBai2(int n) {
        double sum = 0;
        long p = 1;
        for (int i = 1; i <= n; i++) {
            p = p * i;
            sum = sum + (double) 1 / +p;
        }
        return sum;
    }

    public static double calBai3(int n) {
        double sum = 0;
        long p = 1;
        long temp = 0;
        for (int i = 1; i <= n; i++) {
            p = p * i;
            sum = sum + (double) 1 / (temp + p);
            temp = p;
        }
        return sum;
    }

    public static long calBai4(int n) {
        int f1 = 1, f2 = 1;
        if (n == 1 || n == 2) {
            return 1;
        }
        return calBai4(n - 1) + calBai4(n - 2);
    }
}
