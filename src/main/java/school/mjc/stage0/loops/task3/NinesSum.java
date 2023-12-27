package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        int sum = 0;
        for(int i = 0; i < lengthOfLastNumber; i++) {
            sum += 9 * Math.pow(10, i);
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        new NinesSum().calculateSum(3);
    }
}
