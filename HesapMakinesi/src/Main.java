import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n1,n2,select;

        Scanner scanner = new Scanner(System.in);
        System.out.print("1. Sayıyı Giriniz = ");
        n1 = scanner.nextInt();
        System.out.print("2. Sayıyı Giriniz = ");
        n2 = scanner.nextInt();

        System.out.println("1.TOPLA, 2.ÇIKARMA, 3.ÇARPMA, 4.BÖLME");
        System.out.print("Seçiminiz = ");
        select = scanner.nextInt();

        switch (select){
            case 1:
                System.out.println("Toplam =" + (n1+n2));
                break;
            case 2:
                System.out.println("ÇIKARMA =" + (n1-n2));
                break;
            case 3:
                System.out.println("ÇARPMA =" + (n1*n2));
                break;
            case 4:
                System.out.println("BÖLME =" + (n1/n2));
                break;
            default :
                System.out.println("lütfen 1-4 arasında bir değer giriniz.");
                break;

        }
    }
}