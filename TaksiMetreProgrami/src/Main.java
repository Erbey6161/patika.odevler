import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.

        Taksimetre KM başına 2.20 TL tutmaktadır.
        Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
        Taksimetre açılış ücreti 10 TL'dir.*/

        Scanner scanner = new Scanner(System.in);
        System.out.print("lütfen gidilecek mesafeyi giriniz = ");
        double msf = scanner.nextDouble();
        double km = 2.20;

        double baslangic = 10;
        double toplam = (msf*km) + baslangic;

        if (toplam < 20){
            System.out.println("Toplam ücret = 20 TL ");
        }else {
            System.out.println("Toplam Ücret =" + toplam + " TL'dir");
        }

        System.out.println("İyi Günler Dileriz!");
    }
}