import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Üç𝑔𝑒𝑛𝑖𝑛 ç𝑒𝑣𝑟𝑒𝑠𝑖 = 2𝑢
        //𝑢 = (a+b+c) / 2
        //Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)

        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen 1.kenar uzunluğunu giriniz = ");
        float kenar1 = scanner.nextInt();
        System.out.print("Lütfen 2.kenar uzunluğunu giriniz = ");
        float kenar2 = scanner.nextInt();
        System.out.print("Lütfen 3.kenar uzunluğunu giriniz = ");
        float kenar3 = scanner.nextInt();

        double u = (kenar1 + kenar2 + kenar3) / 2;
        double cevre = 2 * u;
        System.out.println("Üçgenin Çevresi = " + cevre);
        double alan = u * (u - kenar1) * (u - kenar2) * (u - kenar3);
        System.out.println("Üçgenin Alanı = " + alan);

    }
}