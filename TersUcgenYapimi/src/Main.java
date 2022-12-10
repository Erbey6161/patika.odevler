import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Java ile basamak sayısının kullanıcıdan alınan ve döngüler kullanılarak,
        //yıldızlar(*) ile ekrana ters üçgen çizen programı yazın.
        Scanner scanner = new Scanner(System.in);
        System.out.print("sayı giriniz:");

        int n = scanner.nextInt();

        for (int i = n - 1; i >= 1; i--) {
            for (int k = n; k > i; k--) {
                System.out.print(" ");
            }

            for (int l = 1; l <= (2 * i - 1); l++) {
                System.out.print("*");
            }

            System.out.println(" ");

        }

    }
}