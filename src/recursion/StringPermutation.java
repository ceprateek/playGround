package recursion;

import java.util.ArrayList;
import java.util.List;

/**
 * Write a method to compute all permutations of a string
 */


public class StringPermutation {

    public static void main(String[] args) {
        StringPermutation stringPermutation = new StringPermutation();
        List<String> binaryNumbers = stringPermutation.getBinaryNumbers(2);
        System.out.println(binaryNumbers);
    }

    /*
    ab
    ba

    abc
    acb

    bac
    bca

    cab
    cba

     */
    public List<String> getStringPermutations(String s){
        List<String> result = new ArrayList<>();
        String temp = "";
        getStringPermutationsHelper(s,result,temp);
        return result;
    }

    public void getStringPermutationsHelper(String s, List<String> result, String temp){

    }


    public List<String> getBinaryNumbers(int n) {
        List<String> result = new ArrayList<>();
        String temp = "";
        getBinaryNumbersHelper(n, result, temp);
        return result;
    }

    public void getBinaryNumbersHelper(int n, List<String> result, String temp) {
        if (n==0){
            result.add(temp);
        }else {
            getBinaryNumbersHelper(n-1, result, temp + "0");
            getBinaryNumbersHelper(n-1, result, temp + "1");
        }
    }



}


