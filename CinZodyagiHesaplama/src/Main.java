import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*Java ile kullanıcıdan doğum tarihini alıp Çin Zodyağı değerini hesaplayan program yazınız.
        Çin Zodyağı nedir?
        4000 bin yıldır kullanılan bir astroloji çeşididir Çin astrolojisi ve insanları 12 değişik burç ve sembollerle tanımlar. Çin Zodyağı bu 12 burcun eşit aralıklarla(10 derece genişliğinde) sıralandığı bir hayvan halkasıdır ve yıldızlarla pek bir ilgisi yoktur.
        Çin Zodyağı nasıl hesaplanır?
        Çin zodyağı hesaplanırken kişinin doğum yılının 12 ile bölümünde kalana göre bulunur.
        System.out.println("Hello world!");*/
        int yil;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen doğum yılınızı giriniz = ");
        yil = scanner.nextInt();
        int hesap = yil%12;
        if (hesap == 0) {
            System.out.println("Çin zodyağı burcunuz : maymun");
        } else if (hesap == 1) {
            System.out.println("Çin zodyağı burcunuz : horoz");
        }else if (hesap == 2) {
            System.out.println("Çin zodyağı burcunuz : köpek");
        }else if (hesap == 3) {
            System.out.println("Çin zodyağı burcunuz : domuz");
        }else if (hesap == 4) {
            System.out.println("Çin zodyağı burcunuz : fare");
        }else if (hesap == 5) {
            System.out.println("Çin zodyağı burcunuz : öküz");
        }else if (hesap == 6) {
            System.out.println("Çin zodyağı burcunuz : kaplan");
        }else if (hesap == 7) {
            System.out.println("Çin zodyağı burcunuz : tavşan");
        }else if (hesap == 8) {
            System.out.println("Çin zodyağı burcunuz : ejderha");
        }else if (hesap == 9) {
            System.out.println("Çin zodyağı burcunuz : yılan");
        }else if (hesap == 10) {
            System.out.println("Çin zodyağı burcunuz : at");
        }else if (hesap == 11) {
            System.out.println("Çin zodyağı burcunuz : koyun");
        }

    }
}