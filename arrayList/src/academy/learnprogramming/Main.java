package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static Glist glist = new Glist();
    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        printInstructions();

        while(!quit) {
            System.out.println("enter your choice: ");
            choice = scanner.nextInt();

            switch(choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    glist.print();
            }
        }

    }

    public static void printInstructions() {

    }


}
