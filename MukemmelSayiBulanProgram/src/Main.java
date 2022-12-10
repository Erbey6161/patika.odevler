import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Bir sayının kendisi hariç pozitif tam sayı çarpanları (kalansız bölen sayıların) toplamı
        //kendisine eşit olan sayıya mükemmel sayı denir.
        /*Bir sayı giriniz: 28
        28 Mükemmel sayıdır
        Bir sayı giriniz: 1
        1 Mükemmel sayı değildir.
        Bir sayı giriniz: 496
        496 Mükemmel sayıdır*/


        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz : ");
        int num= scanner.nextInt();
        int total = 0;

        for (int i = 1; i < num; i++) {
            if (num % i ==0){
                total +=i;
            }
        }
        if (total == num) {
            System.out.println(num + " Mükemmel sayıdır.");
        } else {
            System.out.println(num + " Mükemmel sayı değildir.");
        }


    }
}