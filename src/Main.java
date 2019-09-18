import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (scan.hasNext()){
            int n = scan.nextInt();

            int res = 0;
            for (int i = 0; i < n; i++) {
                int num = scan.nextInt();
                res = res ^ num;
            }
            System.out.println(res);

        }

    }

}