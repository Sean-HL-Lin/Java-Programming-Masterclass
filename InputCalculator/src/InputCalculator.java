import java.util.Scanner;

public class InputCalculator {
    public static void main(String[] args) {
        int sum = 0;
        int count = 0;
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("input number");
            boolean valid = input.hasNextInt();
            if (valid) {
                sum += input.nextInt();
                count ++;
            } else {
                System.out.println("sum : " + sum);
                System.out.println("average : " + sum/count);
                break;
            }
        }

    }

    public static void inputThenPrintSumAndAverage() {
        int sum = 0;
        int count = 0;
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("input number");
            boolean valid = input.hasNextInt();
            if (valid) {
                sum += input.nextInt();
                count ++;
            } else {
                System.out.println("sum : " + sum);
                System.out.println("average : " + sum/count);
                break;
            }
        }
    }
}
