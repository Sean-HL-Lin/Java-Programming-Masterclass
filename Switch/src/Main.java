public class Main {

    public static void main(String[] args) {
        switch(value) {
            case 1:
                System.out.println("value is 1");
                break;
            case 2:
                System.out.println("value is 2");
                break;
            case 3: case 4: case 5:
                System.out.println("value is 3 or 4 or 5");
                break;

            default:
                System.out.println("value is not in range");
                break;
        }
    }
}
