package tryReverse;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamReverse {

    public static void main(String[] args) {
        System.out.println(streamReverse(12345));
    }

    public static int streamReverse(int number) {
        int result;

        if (number < 0) {
            throw new IllegalArgumentException("The number can't be negative!");
        } else if (number <= 9) {
            return number;
        } else {
            String resultString = "";
            String stringNumber = String.valueOf(number);
            List<Character> list = new ArrayList<>();
            for (char character : stringNumber.toCharArray()) {
                list.add(character);
            }
            List<Character> resultList = list.stream()
                    .unordered()
                    .collect(Collectors.toList());
            for (char character : resultList) {
                resultString += character;
            }
            result = Integer.parseInt(resultString);
        }
        return result;
    }
}

//  Am vrut sa fac cu stream dar nu am reusit. Am crezut ca UNORDERED face reverse..
