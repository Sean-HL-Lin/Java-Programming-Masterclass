package academy.learnprogramming;

public class Series {

    public static int nSum(int num) {
        int outputSum =  0;
        for (int i = 0; i<= num; i ++) {
            outputSum += i;
        }
        return outputSum;
    }

    public static int factorial(int num) {
        int output = 1;
        if (num == 0) {
            return 0;
        }
        for (int i = 1; i <= num; i++) {
            output *= i;
        }
        return output;
    }

    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fibonacci(n-1) + fibonacci(n -2);
    }
}
