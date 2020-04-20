package merge;

import java.util.ArrayList;
import java.util.List;

public class MergeSortedLists{
    public static void main(String[] args) {
        //Input: 1->2->4, 1->3->4
        List<Integer> l1 = new ArrayList<>();
        l1.add(1);l1.add(2);l1.add(4);
        List<Integer> l2 = new ArrayList<>();
        l2.add(3);l2.add(4);l2.add(5);
        List<Integer> l3 = new ArrayList<>();
        l3.add(2);l3.add(3);l3.add(6);
        List<Integer> mergedList = mergeLists(l1,l2);
        System.out.println(mergedList);

        List<List<Integer>> lists;

    }
    public static List<Integer> mergeLists(List<Integer> l1, List<Integer> l2){
        int mergedListSize = l1.size()+l2.size();
        List<Integer> mergedList = new ArrayList<>(mergedListSize);
        int i=0,j=0,k=0;
        while (i<l1.size()&&j<l2.size()){
            if (l1.get(i)<=l2.get(j)){
                mergedList.add(l1.get(i));
                i++;
            }else {
                mergedList.add(l2.get(j));
                j++;
            }
            k++;
        }
        if (i==l1.size()){
            while (j<l2.size()){
                mergedList.add(l2.get(j));
                j++;
            }
        }
        if (j==l2.size()){
            while (i<l1.size()){
                mergedList.add(l1.get(i));
                i++;
            }
        }

        return mergedList;
    }

    public static List<Integer> mergeLists(List<List<Integer>> list){
        List<Integer> mergedList = new ArrayList<>();





        return mergedList;
    }
}
