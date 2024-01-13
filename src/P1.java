public class P1 {


    public static int[] method(int[] nums, int target){
        int[] expected = {0,0};
        for (int i = 0; i < nums.length-1 ; i++){
            for (int j = 0; j < nums.length-1 ; j++){
                int result = nums[i] + nums[j];
                if (i != j & result == target){
                    expected[0] = i;
                    expected[1] = j;
                }
            }
        }
        return expected;
    }
    public static void main(String[] arg){

        int[] nums = {2,7,11,15};
        int traget = 9;

        int[] nums1 = {3,2,4};
        int traget1 = 6;

        int[] nums2 = {3,3};
        int traget2 = 6;

        int[] expected;



        expected = method(nums, traget);

        for (int a = 0; a < expected.length; a++)
            System.out.print(a+" ");


    }


}
