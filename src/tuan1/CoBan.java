package tuan1;

import java.util.Scanner;

public class CoBan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        do {
            menu();
            int option = sc.nextInt();
            switch (option) {
                case 1:
                    bai1();
                    break;
                case 2:
                    bai2();
                    break;
                case 3:
                    bai3();
                    break;
                case 4:
                    bai4();
                    break;
                case 5:
                    bai5();
                    break;
                case 6:
                    bai6();
                    break;
                case 7:
                    bai7();
                    break;
                case 8:
                    bai8();
                    break;
                case 9:
                    bai9();
                    break;
                case 10:
                    bai10();
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
        System.out.println("1. In ra man hinh tat ca cac hop so< 100");
        System.out.println("2. In ra man hinh 20 so nguyen to dau tien");
        System.out.println("3. In ra man hinh tat ca cac so nguyen to trong khoang 1000-2000");
        System.out.println("4. In ra man hinh cac so <100 va chia het cho 3,7");
        System.out.println("5. In ra man hinh cac so nam giua 1000 va 2000 dong thoi chia het cho 3,5,7");
        System.out.println("6. In ra man hinh 5 so hoan hao dau tien");
        System.out.println("7. Bai 7");
        System.out.println("8. Cho so tu nhien N bat ky, tim và in ra uoc so nguyen to nho nhat cua N");
        System.out.println(
                "9. : Cho so tu nhien N>1 bat ky (da gan truoc do). In ra khai trien thanh tich cac so nguyen to tinh tu nho đen lon");
        System.out.println(
                "10. Cho truoc so tu nhien N bat ky (da gan truoc do). In ra man hinh tat ca cac uoc so nguyen to khac nhau cua N ");
        System.out.println("0. Thoat");
        System.out.println("---------------------------------------------");
        System.out.print("Moi chon: ");
    }

    public static boolean checkPrime(int num) {
        if (num == 1) {
            return false;
        }
        if (num == 2) {
            return true;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static boolean checkSHH(int num){
        int sum = 0;
        for(int i=1;i<=num/2;i++){
            if(num%i==0) 
                sum+=i;
        }
        if(sum==num) return true;
        return false;
    }
    public static void bai1() {
        System.out.println("---------------------------------------------");
        for (int i = 2; i < 100; i++) {
            if (!checkPrime(i)) {
                System.out.println(i);
            }
        }
    }

    public static void bai2() {
        System.out.println("---------------------------------------------");
        int count = 0;
        int num = 1;
        while (count < 20) {
            if (checkPrime(num)) {
                System.out.println(num);
                count++;
            }
            num++;
        }
    }

    public static void bai3() {
        System.out.println("---------------------------------------------");

        for (int i = 1000; i <= 2000; i++) {
            if (checkPrime(i)) {
                System.out.println(i);
            }
        }
    }

    public static void bai4() {
        System.out.println("---------------------------------------------");

        for (int i = 1; i < 100; i++) {
            if (i % 21 == 0) {
                System.out.println(i);
            }
        }
    }

    public static void bai5() {
        System.out.println("---------------------------------------------");

        for (int i = 1000; i < 2000; i++) {
            if (i % 105 == 0) {
                System.out.println(i);
            }
        }
    }

    public static void bai6() {
        System.out.println("---------------------------------------------");
        int count =0;
        int num=1;
        while(count<5){
            if(checkSHH(num)){
                System.out.println(num);
                count++;
            }
            num++;
        }
    }
    public static void bai7(){
        System.out.println("---------------------------------------------");
        int du_0=0;
        int du_1=0;
        int du_2=0;
        int du_3=0;
        for(int i =1;i<=100;i++){
            if(i%5==0){
                du_0++;
            }else if(i%5==1){
                du_1++;
            }else if(i%5==2){
                du_2++;
            }else if(i%5==3){
                du_3++;
            }
        }
        System.out.println("So chia het cho 5: "+du_0);
        System.out.println("So chia 5 du 1: "+du_1);
        System.out.println("So chia 5 du 2: "+du_2);
        System.out.println("So chia 5 du 3: "+du_3);

    }
    public static void bai8(){
        System.out.println("---------------------------------------------");

        Scanner sc =new Scanner(System.in);
        System.out.print("Nhap so N: ");
        int n=sc.nextInt();
        for(int i=2;i<n/2;i++){
            if(n%i==0 &&checkPrime(i)){
                System.out.println("So nguyen to nho nhat cua N: "+i);
            }
        }
    }
    public static void bai9(){
        System.out.println("---------------------------------------------");

        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so N: ");
        int n = sc.nextInt();
        for(int i =2;i<=n;i++){
            if(n%i==0 && checkPrime(i)){
                System.out.print(i+".");
                n/=i;
                i--;
            }
        }
        System.out.print("\b   \n");
        
    }
    public static void bai10(){
        System.out.println("---------------------------------------------");

        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so N: ");
        int n = sc.nextInt();
        for(int i =2;i<=n;i++){
            if(n%i==0 && checkPrime(i)){
                System.out.print(i+"-");                                
            }
        }
        System.out.print("\b   \n");
    }
}
