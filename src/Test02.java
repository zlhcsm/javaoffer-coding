int maxsequence(int arr[], int len)
{
    int max = arr[0]; //初始化最大值为第一个元素
    for (int i=0; i<len; i++) {
        int sum = 0; //sum必须清零
        for (int j=i; j<len; j++) { //从位置i开始计算从i开始的最大连续子序列和的大小，如果大于max，则更新max。
            sum += arr[j]; 
            if (sum > max)
                max = sum;
        }
    }
    return max;

————————————————
版权声明：本文为CSDN博主「石锅拌饭」的原创文章，遵循 CC 4.0 BY-SA 版权协议，转载请附上原文出处链接及本声明。
原文链接：https://blog.csdn.net/sgbfblog/article/details/8032464
