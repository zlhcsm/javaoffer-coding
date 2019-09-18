package offer.pack;

import java.util.Arrays;

public class Generate {
    /**
     * @param flag 1,排序  0，乱序
     * @param number 生成的个数
     * */
    public int[] genArray(int number, int flag){

        int[] result = new int[number];

        for(int i=0;i<number;i++){
            int n = (int)(Math.random()*100);
            result[i] = n;
        }

        // 如果传入的值是1就进行排序操作
        if (flag == 1)
            Arrays.sort(result);

        System.out.println("生成长度为"+number+(flag==1?"个有序":"个无序")+"数组。");
        for (int i : result) {
            System.out.print(i + " ");
        }
        System.out.println();
        return result;
    }

    /**
     * 生成链表
     * @param number
     * @param falg
     * @return
     */
    public ListNode genLinkedList(int number, int falg){
        LinkOperator l = new LinkOperator();
        int[] arr = genArray(number, falg);
        for (int i : arr) {
            l.addNode(i);
        }
        l.showAllNodes();
        System.out.println(l.first.val);
        return l.first;
    }
}
