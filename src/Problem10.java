public class Problem10 extends ConsoleProgram {
    public void run() {
        System.out.println(isStrong("Abc12345"));   // true
        System.out.println(isStrong("weakpass"));   // false
        System.out.println(isStrong("A1b2C3"));     // false (too short)
    }

    private boolean isStrong(String pw) {
        // TODO
    }
}