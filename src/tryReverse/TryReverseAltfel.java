package tryReverse;

public class TryReverseAltfel {

    public static void main(String[] args) {
        reverse(12345);
    }

    public static void reverse(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("The number can't be negative!");
        } else if (number <= 9) {
            System.out.println(number);
        } else {
            String n = String.valueOf(number);
            String stringNumber = "";
            for (int i = n.length() - 1; i >= 0; i--) {
                stringNumber += n.charAt(i);
            }
            int result = Integer.parseInt(stringNumber);
            System.out.println(result);
        }
    }
}
