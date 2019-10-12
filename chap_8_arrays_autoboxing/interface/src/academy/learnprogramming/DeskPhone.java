package academy.learnprogramming;

public class DeskPhone implements ITelephone {
    private int myNumber;
    private boolean isRinging;

    public DeskPhone(int myNumber) {
        this.myNumber = myNumber;
        this.isRinging = false;
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
