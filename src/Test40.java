import java.util.*;


/*
*
输入n个整数，找出其中最小的K个数。
例如输入4,5,1,6,2,7,3,8这8个数字，则最小的4个数字是1,2,3,4,。
* */
public class Test40 {


        public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
            ArrayList<Integer> result = new ArrayList<Integer>();
            int length = input.length;
            if(k > length || k == 0){
                return result;
            }
            PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(k, new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    return o2.compareTo(o1);
                }
            });

            for(int i = 0; i < length; i++){
                if(maxHeap.size() != k){
                    maxHeap.offer(input[i]);
                }else if (maxHeap.peek() > input[i]){
                    Integer tmp = maxHeap.poll();
                    tmp = null;
                    maxHeap.offer(input[i]);
                }
            }

            for(Integer integer: maxHeap){
                result.add(integer);
            }
            return result;
        }


}
