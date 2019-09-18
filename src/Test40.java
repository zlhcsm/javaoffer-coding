/*
*
数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。
例如输入一个长度为9的数组{1,2,3,2,2,2,5,4,2}。
由于数字2在数组中出现了5次，超过数组长度的一半，因此输出2。如果不存在则输出0。
* */
public class Test40 {

    public int MoreThanHalfNum_Solution(int [] array) {
        int now = array[0];
        int num = 0;
        for(int i = 0; i < array.length; i++){
            if(num == 0){
                now = array[i];
                num ++;
            }else if(array[i] == now){
                num++;
            }else{
                num--;
            }
        }
        return testResult(array, now);
    }

    // 用来测试结果的正确性
    public int testResult(int [] array, int now){
        int num = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] == now){
                num ++;
            }
        }
        if(num > array.length/2){
            return now;
        }else{
            return 0;
        }
    }

}
