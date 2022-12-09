import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*N elemanlı bir kümenin elemanları ile oluşturulacak r elemanlı farklı grupların
        sayısı n’in r’li kombinasyonu olarak adlandırılır. N’in r’li kombinasyonu C(n,r) şeklinde gösterilir.
        Java ile kombinasyon hesaplayan program yazınız.
        Kombinasyon formülü
        C(n,r) = n! / (r! * (n-r)!)*/

        int n,r;
        int total = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kombinasyon birimlerini giriniz n : ");
        n=scanner.nextInt();
        System.out.print("Kombinasyon birimlerini giriniz r : ");
        r=scanner.nextInt();
        int fark = n-r;
        int nfark = 1;
        int nfak = 1;
        int rfak = 1;
        for (int i = 1; i <=n; i++) {
            nfak = nfak*i;
        }
        System.out.println("n!= "+ nfak);

        for (int i = 1; i <=r; i++) {
            rfak = rfak*i;
        }
        System.out.println("r!= "+ rfak );

        for (int i = 1; i <=fark; i++) {
            nfark = nfark *i;
        }
        System.out.println("(n-r)!= "+ (nfark = total));


        int kombinasyon = nfak / (rfak * nfark);

        System.out.println(n+","+r + " kombinasyonu = "+ kombinasyon );            //n! / (r! * (n-r)!)


    }
}