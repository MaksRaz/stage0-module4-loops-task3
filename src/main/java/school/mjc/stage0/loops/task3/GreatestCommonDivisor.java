package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {
        int max = 1;
        for(int i = 2; i <= Math.max(first, second); i++){
            if (first % i == 0 && second % i == 0){
                max = i;
            }
        }
        System.out.println(max);
    }
}
