package removeDups;

import java.util.Arrays;

public class RemoveDups {

}

class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0;
        for (int j=0; j<nums.length;j++){
            if (nums[i]!=nums[j]){
                nums[++i] = nums[j];
            }
        }
        return ++i;
    }

    public int removeDuplicates2(int[] nums) {
        int i = 0;
        for (int n : nums)
            if (i < 2 || n > nums[i-2])
                nums[i++] = n;
        return i;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] in = {0,0,1,1,1,2,2,3,3,3,3,4,4,4,4};
        int length = s.removeDuplicates2(in);
        System.out.println(Arrays.toString(in));
        System.out.println(length);
    }
}
