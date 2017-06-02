public class NumbersTo100 {
    public static void main(String[] args) throws InterruptedException {

        for (int i = 0; i<=300; i++) {
            System.out.printf("%d:%02d", i/60, i%60);
            Thread.sleep(1000);
        }
    }
}
