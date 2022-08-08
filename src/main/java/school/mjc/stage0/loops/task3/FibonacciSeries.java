package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int num0 = 0;
        int num1 = 1;
        int num2;

        System.out.println(0);
        System.out.println(1);
        for(int i = 3; i <= lastFibonacci; i++) {
            num2 = num0 + num1;
            System.out.println(num2);
            num0 = num1;
            num1 = num2;
        }
    }
}
