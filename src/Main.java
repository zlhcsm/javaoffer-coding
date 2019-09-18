import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 输入
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()){
            int n = scan.nextInt();
            char[] arr = new char[n];

            for (int i = 0; i < n; i++) {
                arr[i] = scan.next().charAt(0);
            }

            int h = 0;

            ArrayList<Character> list = new ArrayList<>();
            helper(arr, 0,1, h,list);
        }

        scan.close();
    }

    private static void helper(char[] arr, int i, int h, int maxH,ArrayList<Character> list) {
        char[] tmp = new char[arr.length + 2];

        int flag = 0;
        System.out.println(arr[i]);
//        if (h < maxH && arr[i] == '#'){
////            flag = 1;
////            list.add('#');
////            list.add('#');
////            for (int j = i + 2; j < tmp.length; j++) {
////                tmp[j] = arr[j - 2];
////            }
//        }
            list.add(arr[i]);
//        if (flag == 1){
//            if (tmp[i]!='#' && i*2 + 2 <= tmp.length){
//                helper(tmp, i * 2 + 1, h+1, maxH, list);
//                helper(tmp, i * 2 + 2, h+1, maxH, list);
//            }
//
//        }else{

            if (arr[i]!='#' && i*2 + 2 <= arr.length){
                helper(arr, i * 2 + 1, h+1, maxH, list);
                helper(arr, i * 2 + 2, h+1, maxH, list);
//            }
        }

    }

}