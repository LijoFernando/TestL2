package modelL2;

import java.util.Arrays;

public class MergeSort {
    public static void merge(int[] arr, int start, int mid, int end) {
        int s1AryL = mid - start + 1;
        int s2AryL = end - mid;
        int[] s1Ary = new int[s1AryL];
        int[] s2Ary = new int[s1AryL];
        for (int i = 0; i < s1AryL; i++) s1Ary[i] = arr[start + i];
        for (int i = 0; i < s2AryL; i++) s2Ary[i] = arr[mid + 1 + i];

        int i1=0;
        int i2=0;
        int k = start;
        while(i1<s1AryL && i2<s2AryL){
            if(s1Ary[i1]>=s2Ary[i2]){
                arr[k]=s2Ary[i2];
                i2++;
            }
            else{
                arr[k] =s1Ary[i1];
                i1++;
            }
            k++;
        }
        //remaining elemet push
        while(i1<s1AryL){
            arr[k]=s1Ary[i1];
            i1++;
            k++;
        }
        while(i2<s2AryL){
            arr[k]=s2Ary[i2];
            i2++;
            k++;
        }

    }
    public static void sort(int[] arr, int start, int end) {
        if (start < end) {
            int mid = (start + end) / 2;
            sort(arr, start, mid);
            sort(arr, mid+1, end );
            merge(arr, start, mid, end);
        }
    }

    public static void main(String[] args) {
        int[] arr = {5,2,20,1,12,3,4,7};
        int start =0;
        int end = arr.length-1;
        sort(arr, start, end);
        System.out.println(Arrays.toString(arr));

    }

}
