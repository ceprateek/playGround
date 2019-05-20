package recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum {

    public static void main(String[] args) {
        CombinationSum cs = new CombinationSum();
        List<Integer> nums = new ArrayList<>();
        nums.add(2);
        nums.add(3);
        nums.add(5);
        //nums.add(7);
        System.out.println(cs.combinationSum(nums, 10));
    }

    public void indent(int n){
        for (int i=0; i<n; i++){
            System.out.print(" ");
        }
    }

    public List<List<Integer>> combinationSum(List<Integer> nums, int target){
        List<List<Integer>> list = new ArrayList<>();
        combinationSumHeler(nums, new ArrayList<>(), list, target, 0);
        return list;
    }

    public void combinationSumHeler(List<Integer> nums, List<Integer> chosen, List<List<Integer>> result,
                                    int remaining, int start){
        indent(chosen.size());
        System.out.println("combinationSumHeler (nums= " + nums + " chosen= " + chosen + " )");
        if (remaining<0)
            return;
        else if (remaining==0)
            result.add(new ArrayList<>(chosen));
        else {
            for(int i = start; i < nums.size(); i++){
                int choice = nums.get(i);
                chosen.add(choice);
                combinationSumHeler(nums, chosen, result, (remaining - choice), i);
                chosen.remove(chosen.size()-1);
            }
        }

    }
}
