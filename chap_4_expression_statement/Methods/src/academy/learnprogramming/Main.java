package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        logOutMessage("sent a message through method");
        displayNameAndScore("someone", 100);
    }

    public static void logOutMessage(String msg) {
        System.out.println(msg);
    }

    // if method return nothing than "void"
    public static void displayNameAndScore(String name, int score) {
        System.out.println(name + " with score :" + score);
    }


    // if method has a return value then replace "void" with returned data type
    public static int getBacScore(int score) {
        return score;
    }
}
