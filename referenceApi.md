###易错类型
1，for中写错变量
###Arrays 类
`java.util.Arrays` 类能方便地操作数组，它提供的所有方法都是静态的。

具有以下功能：

- 给数组赋值：通过 fill 方法。
- 对数组排序：通过 sort 方法,按升序。
- 比较数组：通过 equals 方法比较数组中元素值是否相等。
- 查找数组元素：通过 binarySearch 方法能对排序好的数组进行二分查找法操作。
### String类
|方法名|描述|
|---|---|
|boolean endsWith(String suffix)|测试此字符串是否以指定的后缀结束。|
|int indexOf(int ch)|返回指定字符在此字符串中第一次出现处的索引。|
|int indexOf(String str)|返回指定子字符串在此字符串中第一次出现处的索引。|
|String replace(char oldChar, char newChar)|返回一个新的字符串，它是通过用 newChar 替换此字符串中出现的所有 oldChar 得到的。|