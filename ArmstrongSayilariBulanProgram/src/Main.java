import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       //Bir sayının basamak sayılarının toplamını hesaplayan program yazınız.
       //Örnek : 1643 = 1 + 6 + 4 + 3 = 14

        int a, b, result = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Giriniz :");
        a = input.nextInt();


        while (a != 0) {

            b = a % 10;
            result += b;
            a = a / 10;
        }
        System.out.println("Sonuc : " + result);

    }
}