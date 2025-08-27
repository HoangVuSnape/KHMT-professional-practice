import java.util.*;
public class BinarySearch {
    // Insertion sort
    public static void SelectionSort(int[] arr){
        int n = arr.length;
        
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                if(arr[minIndex] > arr[j]) {
                    minIndex = j;
                }
            }

            int temp = arr[minIndex]; //value
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;

        for(int i = 0; i < n - 1; i++) {
            boolean swapped = false;

            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j+1]) {

                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                    swapped = true;

                }
            }
            if(!swapped) break;

        }
        
    }

    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        // ArrayList<String> ar = new ArrayList<String>();

        // ar.add("Vu");
        // ar.add("AN");

        // System.out.println(ar);

        // for (int i = 0; i < ar.size(); i++) {
        //     System.out.println(ar.get(i));
        // }

        int[] arr = {64, 25, 12, 22, 11};
        SelectionSort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("\n \\\\");
        int[] arr2 = {55, 44,22, 11, 3, 6};
        bubbleSort(arr2);
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }

        System.out.println("\n \\\\");
        int[] arr3 = {12, 11, 13, 5, 6};
        insertionSort(arr3);
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + " ");
        }
    }
}
