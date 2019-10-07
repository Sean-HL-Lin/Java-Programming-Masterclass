package academy.learnprogramming;

public class Animal {

    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public Animal() {
        this("unknow");
    }

    public void getName() {
        System.out.println(name);

    }

    public void setName(String name) {
        this.name = name;
    }
}
