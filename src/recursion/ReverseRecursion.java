package recursion;

import java.util.ArrayList;
import java.util.List;

public class ReverseRecursion {

    public static void main(String[] args) {
        List<String> strs = new ArrayList<>();
        strs.add("Prateek1");
        strs.add("Prateek2");
        strs.add("Prateek3");
        strs.add("Prateek4");
        strs.add("Prateek5");
        for (String str : strs){
            System.out.println(str);
        }
        System.out.println("---------------");
        print(strs);
    }

    public static void print(List<String> strs){
        String str = strs.get(0);
        if (strs.size()==1){
            System.out.println(str);
            return;
        }
        print(strs.subList(1,strs.size()));
        System.out.println(str);
    }
}
