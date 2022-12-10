import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*Kaç tane sayı gireceksiniz: 4
        1. Sayıyı giriniz: 16
        2. Sayıyı giriniz: -22
        3. Sayıyı giriniz: -15
        4. Sayıyı giriniz: 100
        En büyük sayı: 100
        En küçük sayı: -22*/
        int maks=0;
        int min=0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz: ");
        int g = scanner.nextInt();
        System.out.println("Sayları arka arkaya giriniz!");
        

        for (int i = 1; i <= g; i++) {
            System.out.println(i + ". sayiyi giriniz: ");
            int sayi = scanner.nextInt();
            if ( i == 1 ){
                maks=sayi;
                min=sayi;
            }
            if (sayi>maks)
                maks=sayi;

            if (sayi<min)
                min=sayi;
        }
        System.out.println("girdiginiz sayılar : ");
        System.out.println("girdiginiz sayılar icinden en buyuk olani: "+maks);
        System.out.println("girdiginiz sayılar icinden en kucuk olani: "+min);
    }
}