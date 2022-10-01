import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int Turkce, Matematik, Fizik, Kimya, Tarih, Muzik;
        Scanner notgir = new Scanner(System.in);
        System.out.print("Lutfen Turkce Notunu Giriniz : ");
        Turkce = notgir.nextInt();
        System.out.print("Lutfen matematik Notunu Giriniz : ");
        Matematik = notgir.nextInt();
        System.out.print("Lutfen fizik Notunu Giriniz : ");
        Fizik = notgir.nextInt();
        System.out.print("Lutfen kimya Notunu Giriniz : ");
        Kimya = notgir.nextInt();
        System.out.print("Lutfen Tarih Notunu Giriniz : ");
        Tarih = notgir.nextInt();
        System.out.print("Lutfen Muzik Notunu Giriniz : ");
        Muzik = notgir.nextInt();

        float ortalama = (Turkce + Matematik + Fizik + Kimya + Tarih + Muzik) / 6f;
        System.out.println("Not ortalamaniz :  " + ortalama);

        System.out.print(ortalama > 60 ? "Tebrikler Sinifi Geçtiniz" : "sınıfta kaldınız");

    }
}