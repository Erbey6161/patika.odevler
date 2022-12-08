import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Java döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran programı yazıyoruz.

        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sınır Sayı Giriniz : ");
        n = scanner.nextInt();

        System.out.println("4'ün Kuvvetleri");
        for (int i = 1; i <= n ; i*=4) {
            System.out.println(i);
        }
        System.out.println("--------------------");
        System.out.println("5'in Kuvvetleri");
        for (int i = 1; i <= n ; i*=5) {
            System.out.println(i);
        }

    }
}