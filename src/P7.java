import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P7 {


    public static void main (String[] arg){
        //List<Integer> numbers = Arrays.asList(1, 2, 3);
        //List<Integer> numbers = Arrays.asList(9);
        List<Integer> numbers = Arrays.asList(1,2,7,9,6);
        int result = 0;
        for (Integer number : numbers) {
            result = result * 10 + number;
        }
        result = result+1;

        String numberStr = Integer.toString(result);
        List<Integer> digits = new ArrayList<>();
        for (char digitChar : numberStr.toCharArray()) {
            // Convert the char to a numeric value and add it to the list
            digits.add(Character.getNumericValue(digitChar));
        }
        System.out.println(digits);


    }

}
