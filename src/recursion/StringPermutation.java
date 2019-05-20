package recursion;

import java.util.ArrayList;
import java.util.List;

/**
 * Write a method to compute all permutations of a string
 */


class StringPermutation{
    List<String> list = new ArrayList<>();
    public void permutate(String s){
        permutateHelper(s, "");
    }

    public void indent(int n){
        for (int i=0; i<n; i++){
            System.out.print(" ");
        }
    }

    public static void main(String[] args) {
        StringPermutation s = new StringPermutation();
        s.permutate("abc");
        System.out.println(s.list.size());
    }

    public void permutateHelper(String s, String chosen){
        indent(chosen.length());
        //System.out.println("PermuteHelper (s= " + s + " chosen= " + chosen + " )");
        if (s.isEmpty()){
            System.out.println(chosen);
            list.add(chosen);

        }else {
            for (int i=0; i<s.length(); i++){
                //choose
                char c = s.charAt(i);
                chosen = chosen + c;
                String stemp = getStringMinusIndex(s, i);


                //explore
                permutateHelper(stemp, chosen);

                //unchoose
                chosen = chosen.substring(0, chosen.length()-1);
            }
        }
    }

    public static String getStringMinusIndex(String input, int index){
        StringBuilder sb = new StringBuilder(input);
        sb = sb.deleteCharAt(index);
        return sb.toString();
    }
}
