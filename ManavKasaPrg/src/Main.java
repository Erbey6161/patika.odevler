
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Armut Kaç Kilo = ");
        float Armut = scanner.nextFloat();
        System.out.print("Elma Kaç Kilo = ");
        float Elma = scanner.nextFloat();
        System.out.print("Domates Kaç Kilo = ");
        float Domates = scanner.nextFloat();
        System.out.print("Muz Kaç Kilo = ");
        float Muz = scanner.nextFloat();
        System.out.print("Patlıcan Kaç Kilo = ");
        float Patlıcan = scanner.nextFloat();

        double ArmKg = 2.14;
        double ElmKg = 3.67;
        double DomKg = 1.11;
        double MuzKg = 0.95;
        double PatKg = 5;

        double ToplamTutar = ArmKg*Armut + Elma*ElmKg + Domates*DomKg + MuzKg*Muz + Patlıcan*PatKg;

        System.out.print(" Toplam Tutar = " + ToplamTutar + "TL");

    }
}