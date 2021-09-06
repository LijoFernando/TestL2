import java.util.*;


public class PossibleSumUsingOperator {
    public void getPossibleSum(String arr,int target){
        //string to int iterrattion
        //check operator sum
        //print
        int sum =0;
        int mul =0;
        int value = Integer.parseInt(arr);
        int length = arr.length()-1;
        List<String>  sumList = new ArrayList<>();
        for(int i=0; i<=length; i++) {
            int no = Integer.parseInt(String.valueOf(arr.charAt(i)));
            sum+=no;
            mul*=no;
            div-=no;

        }

        //12/3
      //  int rem=0
        for(int j = 0; j<length; j++) {
            //123 //1/23 //12/3
            for (int i = j+1; i <=length; i++) {
                int bal = Integer.parseInt(arr.substring(i, length-i));
                int sNo = Integr.parseInt(arr.charAt(j));
                rem = bal/sNo;
                if(rem == 0) {

                }
            }

        }

        for (int i = 0; i <=length; i++) {
            String sumString="";
            String mulString="";
            if (sum == target ) {
                if(i==length){
                    sumString = sumString+""+String.valueOf(arr.charAt(i));
                }
                else {
                    sumString = sumString + "" + String.valueOf(arr.charAt(i)+"+");
                }
            }
            if (mul == target) {
                if(i==length){
                    sumString = sumString+""+String.valueOf(arr.charAt(i));
                }
               mulString = mulString+""+String.valueOf(arr.charAt(i)+"*");
            }
        }


        //String str ="123";






    }


    public static void main(String[] args) {
        String str ="123";
        int target = 6;
        PossibleSumUsingOperator psOp = new PossibleSumUsingOperator();

        psOp.getPossibleSum(str, target);
    }

}
