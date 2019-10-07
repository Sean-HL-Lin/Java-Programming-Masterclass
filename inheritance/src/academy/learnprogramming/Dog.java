package academy.learnprogramming;

public class Dog extends Animal{


    public void getWeight() {
        System.out.println(this.weight);
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    private int weight;

    public Dog(int weight) {
        super("Dooooooog");
        this.weight = weight;
    }

    @Override
    public void eat() {
        System.out.println("dog eating");
        super.eat();
    }
}
