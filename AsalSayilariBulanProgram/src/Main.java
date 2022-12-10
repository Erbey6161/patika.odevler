public class Main {
    public static void main(String[] args) {

        //Java ile 1 - 100 arasındaki asal sayıları ekrana yazdıran programı yazınız.

        for (int i = 2; i <= 100; i++) {
            boolean isAsal = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isAsal = false;
                    break;
                }
            }
            if (isAsal)
                System.out.print(i + ", ");
        }

    }
}