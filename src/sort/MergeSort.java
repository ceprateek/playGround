package sort;

public class MergeSort
{
    void sort(int arr[])
    {
        int low = 0;
        int high = arr.length-1;
        int[] helper = new int[high+1];
        sort(arr, helper, low, high);
    }

    void sort(int arr[], int[] helper, int low, int high){
        if (low<high){
            int middle = (low + high)/2;
            sort(arr, helper, low, middle);
            sort(arr, helper, middle+1, high);
            merge(low, middle, high, helper, arr);
        }
    }

    public void merge(int low, int middle, int high, int[] helper, int[] arr){
        for (int i=low; i<=high; i++){
            helper[i] = arr[i];
        }
        int i = low;
        int j = middle + 1;
        int k = low;
        while (i <= middle && j <= high) {
            if (helper[i] <= helper[j]) {
                arr[k] = helper[i];
                i++;
            } else {
                arr[k] = helper[j];
                j++;
            }
            k++;
        }
        while (i <= middle) {
            arr[k] = helper[i];
            k++;
            i++;
        }
    }

    /* A utility function to print array of size n */
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }

    // Driver program
    public static void main(String args[])
    {
        int arr[] = {1, 72, 8, 29, 11, 15};
        int n = arr.length;

        MergeSort ms = new MergeSort();
        ms.sort(arr);

        System.out.println("sorted array");
        printArray(arr);
    }
}
