package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t){
        String tStr = t + "";
        int sum = 0;
        int divider = (int) Math.pow(10,tStr.length() - 1);
        for (int i = 0; i < tStr.length(); i++) {
            sum += t / divider;
            t = t - t / divider * divider;
            divider /= 10;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        new DigitsSum().printDigitsSum(1234);
    }
}
