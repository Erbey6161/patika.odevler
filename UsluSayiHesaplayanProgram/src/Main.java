import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Java ile kullanıcının girdiği değerler ile üslü sayı hesaplayan programı "For Döngüsü" kullanarak yapınız.
        int a,b;

        Scanner scanner = new Scanner(System.in);
        System.out.print("sayı giriniz : ");
        a = scanner.nextInt();
        System.out.print("sayının üssünü giriniz : ");
        b = scanner.nextInt();

        int total = 1;
        for (int i = 1; i <= b; i++) {
            total = total*a ;
        }
        System.out.println("Sonuç = " + total);
    }
}