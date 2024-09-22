import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.println("Nhap so tien gui: ");
        long tiengui = src.nextLong();
        System.out.println("Nhap lai suat hang nam: "); 
        double laisuat = src.nextDouble()/ 100;
        System.out.println("Nhap so thang gui: ");
        int sothang = src.nextInt();
        double tienlai = tiengui * laisuat * sothang/12;
        double tiencuoiki = tiengui + tienlai;
        System.out.println("So tien gui: " + tiengui);
        System.out.println("So tien lai trong " + sothang + " la: " + tienlai );
        System.out.println("So tien goc cuoi ki: " + tiencuoiki);
    }
}
