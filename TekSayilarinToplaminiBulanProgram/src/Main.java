import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden
        ve girilen değerlerden çift
        ve 4'ün katları olan sayıları toplayıp ekrana basan programı yazıyoruz.*/

        int g, total = 0;

        Scanner scanner = new Scanner(System.in);


        do {
            System.out.println("Sayıyı giriniz : ");
            g =  scanner.nextInt();
            if (g % 4 == 0){
                total +=g;
            }

        }while (g % 2 != 1);
        System.out.println(" Toplam = "+ total );
    }
}