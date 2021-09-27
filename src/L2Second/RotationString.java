package L2Second;

public class RotationString {
    public static boolean isRotation(String str, String str2){
       // XVD  VDX
       // char [] letter =str.toCharArray();
        boolean isRotated = false;
        String gnString = str;
        for (int i = 0; i <str.length() ; i++) {
            String balance = gnString.substring(1);
            String rotated =balance+gnString.charAt(0);
           // System.out.println(rotated+" equals "+str2);
            if(rotated.equals(str2)){
               isRotated = true;
            }
            gnString = rotated;
        }
        return isRotated;
    }

    public static void main(String[] args) {
        String str="DEV";
        String str1 ="VDE";
        System.out.println(isRotation(str,str1));
    }
}
