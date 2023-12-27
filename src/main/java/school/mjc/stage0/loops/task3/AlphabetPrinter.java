package school.mjc.stage0.loops.task3;

public class AlphabetPrinter {
    public void printAlphabet() {
        for (char i = 65; i <= 90; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        new AlphabetPrinter().printAlphabet();
    }
}
