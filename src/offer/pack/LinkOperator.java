package offer.pack;

public class GenerateLink {

    // 构造函数
    public GenerateLink()
    {
        this.first = new ListNode(-1);
    }

    // 头结点
    public ListNode first;

    // 头插法建表
    public void addNode(int data)
    {
        ListNode s = new ListNode(-1); // 创建新结点
        s.val = data;
        s.next = first.next; // 将node插在原开始结点之前，头结点之后!!!
        first.next = s;
    }

    // 打印所有结点
    public void showAllNodes() {
        ListNode current = first;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }

    /**
     * 用来生成list节点列表
     * @param number：生成的个数
     * @param flag：1排序 0 乱序
     * @return 头结点
     */
    public ListNode genNodeList(int number, int flag){
        GenerateArr g = new GenerateArr();
        g.genArray(number, 0);
        ListNode res = null;
        return null;
    }

}
