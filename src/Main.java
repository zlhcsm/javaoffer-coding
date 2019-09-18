import java.util.*;


public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


            String line = scan.nextLine();

            line = line.substring(1, line.length() - 1);
            line = line.replaceAll(" ", "");


            String[] arr = line.split(",");

            int[] ints = new int[arr.length];
            for (int i = 0; i < arr.length; i++) {
                ints[i] = Integer.valueOf(arr[i]);
            }

            int max = maxSequence(ints, arr.length);
            System.out.println(max);
    }


    public static int maxSequence(int[] arr, int len){
        int max, maxHere;
        maxHere = max = arr[0];
        for (int i = 0; i < len; i++) {
            if (maxHere <=0){
                maxHere = arr[i];
            }else
                maxHere += arr[i];
            if (maxHere > max)
                max = maxHere;
        }
        return max;
    }


}