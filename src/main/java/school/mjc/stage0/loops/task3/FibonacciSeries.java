package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int sum = 1, n1 = 0, n2 = 1;
        System.out.println(n1);

        if (lastFibonacci > 1) {
            System.out.println(sum);
            for (int i = 3; i <= lastFibonacci; i++) {
                sum = n1 + n2;
                n1 = n2;
                n2 = sum;
                System.out.println(sum);
            }
        }
    }
}
