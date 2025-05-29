class ListNode {
    int value = 0;
    ListNode next;

    ListNode(int value) {
        this.value = value;
    }
}

public class revAllSublistsK {
    public static ListNode revSubListsAll(ListNode head, int k) {
        ListNode current = head;
        ListNode prev = null;

        while (true) {
            ListNode lastNodeOfSubList = current;
            ListNode lastNodeOfFirstPart = prev;
            ListNode next = null;

            int i = 0;
            // Reverse k nodes
            while (current != null && i < k) {
                next = current.next;
                current.next = prev;
                prev = current;
                current = next;
                i++;
            }

            // Connect with previous part
            if (lastNodeOfFirstPart != null) {
                lastNodeOfFirstPart.next = prev;
            } else {
                head = prev;
            }

            // Connect with next part
            lastNodeOfSubList.next = current;

            if (current == null) {
                break;
            }

            // Prepare for next group
            prev = lastNodeOfSubList;
        }

        return head;
    }

    public static void main(String[] args) {
        ListNode list = new ListNode(2);
        list.next = new ListNode(4);
        list.next.next = new ListNode(6);
        list.next.next.next = new ListNode(8);
        list.next.next.next.next = new ListNode(10);

        ListNode res = revSubListsAll(list, 3);
        while (res != null) {
            System.out.println(res.value);
            res = res.next;
        }
    }
}
