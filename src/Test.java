import java.util.ArrayList;

public class Test {
    public static void main(String[] args) throws Exception{
        int[] arr1 = new int[10];
        int[] arr2 = new int[10];
        for(int i=0; i<arr1.length; i++){
            arr1[i] = i;
            arr2[i] = i+5;
        }
        Test t = new Test();
        System.out.println(t.findDupsArrays(arr1, arr2));
    }

    ArrayList<Integer> findDupsArrays(int[] arr1, int[] arr2){
        ArrayList<Integer> output = new ArrayList<>();
        for(int i=0; i<arr1.length; i++){
            int firstArrNum = arr1[i];
            for (int j=0; j<arr2.length; j++){
                int secondArrNum = arr2[j];
                if (firstArrNum == secondArrNum){
                    output.add(secondArrNum);
                }
            }
        }
        return output;
    }
}

