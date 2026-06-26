public class Twosum {

    public static int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {

                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }

        return new int[]{};
    }

    public static void main(String[] args) {

        int nums[] = {2, 4, 5, 6, 11, 8};
        int target = 14;

        int[] ans = twoSum(nums, target);

        if (ans.length == 2) {
            System.out.println("["+ ans[0] + " " + ans[1]+ "]");
        } else {
            System.out.println("No pair found");
        }
    }
}