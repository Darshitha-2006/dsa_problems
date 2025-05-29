class ListNode{
    int value =0;
    ListNode next;
    ListNode(int value){
        this.value = value;
    }
}
public class RevLinkedList {
    public static ListNode rev(ListNode head){
        ListNode prev = null;
        ListNode current = head;
        ListNode next = null;
        while(current!=null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
    public static void main(String[] args) {
        ListNode list = new ListNode(2);
        list.next = new ListNode(4);
        list.next.next = new ListNode(6);
        ListNode res = rev(list);
        while(res!=null){
            System.out.println(res.value);
            res = res.next;
        }
    }
}
