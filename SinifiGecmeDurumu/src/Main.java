import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Dersler : Matematik, Fizik, Türkçe, Kimya, Müzik
        //Geçme Notu : 55
        //Ödev
        //Eğer girilen ders notları 0 veya 100 arasında değil ise ortalamaya katılmasın.

        int mat,fiz,tur,kim,muz;
        float notOrt = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("matematik notunuzu giriniz : ");
        mat = scanner.nextInt();
        if (mat<0 || mat>100){
            mat=0;
        }
        System.out.print("fizik notunuzu giriniz : ");
        fiz = scanner.nextInt();
        if (fiz<0 || fiz>100){
            fiz=0;
        }
        System.out.print("Türkçe notunuzu giriniz : ");
        tur = scanner.nextInt();
        if (tur<0 || tur>100){
            tur=0;
        }
        System.out.print("kimya notunuzu giriniz : ");
        kim = scanner.nextInt();
        if (kim<0 || kim>100){
            kim=0;
        }
        System.out.print("müzik notunuzu giriniz : ");
        muz = scanner.nextInt();
        if (muz<0 || muz>100){
            muz=0;
        }
        notOrt = (mat+fiz+tur+kim+muz)/5;


        if (notOrt >55){
            System.out.println("not ortalamanız = "+ notOrt);
            System.out.println("Sınıfı Geçtiniz Tebrikler!!!!");
        }else {
            System.out.println("not ortalamanız = "+ notOrt);
            System.out.println("Üzgünüz Kaldınız ):");
        }


    }
}