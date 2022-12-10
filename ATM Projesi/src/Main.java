

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //ATM işlemlerini "Switch-Case" kullanarak yapınız.

        String userName, password;
        Scanner inp = new Scanner(System.in);
        int right = 3;//Deneme Sayısı
        int balance = 1500;//Başlangıç Bakiye
        int select;

        while (right > 0) {
            System.out.println("Kullanıcı Adınızı Giriniz: ");
            userName = inp.nextLine();
            System.out.println("Parolanız: ");
            password = inp.nextLine();

            if (userName.equals("sampiyon") && password.equals("12345")) {
                System.out.println("Merhaba, Kodluyoruz Bankasına Hoşgeldiniz!");
                do {
                    System.out.println("1-Para yatırma\n" +
                            "2-Para Çekme\n" +
                            "3-Bakiye Sorgula\n" +
                            "4-Çıkış Yap");
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");
                    select = inp.nextInt();

                    switch (select) {
                        case 1: {
                            System.out.print("Para miktarı : ");
                            int price = inp.nextInt();
                            balance += price;
                            break;
                        }
                        case 2: {
                            System.out.print("Para miktarı : ");
                            int price = inp.nextInt();
                            if (price > balance) {
                                System.out.println("Bakiye yetersiz.");
                            } else {
                                balance -= price;
                            }
                            break;
                        }
                        case 3: {
                            System.out.println("Bakiyeniz : " + balance);
                            break;
                        }
                        default:
                            System.out.println("");
                            break;
                    }
                }
                while (select != 4);
                System.out.println("Tekrar görüşmek üzere.");
                break;
            } else {
                System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar deneyiniz.");
                right--;
                if (right == 0) {
                    System.out.println("Hesabınız bloke olmuştur lütfen banka ile iletişime geçiniz.");
                } else {
                    System.out.println("Kalan Hakkınız : " + right);
                }

            }
        }
    }
}