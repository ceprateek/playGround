/**
 * Created by prategar on 5/11/17.
 */

public class sorts {
    public static void main(String[] args) {
        Integer[] array = {1, 12, 5, 26, 7, 14, 3, 17, 2};
        Integer[] array1 = {11, 121, 51, 261, 71, 141, 31, 171, 21};
        Sort<Integer> algo = new MergeSort();
        algo.sort(array);
        //algo.sort(array1);
        System.out.println("----Result----");
        //Integer[] result = mergeSortedArrays(array, array1);
        //printArray(result);
    }

    public static void printArray(Integer[] array) {
        System.out.print("[");
        for (Integer i : array)
            System.out.print(i + " ");
        System.out.print("]");
        System.out.println();
    }


    public static Integer[] mergeSortedArrays(Integer[] arr1, Integer[] arr2) {
        Integer[] result;
        int i = 0;
        int j = 0;
        int k = 0;
        int totalLength = arr1.length + arr2.length;
        result = new Integer[totalLength];

        while (i < arr1.length && j < arr2.length)
            result[k++] = arr1[i] < arr2[j] ? arr1[i++] :  arr2[j++];

        while (i < arr1.length)
            result[k++] = arr1[i++];


        while (j < arr2.length)
            result[k++] = arr2[j++];

        return result;
    }
}

abstract class Sort<T> {
    public abstract void sort(T[] array);

    public void printArray(T[] array) {
        System.out.print("[");
        for (T i : array)
            System.out.print(i + " ");
        System.out.print("]");
        System.out.println();
    }
}

class SelectionSort extends Sort<Integer> {
    @Override
    public void sort(Integer[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int a = array[i];
                    array[i] = array[j];
                    array[j] = a;
                }
            }
            printArray(array);
        }
        printArray(array);
    }
}

class BubbleSort extends Sort<Integer> {
    @Override
    public void sort(Integer[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int a = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = a;
                }
            }
            printArray(array);
        }
        printArray(array);
    }
}

class QuickSort extends Sort<Integer> {
    Integer[] values;
    Integer length;

    @Override
    public void sort(Integer[] array) {
        this.values = array;
        this.length = array.length;
        printArray(array);
        quickSort(0, length - 1);
        printArray(array);
    }

    private void quickSort(int low, int high) {
        int i = low;
        int j = high;
        int pivot = (low + high) / 2;
        while (i < j) {
            while (values[i] < values[pivot])
                i++;
            while (values[j] > values[pivot])
                j--;
            if (i <= j) {
                int tmp = values[i];
                values[i] = values[j];
                values[j] = tmp;
                i++;
                j--;
            }
        }
        if (low < j)
            quickSort(low, j);
        if (i < high)
            quickSort(i, high);
    }
}


class MergeSort extends Sort<Integer> {
    Integer[] values;
    Integer[] helper;
    Integer length;

    @Override
    public void sort(Integer[] array) {
        this.values = array;
        this.length = array.length;
        this.helper = new Integer[this.length];
        int low = 0;
        int high = array.length - 1;
        printArray(array);
        mergeSort(low, high);
        printArray(values);
    }

    public void mergeSort(int low, int high) {
        if (low < high) {
            int middle = low + (high - low) / 2;
            mergeSort(low, middle);
            mergeSort(middle + 1, high);
            merge(low, middle, high);
        }
    }

    public void merge(int low, int middle, int high) {
        for (int i = low; i <= high; i++) {
            helper[i] = values[i];
        }
        int i = low;
        int j = middle + 1;
        int k = low;
        while (i <= middle && j <= high) {
            if (helper[i] <= helper[j]) {
                values[k] = helper[i];
                i++;
            } else {
                values[k] = helper[j];
                j++;
            }
            k++;
        }
        while (i <= middle) {
            values[k] = helper[i];
            k++;
            i++;
        }

    }
}























