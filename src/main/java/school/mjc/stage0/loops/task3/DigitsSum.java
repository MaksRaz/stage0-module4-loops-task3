package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t){
        int result = 0;
        t = Math.abs(t);
        while (t > 0){
            result+=t%10;
            t/=10;
        }
        System.out.println(result);
    }
}
