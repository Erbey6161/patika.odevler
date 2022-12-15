import java.util.Scanner;

public class Test {
    /*Girilen sayı 0 veya negatif olduğu yere kadar girilen sayıdan 5 rakamını çıkarın. Her çıkarma işlemi sırasında ekrana son değeri yazdırın.
    Sayı negatif veya 0 olduktan sonra tekrar 5 ekleyin. Yine her ekleme işleminde sayının son değerini ekrana yazdırın.*/


    public Test()
    {
        System.out.printf("1");
        new Test(10);
        System.out.printf("5");
    }
    public Test(int temp)
    {
        System.out.printf("2");
        new Test(10, 20);
        System.out.printf("4");
    }
    public Test(int data, int temp)
    {
        System.out.printf("3");

    }

    public static void main(String[] args)
    {
        Test obj = new Test();
    }

}