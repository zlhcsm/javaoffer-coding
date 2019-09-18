import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            int n = scan.nextInt();
            String[] arr = new String[n];

            for (int i = 0; i < n; i++) {
                arr[i] = scan.next();
            }

            createTree(arr);
        }
    }

    public static class TreeNode {

        private TreeNode left;
        private TreeNode right;

        private int value;

        public TreeNode(int value) {

            this.value = value;
        }
    }

    public static TreeNode createTree(String[] arr) {
        if (arr == null)
            return null;
        TreeNode[] nodeArray = new TreeNode[arr.length];
        for (int i = 0; i <= arr.length - 1; i++) {
            if (!arr[i].equals("#")) {
                if (nodeArray[i] == null) {
                    nodeArray[i] = new TreeNode(Integer.valueOf(arr[i]));
                }
                int index = 2 * i + 1;
                if (index < arr.length && !arr[index].equals("#")) {
                    nodeArray[index] = new TreeNode(Integer.valueOf(arr[index]));
                    nodeArray[i].left = nodeArray[index];
                } else {
                    nodeArray[i].left = null;
                }
                index++;
                if (index < arr.length && !arr[index].equals("#")) {
                    nodeArray[index] = new TreeNode(Integer.valueOf(arr[index]));
                    nodeArray[i].right = nodeArray[index];
                } else {
                    nodeArray[i].right = null;
                }
            }
        }
        return nodeArray[0];
    }
}