package tryReverse;

public class WhileReverse {

    public static void main(String[] args) {
        System.out.println(whileReverse(12345));
    }

    public static int whileReverse(int number) {
        int rest;
        int reversed = 0;

        if (number < 0) {
            throw new IllegalArgumentException("The number can't be negative!");
        }
        while (number != 0) {
            rest = number % 10;
            reversed = reversed * 10 + rest;
            number /= 10;
        }
        return reversed;
    }
}
