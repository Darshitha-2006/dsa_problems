class ListNode{
    int value = 0;
    ListNode next ;
    ListNode(int value){
        this.value = value;
    }
}
public class RangerevLinkedList {
    public static ListNode rangeRev(ListNode head , int p, int q){
        ListNode prev = null;
        ListNode current = head;
        ListNode next = null;
        int strt =p;
        while(p>1){
            prev = current;
            current = current.next;
            p--;
        }
        ListNode LastNodeofFirstPart = prev;
        ListNode LastNodeofSubList = current;
        while(q>strt-1 && current !=null){
            next = current.next;
            current.next = prev;
            prev= current;
            current = next;
        }
        if(LastNodeofFirstPart!=null){
            LastNodeofFirstPart.next = prev;
        }
        LastNodeofSubList.next = current;
        return head;

    }
    public static void main(String[] args) {
        ListNode list = new ListNode(2);
        list.next = new ListNode(4);
        list.next.next = new ListNode(6);
        list.next.next.next = new ListNode(8);
        list.next.next.next.next = new ListNode(10);
        ListNode res = rangeRev(list,2,4);
        while(res!=null){
            System.out.println(res.value);
            res = res.next;
        }
    }
}
