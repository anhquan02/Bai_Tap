package tuan2;

import java.util.Scanner;

public class Mang {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
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
                case 11:
                    bai11();
                    break;
                case 12:
                    bai12();
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
        System.out.println("1. Sap xep day so giam dan");
        System.out.println("2. In ra man hinh so nguyen to trong day");
        System.out.println(
                "3. Cho một dãy các số tự nhiên, tìm và in ra 1 giá trị min của dãy này và tất cả các chỉ số ứng với giá trị min này.");
        System.out.println(
                "4. Cho một dãy các số tự nhiên, tìm và in ra 1 giá trị max của dãy này và tất cả các chỉ số ứng với giá trị max này.");
        System.out.println(
                "5. Cho một dãy số tự nhiên, hãy đếm xem trong dãy số trên có bao nhiêu số nguyên tố, có bao nhiêu hợp số.");
        System.out.println(
                "6. Cho một dãy số tự nhiên, hãy in ra tất cả các số hạng của dãy trên thỏa mãn: số này là ước số thực sự của 1 số hạng khác trong dãy trên.");
        System.out.println(
                "7. Cho một dãy số tự nhiên, hãy tìm 1 số tự nhiên nhỏ nhất c không bằng bất cứ số nào trong dãy trên.");
        System.out.println(
                "8. Cho một dãy số nguyên bất kỳ, hãy xóa đi trong dãy này các số hạng =0 và in ra màn hình các số còn lại.");
        System.out.println(
                "9. Cho một dãy số nguyên bất kỳ, cho trước 1 số c. Hãy đếm có bao nhiêu số của dãy trên =c; >c; <c.");
        System.out.println(
                "10. Cho một dãy số nguyên bất kỳ, hãy tìm ra 1 một dãy số liền nhau dài nhất bao gồm các số bằng nhau. Hãy in ra số lượng và các chỉ số đầu tiên của dãy con này.");
        System.out.println(
                "11. Cho một dãy số nguyên bất kỳ. Hãy tìm 1 một dãy con liên tục đơn điệu tăng dài nhất của dãy trên.");
        System.out.println(
                "12. Dãy số a[ ] được gọi là dãy con của b[ ] nếu từ b [ ] xóa đi 1 vài số sẽ thu được   a[ ]. Cho trước 2 dãy số nguyên a[ ]; b[ ]. Hãy kiểm tra xem a[ ] có là dãy con của b[ ] hay không?.");
        System.out.println("0. Thoat");
        System.out.println("---------------------------------------------");
        System.out.print("Moi chon: ");
    }

    public static boolean checkPrime(int num) {
        if (num == 1 || num == 0) {
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

    public static boolean checkSHH(int num) {
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0)
                sum += i;
        }
        if (sum == num)
            return true;
        return false;
    }

    public static int[] sapXep(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public static void bai1() {
        System.out.println("---------------------------------------------");
        System.out.println("Nhap so phan tu trong mang");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Gia tri arr" + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.printf("\t %d", arr[i]);
        }
    }

    public static void bai2() {
        System.out.println("---------------------------------------------");
        System.out.println("Nhap so phan tu trong mang");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Gia tri arr" + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (checkPrime(arr[i])) {
                System.out.printf("%d\t", arr[i]);
            }
        }
        System.out.println();
    }

    public static void bai3() {
        System.out.println("---------------------------------------------");

        System.out.println("Nhap so phan tu trong mang");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Gia tri arr" + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
        int min = arr[0];
        for (int i = 0; i < n; i++) {
            min = min < arr[i] ? min : arr[i];
        }
        System.out.println("Gia tri nho nhat: " + min);
        for (int i = 0; i < n; i++) {
            if (arr[i] == min) {
                System.out.println("chi so: " + (i + 1));
            }
        }
    }

    public static void bai4() {
        System.out.println("---------------------------------------------");
        System.out.println("Nhap so phan tu trong mang");
        int n = sc.nextInt();
        int arr[] = new int[n];
        int max = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("Gia tri arr" + (i + 1) + ": ");
            arr[i] = sc.nextInt();
            max = max > arr[i] ? max : arr[i];
        }
        System.out.println("Gia tri lon nhat: " + max);
        for (int i = 0; i < n; i++) {
            if (arr[i] == max) {
                System.out.println("chi so: " + (i + 1));
            }
        }
    }

    public static void bai5() {
        System.out.println("---------------------------------------------");

        System.out.println("Nhap so phan tu trong mang");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Gia tri arr" + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
        int countSNT = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (checkPrime(arr[i])) {
                countSNT++;
            }
            if (arr[i] == 0 || arr[i] == 1) {
                count--;
            }
        }
        int countHS = n - countSNT + count;
        System.out.printf("So nguyen to: %d\nHop so: %d\n", countSNT, countHS);
    }

    public static void bai6() {
        System.out.println("---------------------------------------------");
        System.out.println("Nhap so phan tu trong mang");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Gia tri arr" + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
        arr = sapXep(arr);
        System.out.println("UC thực");
        for (int i = 0; i < n; i++) {
            for (int j = n - 1; j > i; j--) {
                if (arr[j] % arr[i] == 0) {
                    System.out.println(arr[i]);
                }
            }
        }
    }

    public static void bai7() {
        System.out.println("---------------------------------------------");
        System.out.println("Nhap so phan tu trong mang");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Gia tri arr" + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
        arr = sapXep(arr);
        int min = arr[0];
        if (min == 0 || min == 1) {
            System.out.println("Khong ton tai");
        } else {
            System.out.println("So nho nhat la: " + (min - 1));
        }
    }

    public static void bai8() {
        System.out.println("---------------------------------------------");

        System.out.println("Nhap so phan tu trong mang");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Gia tri arr" + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
        int arr2[] = new int[n];
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr2[j] = arr[i];
                j++;
            }
        }
        System.out.println("-------------------------");
        for (int i = 0; i < j; i++) {
            System.out.println(arr2[i]);
        }

    }

    public static void bai9() {
        System.out.println("---------------------------------------------");

        System.out.println("Nhap so phan tu trong mang");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Gia tri arr" + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Nhập c: ");
        int c = sc.nextInt();
        int bang = 0, lon = 0, nho = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] < c) {
                nho++;
            } else if (arr[i] > c) {
                lon++;
            } else {
                bang++;
            }
        }
        System.out.println("Co " + nho + " so nho hon " + c);
        System.out.println("Co " + lon + " so lon hon " + c);
        System.out.println("Co " + bang + " so bang " + c);

    }

    public static void bai10() {
        System.out.println("---------------------------------------------");

        System.out.println("Nhap so phan tu trong mang");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Gia tri arr" + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
        int max = 1, count = 1;
        for (int i = 0; i < n - 1; i++) {
            count = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    if (count > max) {
                        max = count;
                    }
                } else {
                    break;
                }
            }
        }
        System.out.println("So luong cua day trung nhau: " + max);
        for (int i = 0; i < n - 1; i++) {
            count = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    if (max == count) {
                        System.out.println("Vitri: " + i);
                    }
                } else {
                    break;
                }
            }
        }
    }

    public static void bai11() {
        System.out.println("---------------------------------------------");

        System.out.println("Nhap so phan tu trong mang");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Gia tri arr" + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
        int max = 1, count = 1, vitri = 0;
        for (int i = 0; i < n - 1; i++) {
            count = 1;
            for (int j = i; j < n-1; j++) {
                if (arr[j] < arr[j+1]) {
                    count++;
                    if (count > max) {
                        max = count;
                        vitri = j - max + 2;
                    }
                } else {
                    break;
                }
            }
        }
        System.out.println("Do dai cua day: " + max);
        for (int i = vitri; i < vitri + max; i++) {
            System.out.println("\t" + arr[i]);
        }
    }
    public static void bai12(){
        int a[]=new int[]{1,2,3,4,5,6,7,8};
        int b[]=new int[]{1,2,3,4,12};
        int sizeOfA=a.length;
        int sizeOfB=b.length;
        if(isAContainB(a, b, sizeOfA, sizeOfB)){
            System.out.println("b là dãy con của a");
        }else{
            System.out.println("b không là dãy con của a");
        }
    }
    public static boolean isAContainB(int a[],int b[],int sizeOfA, int sizeOfB){
        boolean response=false;
        int k=0;
        if(sizeOfA<sizeOfB){
            return false;
        }
        for(int i = 0; i<sizeOfA;i++){
            if(b[0]==a[i]&& sizeOfA-i>=sizeOfB){
                k=i+1;
                response=true;
                for(int j=1;j<sizeOfB;j++,k++){
                    if(b[j]!=a[k]){
                        response=false;
                        break;
                    }
                }
                if(response){
                    break;
                }
            }
        }
        return response;

    }
}
