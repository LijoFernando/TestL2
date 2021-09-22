package modelL2;

import java.util.Scanner;

public class SumSubArray {
    /*.iven an unsorted array A of size N that contains only non-negative integers, find a
contiguous subarray which adds to a given number S.
Example 1:
Input: N = 5, S = 12
A[ ] = {1,2,3,7,5}
Output: 2 4
Explanation: The sum of elements from 2nd position to 4th position is 12
Example 2:
Input: N = 10, S = 15
A[ ] = {1,2,3,4,5,6,7,8,9,10}
Output: 1 5
Explanation: The sum of elements from 1st position to 5th position is 15.*/
    public static void getSubArray(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int sum = 0;
        while (start <=end) {
            sum = getSum(arr, start, end);
           // System.out.println(start+","+end+"= "+sum);
            if(sum==target) {System.out.println((start+1)+"th "+"to "+(end+1)+"th."); break;}
            else if(sum>target) start++;
            else end--;
        }
        start = 0;
        end = arr.length - 1;
        sum = 0;
        while (start <=end) {
            sum = getSum(arr, start, end);
          //  System.out.println(start+","+end+"= "+sum);
            if(sum==target) {System.out.println((start)+"th "+"to "+(end)+"th."); break;}
            if(sum>target) end--;
        }

    }

    public static int getSum(int[] arr, int i, int j) {
        int sum = 0;
        while (i <=j) {
            sum += arr[i];
            i++;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,7,5};
        int target = 15;
        getSubArray(arr,target);
    }
}
