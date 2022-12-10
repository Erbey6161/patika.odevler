import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Java ile girilen sayının harmonik serisini bulan program yazacağız.

        int n;
        double result = 0.0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen n sayısını giriniz : ");
        n =  scanner.nextInt();

        for (double i = 1; i <= n; i++) {
            result += (1/i);
        }
        System.out.println(result);
    }
}