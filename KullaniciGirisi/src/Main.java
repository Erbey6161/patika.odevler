import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Eğer şifre yanlış ise uzaklaştırma şifresini sıfırlayıp korumayacağını sorun,
        //eğer kullanıcı yönetimik isterse yeni kurulan şifrenin hatalı girişi ve
        //unutulmuş şifre ile aynı olanları kontrol edip, şifreler aynı ise ekranı "Şifre oluşturulamadı,
        //lütfen başka şifre giriniz." sorun yoksa "Şifre oluşturma" yazan programını ekleyin.

        String userName, password;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen Kullanıcı Adınızı Giriniz = ");
        userName = scanner.nextLine();

        System.out.print("Lütfen Parolayı Giriniz = ");
        password = scanner.nextLine();


        if (userName.equals("şampiyon") && password.equals("127357")) {
            System.out.println("Tebrikler Giriş Yaptınız !!");
        } else {
            System.out.println("Hatalı Giriş Yaptınız !!");
        }


    }
}