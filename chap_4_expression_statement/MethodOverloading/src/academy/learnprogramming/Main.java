package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	// write your code here
        outputNumber(123123);
        outputNumber(123, "someone");
    }

    public static String outputNumber (int score, String name) {
        return name + " with " + score;
    }

    public static String outputNumber (int score) {
        return  score + " without name";
    }

}
