import java.util.LinkedList;
import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        scanner.close();
        System.out.println(helper(n, k));
    }

    private static int helper(int n, int k) {
        int ans = 0;
        if(n == 0 || k == 0)
            return -1;

        int index = -1;

        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            list.add(i);
        }

        while(list.size() > 1){
            // index现在保存的是删除的下标
            index = (index + k)%list.size();
            list.remove(index);
            index--;
        }

        return list.get(0);
    }

}