import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       /* Koç Burcu : 21 Mart - 20 Nisan
        Boğa Burcu : 21 Nisan - 21 Mayıs
        İkizler Burcu : 22 Mayıs - 22 Haziran
        Yengeç Burcu : 23 Haziran - 22 Temmuz
        Aslan Burcu : 23 Temmuz - 22 Ağustos
        Başak Burcu : 23 Ağustos - 22 Eylül
        Terazi Burcu : 23 Eylül - 22 Ekim
        Akrep Burcu : 23 Ekim - 21 Kasım
        Yay Burcu : 22 Kasım - 21 Aralık
        Oğlak Burcu : 22 Aralık - 21 Ocak
        Kova Burcu : 22 Ocak - 19 Şubat
        Balık Burcu : 20 Şubat - 20 Mart*/

        int ay,gun;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Doğduğunuz ay ? =");
        ay = scanner.nextInt();
        System.out.println("Doğduğunuz gün ? =");
        gun= scanner.nextInt();
        if (ay == 1 ) {
            if (gun >=1 && gun<=31){
                if (gun <=21 ){
                    System.out.println("Burcunuz : OĞLAK");
                }else {
                    System.out.println("Burcunuz : KOVA");
                }
            }else {
                System.out.println("Geçersiz bir gün girdiziniz!!z");
            }
        }
        if (ay == 2 ) {
            if (gun >=1 && gun<=28){
                if (gun <=19 ){
                    System.out.println("Burcunuz : KOVA");
                }else {
                    System.out.println("Burcunuz : KOÇ");
                }
            }else {
                System.out.println("Geçersiz bir gün girdiziniz!!z");
            }
        }
        if (ay == 3 ) {
            if (gun >=1 && gun<=31){
                if (gun <=20 ){
                    System.out.println("Burcunuz : BALIK");
                }else {
                    System.out.println("Burcunuz : BALIK");
                }
            }else {
                System.out.println("Geçersiz bir gün girdiziniz!!z");
            }
        }
    }
}