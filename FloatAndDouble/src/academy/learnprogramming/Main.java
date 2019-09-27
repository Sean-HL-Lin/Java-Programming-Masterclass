package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	    float myMinFloatValue = Float.MIN_VALUE;
	    float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("float min value = " + myMinFloatValue);
        System.out.println("float max value = " + myMaxFloatValue);


        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("double min value = " + myMinDoubleValue);
        System.out.println("double max value = " + myMaxDoubleValue);

        int myInt = 5;
        float myFloat = 5.23f;
        double mydouble = 5.23d;
        System.out.println("my int value = " + myInt);
        System.out.println(("my float = " + myFloat));

        float pound = 100;
        float kg = pound*0.45359237f;
    }
}
