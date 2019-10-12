package academy.learnprogramming;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
	// write your code here

        int[] myInts = getIntergers(5);
        print(myInts);
    }

    public static int[] getIntergers(int count) {
        int[] array = new int[count];
        for(int i = 0; i < array.length ; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static void print(int[] array) {
        for (int i = 0; i < array.length; i ++) {
            System.out.println(array[i]);
        }
    }
}
