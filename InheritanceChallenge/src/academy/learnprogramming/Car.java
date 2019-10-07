package academy.learnprogramming;

public class Car extends Vehicle {
    private int wheels;
    private int doors;
    private boolean isManual;
    private int currentGrear;


    public Car(String name, String size, int wheels, int doors, boolean isManual, int currentGrear) {
        super(name, size);
        this.wheels = wheels;
        this.doors = doors;
        this.isManual = isManual;
        this.currentGrear = currentGrear;
    }

    public void setCurrentGrear(int currentGrear) {
        this.currentGrear = currentGrear;
        System.out.println("gear changed to " + currentGrear);
    }

    public void changevelocity(int speed, int direction) {
        move(speed, direction);
        System.out.println("car.change velocity : velocity and direction: " + speed + "  " + direction);
    }



    @Override
    public void stop() {
        super.stop();
    }
}
