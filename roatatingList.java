class ListNode{
    int value =0;
    ListNode next;
    ListNode(int value){
        this.value = value;
    }
}
public class roatatingList {
    public static ListNode rotate(ListNode head,int k){
        ListNode current = head;
        ListNode prev = null;
        while(current!=null){
            prev = current;
            current = current.next;
            if(current.next == null){
                current.next = head;
                break;
            }
        }
        for(int i=0;i<k;i++){
            current= current.next;
        }
        ListNode newHead = current.next;
        current.next = null;

        return newHead;
    }
    public static void main(String[] args) {
        ListNode list = new ListNode(2);
        list.next = new ListNode(4);
        list.next.next = new ListNode(6);
        list.next.next.next = new ListNode(8);
        list.next.next.next.next = new ListNode(10);

        ListNode res = rotate(list, 3);
        while (res != null) {
            System.out.println(res.value);
            res = res.next;
        }
    }
}
