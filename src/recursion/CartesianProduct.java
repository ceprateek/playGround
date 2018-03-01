package recursion;

import java.util.ArrayList;
import java.util.List;



/**
 * [1,2] [4,5] [8,9]
 * [1,4] [1,5]
 * [2,4] [2,5]
 */
public class CartesianProduct {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        List<Integer> list3 = new ArrayList<>();

        list1.add(1);
        list1.add(2);

        list2.add(4);
        list2.add(5);

        list3.add(7);
        list3.add(8);


        List<List<Integer>> input = new ArrayList<>();
        input.add(list1);
        input.add(list2);
        input.add(list3);

        System.out.println(getCartesianProduct(input));
    }

    public static List<List<Integer>> getCartesianProduct(List<List<Integer>> input) {
        List<List<Integer>> out = new ArrayList<>();
        if (input.size() == 1) {
            for (Integer i : input.get(0)) {
                List<Integer> o = new ArrayList<>();
                o.add(i);
                out.add(o);
            }
            return out;
        }
        for (int i = 0; i < input.size(); i++) {
            List<Integer> remove = input.remove(i);
            List<List<Integer>> cp = getCartesianProduct(input);
            for (Integer j : remove) {
                for (List<Integer> list : cp) {
                    List<Integer> n = new ArrayList<>();
                    n.addAll(list);
                    n.add(j);
                    out.add(n);
                }
            }
        }
        return out;
    }
}