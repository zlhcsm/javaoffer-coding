//<<<<<<< HEAD
////public class Test02 {
////}
////package shenxinfu;
////
////import java.util.Scanner;
////
////public class CreateTree {
////
//// public static class TreeNode{
////
////  private TreeNode left;
////  private TreeNode right;
////
////  private int value;
////
////  public TreeNode(int value) {
////
////   this.value = value;
////  }
//// }
//// public static TreeNode createTree(String[] arr){
////  if(arr == null)
////   return null;
////  TreeNode[] nodeArray = new TreeNode[arr.length];
////  for(int i = 0; i <= arr.length - 1; i++){
////   if(!arr[i].equals("#")){
////    if(nodeArray[i] == null){
////     nodeArray[i] = new TreeNode(Integer.valueOf(arr[i]));
////    }
////    int index = 2 * i + 1;
////    if(index < arr.length && !arr[index].equals("#")){
////     nodeArray[index] = new TreeNode(Integer.valueOf(arr[index]));
////      nodeArray[i].left = nodeArray[index];
////    }else
////    {
////     nodeArray[i].left = null;
////    }
////    index++ ;
////    if(index < arr.length && !arr[index].equals("#")){
////     nodeArray[index] = new TreeNode(Integer.valueOf(arr[index]));
////     nodeArray[i].right = nodeArray[index];
////    }else
////    {
////     nodeArray[i].right = null;
////    }
////   }
////  }
////  return nodeArray[0];
//// }
////public static String preOrderTravel(TreeNode node) {
////  if(node == null)
////   return "#,";
////  String res = node.value + ",";
////  res += preOrderTravel(node.left);
////  res += preOrderTravel(node.right);
////  return res;
////    }
////    @SuppressWarnings("resource")
////// public static void main(String[] args) {
//////  Scanner scanner = new Scanner(System.in);
//////  String string = scanner.nextLine();
//////  String[] strings = string.split(",");
//////  TreeNode root = createTree(strings);
//////  String s = preOrderTravel(root);
//////  System.out.println(s.substring(0,s.length() - 1));
////// }
//=======
//public boolean isIsomorphic2(String s, String t) {
//        if (s == null || t == null)
//            return false;
//        if (s.length() != t.length())
//            return false;
//        Map<Character, Character> map = new HashMap<Character, Character>();
//        Set<Character> set = new HashSet<Character>();
//        char c1, c2;
//        for (int i = 0; i < s.length(); i++) {
//            c1 = s.charAt(i);
//            c2 = t.charAt(i);
//
//            if (map.containsKey(c1)) {
//                if (map.get(c1) != c2)
//                    return false;
//            } else {
//                if (set.contains(c2))
//                    return false;
//                else {
//                    map.put(c1, c2);
//                    set.add(c2);
//                }
//            }
//        }
//        return true;
//    }
//————————————————
//版权声明：本文为CSDN博主「杜鲁门」的原创文章，遵循 CC 4.0 BY-SA 版权协议，转载请附上原文出处链接及本声明。
//原文链接：https://blog.csdn.net/bug_moving/article/details/52788409
//>>>>>>> d47baaa5e870b07db7f5da371e78e91074f6191e
