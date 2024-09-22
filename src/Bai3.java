
import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.println("Nhap gia tri so nguyen a: ");
        int a = src.nextInt();
        System.out.println("Nhap gia tri so nguyen b: ");
        int b = src.nextInt();
        long tong = a + b;
        int hieu = a - b;
        long tich = (long)a*b;
        double thuong = (double)a/b;
        int phandu = a%b;
        System.out.println("Tong hai so nguyen a va b la: " + tong);
        System.out.println("Hieu hai so nguyen a va b la: " + hieu);
        System.out.println("Tich hai so nguyen a va b la: " + tich);
        System.out.println("Thuong cua a cho b la: " + thuong);
        System.out.println("So du a chia cho b la: " + phandu);
    }
}
