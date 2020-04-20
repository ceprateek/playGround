package threeSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {-1,2, 1, -4};
        System.out.println(s.threeSumClosest(nums, 1));
    }

    public int threeSumClosest(int[] nums, int target) {
        int result = nums[0]+ nums[1]+ nums[2];
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i-1])
                continue;
            int l = i + 1, r = nums.length - 1;
            while (l < r) {
                int sum = nums[i] + nums[l] + nums[r];
                if (sum < target)
                    l++;
                else if (sum > target)
                    r--;
                if (Math.abs(sum - target) < Math.abs(result - target))
                    result = sum;
                while (l < r && nums[l] == nums[l-1]) ++l;  // avoid duplicates
                while (l < r && nums[r] == nums[r+1]) --r;  // avoid duplicates
            }
        }
        return result;
    }

    public List<List<Integer>> threeSum(int[] num, int target) {
        List<List<Integer>> results = new ArrayList<>();
        Arrays.sort(num);

        for (int i=0; i<num.length-2; i++){
            int twoSum = target-num[i];
            int l = i+1, r=num.length-1;
            while (l<r){
                int sum = num[l] + num[r];
                if (sum<twoSum)
                    l++;
                else if (sum > twoSum)
                    r--;
                else{
                    List<Integer> result = new ArrayList<>();
                    result.add(num[i]);
                    result.add(num[l]);
                    result.add(num[r]);
                    results.add(result);
                    l++;r--;
                }

            }
        }


        return results;
    }
}