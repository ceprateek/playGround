package twoSum;

import java.util.Arrays;

/*
Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
 */
public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int[] result = twoSum(nums, 18);
        System.out.println(Arrays.toString(result));
    }
    public static int[] twoSum(int[] nums, int desiredSum){
        Arrays.sort(nums);
        int i=0;
        int j=nums.length-1;
        while (i<j){
            int sum = nums[i] + nums[j];
            if (sum<desiredSum){
                i++;
            }else if (sum>desiredSum){
                j--;
            }else {
                return new int[]{i,j};
            }
        }
        return null;
    }
}
