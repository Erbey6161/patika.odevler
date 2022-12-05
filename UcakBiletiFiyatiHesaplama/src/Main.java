import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Java ile mesafeye ve şartlara göre uçak bileti fiyatı hesaplayan programı yapın.
        Kullanıcıdan Mesafe (KM), yaşı ve yolculuk tipi (Tek Yön, Gidiş-Dönüş) bilgilerini alın.
        Mesafe başına ücret 0,10 TL / km olarak alın.
        İlk olarak uçuşun toplam fiyatını hesaplayın ve sonrasında ki koşullara göre müşteriye aşağıdaki indirimleri uygulayın ;

        Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır. Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.
        Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
        Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
        Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
        Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.*/

        int km, yas, tip;
        double price = 0.10;
        double toplam = 0;
        double tipInd = 0;
        double yasInd = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen mesafeyi giriniz : ");
        km = scanner.nextInt();
        toplam = km*price;//indirimsiz ücret fiyatı
        System.out.println("İndirimsiz toplam ücret : " + toplam +" TL ");

        System.out.print("Tek yön mü? (1) / Çift Yön mü? (2) : ");
        tip = scanner.nextInt();

        if (tip == 2){
            System.out.println("tip indirimi tutarı : "+ (tipInd=toplam*0.20)+" TL");
        }else {
            System.out.println("Tip indiriminiz yok");
        }

        System.out.print("Lütfen yaşınızı giriniz : ");
        yas = scanner.nextInt();
        if (yas<12){
           System.out.println(" Yaş indirimi ücreti :"+ (yasInd=toplam/2)+"TL");
        } else if (yas>12 && yas<24) {
            System.out.println("Yaş indirimi ücreti :"+ (yasInd=toplam - (toplam*0.10))+"TL");
        } else if (yas>65) {
            System.out.println("Yaş indirimi ücreti :"+ (yasInd=toplam - (toplam*0.30))+"TL");
        }else {
            System.out.println("üzgünüz yaş İndiriminiz yok!! ");
        }
        System.out.println("-----------------------------------");

        System.out.println("İndirimsiz Toplam Ücreti =" + toplam + "TL");
        System.out.println("------------------------------------");
        System.out.println("Uçuş Tip İndirimi = " + tipInd + "TL");
        System.out.println("Yaş indirimi = "+ yasInd+ "TL");
        System.out.println("-------------------------------------");
        System.out.println("Bilet ücret Tutarınız = " + (toplam-tipInd-yasInd)+"TL" );
    }
}