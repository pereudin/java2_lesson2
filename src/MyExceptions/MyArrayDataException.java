package MyExceptions;

public class MyArrayDataException extends Exception {
    private int one;
    private int two;

    public MyArrayDataException(String message, int one, int two) {
        super(message);
        this.one = one;
        this.two = two;
    }

    public int getOne() {
        return one;
    }

    public int getTwo() {
        return two;
    }
}
