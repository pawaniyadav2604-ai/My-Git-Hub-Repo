public class Missingnumber {
    public static int missingnumber(int[] nums){
        int n = nums.length+1;
        int expected_value = n*(n+1) /2;
        int actual = 0;

        for (int i = 0; i < nums.length; i++) {
            actual += nums[i];
        }
        int missing = expected_value - actual;
        return missing;
    }
    public static void main(String[] args) {
        int [] nums= {1,2,3,5,6};
        System.out.println(missingnumber(nums));
    }
}
