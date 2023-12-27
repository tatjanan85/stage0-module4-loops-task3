package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int sum = 0, n1 = 0, n2 = 1;
        if (lastFibonacci == 2) sum = 1;
        if (lastFibonacci > 2) {
            for (int i = 3; i <= lastFibonacci; i++) {
                sum = n1 + n2;
                n1 = n2;
                n2 = sum;
            }
        }

        System.out.println(sum);
    }

    public static void main(String[] args) {
        new FibonacciSeries().printFibonacci(8);
    }
}
