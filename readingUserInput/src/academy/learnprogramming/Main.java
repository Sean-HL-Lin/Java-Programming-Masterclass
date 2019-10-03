package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
        System.out.println("enter your name: ");
        String name = scanner.nextLine();
        System.out.println("your name is " + name);

        System.out.println("enter your age: ");
        scanner.hasNextInt();
        if (scanner.hasNextInt()) {
            System.out.println("age is :" + scanner.nextInt());
        }
        scanner.close();
    }
}
