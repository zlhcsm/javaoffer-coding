package offer.pack;

public class LinkOperator {

    // 构造函数
    public LinkOperator()
    {
        this.first = null;
        tail = first;
    }

    // 头结点
    public ListNode first;
    public ListNode tail;          // 尾结点

    // 尾插法建表
    public void addNode(int data)
    {
        ListNode s = new ListNode(data);
        if (this.first == null){
            this.first = s;
            tail = first;
        }else{
            tail.next = s;
            tail = s;
        }

    }

    // 打印所有结点
    public void showAllNodes() {
        ListNode current = first;
        System.out.println("生成链表");
        while (current != null) {
            System.out.print(current.val + "->");
            current = current.next;
        }
        System.out.println();
    }

}
