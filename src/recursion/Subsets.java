package recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subsets {

    public static void main(String[] args) {
        Subsets s = new Subsets();
        int[] nums = {1, 2, 3};
        System.out.println(s.subsets(nums));
    }

    public List<List<Integer>> subsets(int[] nums){
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        List<Integer> ints = new ArrayList<>();
        for (int i : nums){
            ints.add(i);
        }
        subsetsHelper(ints, temp, result);
        return result;
    }

    public void subsetsHelper(List<Integer> ints, List<Integer> listSoFar, List<List<Integer>> result){
        if (ints.size()==0){
            List<Integer> finished = new ArrayList<>(listSoFar);
            result.add(finished);
        }else {
            int chosen = ints.get(0);
            ints.remove(0);

            listSoFar.add(chosen);
            subsetsHelper(ints, listSoFar, result);

            listSoFar.remove(listSoFar.size()-1);
            subsetsHelper(ints, listSoFar, result);

            ints.add(0,chosen);
        }
    }
}
