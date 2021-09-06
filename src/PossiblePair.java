import java.util.*;

public class PossiblePair {
        public void getPair(int[] arr,int target){
            //iteration
            //check valid
//            for(int i=0; i<arr.length; i++) {
//                   int rem = sum-arr[i];
//                   for(int j = 1; j<arr.length; j++) {
//                       if(rem == arr[j]){
//                           System.out.println(arr[i]+","+arr[j]);
//                       }
//                   }
//            }
            for (int i = 0; i <arr.length-1 ; i++) {
                int sum = arr[i]+ arr[i+1];
                if (sum == target){
                    count++;
                }
            }
        }

    public static void main(String[] args) {
            int[] arr ={1,5,7,-1,5};
            int sum= 6;
        PossiblePair pspair = new PossiblePair();
        pspair.getPair(arr,sum);
    }
}
