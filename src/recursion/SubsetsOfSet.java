package recursion;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Write a method that returns all subsets of a set.
 */
public class SubsetsOfSet {
    public static void main(String[] args) {
        Set<Integer> originalSet = new HashSet<>();
        originalSet.add(4);
        originalSet.add(5);
        originalSet.add(6);
        System.out.println(powerSet(originalSet));

    }
    private static Set<Set<Integer>> powerSet(Set<Integer> originalSet){
        Set<Set<Integer>> sets = new HashSet<Set<Integer>>();
        if (originalSet.isEmpty()) {
            sets.add(new HashSet<Integer>());
            return sets;
        }
        List<Integer> list = new ArrayList<Integer>(originalSet);
        Integer head = list.get(0);
        Set<Integer> rest = new HashSet<Integer>(list.subList(1, list.size()));
        for (Set<Integer> set : powerSet(rest)) {
            Set<Integer> newSet = new HashSet<Integer>();
            newSet.add(head);
            newSet.addAll(set);
            sets.add(newSet);
            sets.add(set);
        }
        return sets;
    }
}
