package tryReverse;

public class TryReverse {

    public static void main(String[] args) {
        tryReverse(12345);
        System.out.println(reversed);
    }

    static int reversed = 0;

    public static int tryReverse(int number) {
        int rest;
        if (number < 0) {
            throw new IllegalArgumentException("The number can't be negative!");
        } else if (number <= 9) {
            reversed = reversed * 10 + number;
            return 0;
        } else {
            rest = number % 10;
            number /= 10;
            reversed = reversed * 10 + rest;
            return tryReverse(number);
        }
    }
}

// I know it's not nice...