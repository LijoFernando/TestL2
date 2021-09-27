package L2Second;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CommonElement {
    /*.return false.*/
    public static void getCommon(int[] ar1, int[] ar2, int[] ar3, int l) {
        List<Integer> commonList = new ArrayList<>();
        int i = 0;
        int j = 0;
        int k = 0;
        while (i <= l) {
            if (ar1[i] < ar2[j] && ar1[i] < ar3[k]) {
                i++;
            } else if (ar2[j] < ar1[i] && ar2[j] < ar3[k]) {
                j++;
            } else if (ar3[k] < ar2[j] && ar3[k] < ar1[i]) {
                k++;
            } else if (ar1[i] == ar2[j] && ar2[j] == ar3[k]) {
                commonList.add(ar1[i]);
                i++;
                j++;
                k++;
            }
        }
        System.out.println(Arrays.deepToString(commonList.toArray()));
    }


    public static void main(String[] args) {

        int ar1[] = {1, 5, 10, 20, 40};
        int ar2[] = {6, 7, 20, 80, 100};
        int ar3[] = {3, 4, 15, 20, 30, 70, 80, 120};
        int l = ar1.length - 1;
        int m = ar2.length - 1;
        int n = ar3.length - 1;
        getCommon(ar1, ar2, ar3, l);
    }
}
