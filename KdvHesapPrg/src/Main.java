import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Java ile kullanıcıdan alınan para değerinin KDV'li fiyatını ve KDV tutarını hesaplayıp ekrana bastıran programı yazın.
        (Not : KDV tutarını 18% olarak alın)
        KDV'siz Fiyat = 10;
        KDV'li Fiyat = 11.8;
        KDV tutarı = 1.8;*/
        /*Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 , tutar 1000 TL'den büyük ise KDV oranını %8 olarak KDV tutarı hesaplayan programı yazınız.*/

        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen Fiyatı Giriniz = ");
        double sayi1 = scanner.nextDouble();//kullanıcıdan alınan KDV'siz para
        double sayi4 = 0;//KDV oranı
        if (sayi1>0 && sayi1<1000){
            sayi4 = 0.18;
        }else if ( sayi1 > 1000 ){
            sayi4 = 0.08;
        }else {
            System.out.println("Sıfırdan Büyük Sayı Giriniz" );
        }
        double sayi2 = sayi1*sayi4 ; //KDV tutarı
        System.out.println("KDV'si = " + sayi2 );
        double sayi3 = sayi1 + sayi2 ;// KDV'li fiyat
        System.out.println("KDV'li Fiyatı = " + sayi3 );

    }
}