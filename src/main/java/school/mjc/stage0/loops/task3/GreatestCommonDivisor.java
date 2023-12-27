package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {
        int gcd = 1;
        for(int i = 2; i < first; i++) {
            if (first % i == 0 && second % i == 0) {
                gcd = i;
            }
        }

        System.out.println(gcd);
    }

    public static void main(String[] args) {
        new GreatestCommonDivisor().printGCD(45, 7);
    }
}
