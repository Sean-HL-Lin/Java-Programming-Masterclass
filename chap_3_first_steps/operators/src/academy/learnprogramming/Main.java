package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        int result =  1 + 2;
        System.out.println(result);

        result +=2;
        System.out.println(result);

        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("it is not a alien!");
        }

        int topScore = 90;
        if(80 < topScore && topScore < 100) {
            System.out.println("print out score");
        }

        double firstValue = 20;
        double second = 80;
        double totalValue = firstValue + second * 100;
        double remainder = totalValue % 40;
        System.out.println(remainder);
    }
}
