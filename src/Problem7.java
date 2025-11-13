public class Problem7 extends ConsoleProgram {
    public void run() {
        System.out.println(randomBetween(1, 6));   // 1–6
        System.out.println(randomBetween(10, 10)); // always 10
        System.out.println(randomBetween(-3, 3));  // -3–3
    }

    private int randomBetween(int low, int high) {
        // TODO
    }
}