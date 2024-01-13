import java.util.Hashtable;

public class P4 {
    static Hashtable<Character, Integer> str = new Hashtable<>(7);

    public static int method (String input){
        int result = 0;
        for (int i = 0; i < input.length(); i++){
            if (i+1 < input.length()-1){
                if (str.get(input.charAt(i)) >= str.get(input.charAt(i+1))){
                    result += str.get(input.charAt(i));
                } else if (str.get(input.charAt(i)) < str.get(input.charAt(i+1))){
                    result += (str.get(input.charAt(i+1)) - str.get(input.charAt(i)));
                    i=i+1;
                }
            } else {
                result += str.get(input.charAt(i));
            }

        }
        return result;
    }
    public static void main (String[] arg){

        str.put('I', 1);
        str.put('V', 5);
        str.put('X', 10);
        str.put('L', 50);
        str.put('C', 100);
        str.put('D', 500);
        str.put('M', 1000);

        String[] input = {"III", "LVIII", "MCMXCIV"};
        for (int i = 0; i < input.length; i++){
            int resul = method(input[i]);
            System.out.println(resul);
        }


    }
}
