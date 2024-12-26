package coderpad;

public class Convertion {

    public static String compute(int bytesQuantity){
        if(bytesQuantity < 1024){
            return String.valueOf(bytesQuantity);
        }
        else if(bytesQuantity < 1024*1024){
            int kibiBytes = bytesQuantity / 1024;
            return kibiBytes + " KiB";
        }
        else{
            int mebibytes  = bytesQuantity/(1024*1024);
            return mebibytes+" MiB";
        }
    }

    public static void main(String[] args){
        System.out.println(compute(1023));         // Output: 1023
        System.out.println(compute(2048));         // Output: 2 KiB
        System.out.println(compute(1048576));      // Output: 1 MiB
    }
}
