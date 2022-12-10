import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a, b, EKOK = 0;
        int ebob = 1;
        int i = 1;

        Scanner input = new Scanner(System.in);
        System.out.println(" a sayısını giriniz: ");
        a = input.nextInt();
        System.out.println(" b sayısını giriniz:");
        b = input.nextInt();

        if (a < b) {
            while (i <= a) {

                if (a % i == 0 && b % i == 0) {
                    ebob = i;
                    EKOK = (a * b) / ebob;
                }
                i++;
            }
            System.out.println("a ve b sayısının EBOB'u :" + ebob);
            System.out.println("a ve b sayısının EKOK'u :" + EKOK);
        } else {
            while (i <= b) {
                if (a % i == 0 && b % i == 0) {
                    ebob = i;
                    EKOK = (a * b) / ebob;
                }
                i++;
            }
            System.out.println("a ve b sayısının EBOB'u :" + ebob);
            System.out.println("a ve b sayısının EBOB'u :" + EKOK);
        }


    }
}