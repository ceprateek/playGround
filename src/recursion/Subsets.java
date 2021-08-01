package recursion;

import java.util.ArrayList;
import java.util.List;

public class Subsets {

    public static void main(String[] args) {
        List<String> strs = new ArrayList<>();
        strs.add("prateek");
        strs.add("garg");
        strs.add("deepti");
        strs.add("singhal");
        Subsets s = new Subsets();
        //s.subsets(strs);

        long count = "abc;cvb;dfg;yth".chars().filter(ch -> ch == ';').count();
        System.out.println(count);
    }

    public void subsets(List<String> strs){
        subsetsHelper(strs, new ArrayList<>());
    }

    public void subsetsHelper(List<String> strs, List<String> chosen){
        System.out.println("strs: "+ strs.toString() + " chosen: "+ chosen.toString());
        if (strs.isEmpty()){
            System.out.println(chosen);
            return;
        }
        String first = strs.get(0);
        strs.remove(first);
        subsetsHelper(strs, chosen);
        chosen.add(first);
        subsetsHelper(strs,chosen);

//        chosen.remove(first);
//        strs.add(first);
    }


}
