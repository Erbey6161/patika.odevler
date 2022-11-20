import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Alan Formülü : π * r * r;
          Çevre Formülü : 2 * π * r;

            Ödev
            Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.
            𝜋 sayısını = 3.14 alınız.
            Formül : (𝜋 * (r*r) * 𝛼) / 360*/

        Scanner scanner = new Scanner(System.in);
        System.out.print("lütfen dairemnin yarı çapı giriniz : ");
        double r = scanner.nextDouble();
        double pi = 3.14;

        //Alan ve çevre formülü

        double alan = pi * r * r;
        System.out.println("Dairenin Alanı = " + alan );
        double cevre = 2 * pi * r;
        System.out.println("Dairenin Çevresi = " + cevre);

        //ÖDEV açısı verilen dairelerin alanını hesaplama

        int aci = 360;
        // 2. Alan formülü
        double alan2 = (pi * ( r * r ) * aci) / 360;
        System.out.println("Dairenin Alanı = " + alan2 );

        System.out.println("Tebrikler !!!");
    }
}