package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {
        int gcd = 1;
        int greatest = first > second ? first : second;
        for(int i = 2; i <= greatest; i++) {
            if (first % i == 0 && second % i == 0) {
                gcd = i;
            }
        }

        System.out.println(gcd);
    }

    public static void main(String[] args) {
        new GreatestCommonDivisor().printGCD(15, 30);
    }
}
