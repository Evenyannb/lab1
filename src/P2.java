import java.sql.Blob;

public class P2 {


    public static boolean method (String s){
        int length = s.length()-1;
        for (int i = 0; i < length; i++){
            if (s.charAt(i) != s.charAt(length-i)){
                return false;
            }
        }
        return true;
    }
    public static void main (String[] arg){

        int[] nums = {121, -121, 10};

        for(int i = 0; i < nums.length; i++){
            String s=String.valueOf(nums[i]);
            Boolean a = method(s);
            System.out.print(a);
        }

    }
}
