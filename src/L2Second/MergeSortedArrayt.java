package L2Second;

import java.util.Arrays;

public class MergeSortedArrayt {
    public static void alternateSort(int ar1[], int ar2[]) {
        int length = ar1.length + ar2.length -2;
        int[] result = new int[length];
        int n = 0;
        int i = 0;
        int j = 0;
        while (n < result.length) {
            if (ar1[i] < ar2[j]) {
                result[n] = ar1[i];
                i++;
            } else {
                result[n] = ar2[j];
                j++;
            }
            n++;
        }

        System.out.println(Arrays.toString(result));
        getsoretd(result);
    }
    public static void getsoretd(int[] arr){
        int[] result = new int[arr.length];
        int i=0;
        int j= arr.length-1;
        for (int k = 0; k < result.length; k++) {
            if(k%2==0){
                result[k] = arr[i];
                i++;
            }
            else{
                result[k] = arr[j];
                j--;
            }

        }
        System.out.println(Arrays.toString(result));
    }

    public static void main(String[] args) {
        int ar1[] = {1, 5, 10, 20, 40};
        int ar2[] = {6, 7, 20, 80, 100};
        alternateSort(ar1, ar2);
    }
}
