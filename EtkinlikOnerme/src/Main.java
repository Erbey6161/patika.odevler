import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Koşullar :

        Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
        Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
        Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
        Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.
        Ödev
        Aynı örnek üzerinden if koşulları başka hangi şekilde oluşturulabilirdi farklı çözüm yolları bulunuz.*/
        int sicaklik;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen hava sıcaklığını giriniz = ");
        sicaklik = scanner.nextInt();

        if (sicaklik < 5) {
            System.out.println("Bugün kayak yapmaya uygundur");
        } else if ( 5<sicaklik && sicaklik<15) {
            System.out.println("Sinemaya gidilebilir");
        } else if (15<sicaklik && sicaklik<25) {
            System.out.println("Pikniğe gidilebilir");
        } else {
            System.out.println("Yüzmeye gidilebilir");
        }


        System.out.println("İyi eğlenceler !!!");
    }
}