package academy.learnprogramming;

public class MobilePhone implements ITelephone {

    private int myNumber;
    private boolean isRinging;
    private boolean inOn = false;

    public MobilePhone(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        System.out.println("powered on");
    }

    @Override
    public void dial(int phoneNumber) {
        System.out.println("calling: " +phoneNumber);
    }

    @Override
    public void answer() {
        if(isRinging) {
            System.out.println("answering the phone");
            isRinging = false;
        }
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        return false;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}

