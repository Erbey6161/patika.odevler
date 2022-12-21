public class Main {
   // Projeye ilk kimin dövüşe başlayacağını %50 olasılık ile hesaplayan sistemi entegre ediniz.
    public static void main(String[] args) {
        Fighter f1 = new Fighter("Antony", 10, 120, 100,30);
        Fighter f2 = new Fighter("Brian", 20, 85, 85,40);

        Match match = new Match(f1, f2, 85, 100);
        match.run();
    }
}