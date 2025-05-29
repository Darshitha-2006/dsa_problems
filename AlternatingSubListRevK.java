class ListNode{
    int value = 0;
    ListNode next;
    ListNode(int value){
        this.value = value;
    }
}
public class AlternatingSubListRevK {
    public static ListNode revAlt(ListNode head , int k){
        int p = 1;
        ListNode current = head;
        ListNode prev= null;
        while(true){
            ListNode lastNodeOfSubList = current;
            ListNode lastNodeOfFirstPart = prev;
            ListNode next = null;
            //reversing k nodes alternatively.
            
                for(int i=0; i<k && current!=null ;i++){
               
                    next = current.next;
                    current.next = prev;
                    prev = current;
                    current = next;
                }
                
            //connecting nodes
            if(lastNodeOfFirstPart!=null){
                lastNodeOfFirstPart.next = prev;
            }
            else{
                head = prev;
            }
            lastNodeOfSubList.next = current;

            for(int i=0;i<k&&current!=null;i++){
                prev=current;
                current= current.next;
            }
            if (current == null) {
                break;
            }
            

        }
        return head;
    }
    public static void main(String[] args) {
        ListNode list = new ListNode(2);
        list.next = new ListNode(4);
        list.next.next = new ListNode(6);
        list.next.next.next = new ListNode(8);
        list.next.next.next.next = new ListNode(10);

        ListNode res = revAlt(list, 2);
        while (res != null) {
            System.out.println(res.value);
            res = res.next;
        }
    }
}
