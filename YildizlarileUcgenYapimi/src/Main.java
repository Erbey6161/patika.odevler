import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Java'da döngüler kullanarak yıldızlar ile elmas yapınız.

        Scanner klavye = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz :");
        int n = klavye.nextInt();
        for (int i=1; i<=n; i++){
            for (int k=1; k<=(n-i); k++){
                System.out.print(" ");
            }
            for (int l=1; l<=(2*i-1); l++){
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i=n-1; i>=1; i--){
            for (int k=n; k>i; k--){
                System.out.print(" ");
            }
            for (int l=1; l<=(2*i-1); l++){
                System.out.print("*");
            }
            System.out.println();

        }





    }
}