package tryReverse;

public class RecursiveReverse {

    public static void main(String[] args) {
        recursiveReverse(12345);
    }

    public static void recursiveReverse(int number) {

        if (number < 0) {
            throw new IllegalArgumentException("The number can't be negative!");
        } else if (number <= 9) {
            System.out.print(number);
        } else {
            System.out.println(number % 10);
            recursiveReverse(number / 10);
        }
    }
}
