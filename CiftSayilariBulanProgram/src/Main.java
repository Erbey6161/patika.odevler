import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan
        3 ve 4'e tam bölünen sayıların ortalamasını hesaplayan programı yazınız.
         */

        int a , toplam = 0, ort = 0, sayi = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz : ");
        a = scanner.nextInt();

        for (int i = 0; i < a ; i++) {
            if (i%3==0 && i%4==0) {
                toplam = toplam + i;
                sayi ++;
            }
            i++;
        }
       ort = toplam/sayi;
        if (toplam != 0) {
               System.out.println("0 dan "+ sayi + "  sayısına kadar olan 3 ve 4 de bölünebilen sayıların ortalaması:" + ort);
        }else {
               System.out.println("0 dan "+ sayi + " kadar olan sayılarda 3 ve 4 bölünebilen sayılar yoktur ");
        }

    }
}