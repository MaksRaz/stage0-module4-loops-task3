package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        int result = 0;
        int j = 0;
        for(int i = 0; i <= lengthOfLastNumber; i++){
            result+=Math.pow(10,i)-1;
        }
        System.out.println(result);
    }
}
