
public class reOrderLisgt {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) {
            this.val = val;
        }
    }

    public static void reorderList(ListNode head) {
        if (head == null || head.next == null || head.next.next == null) {
            return; 
        }

        ListNode n1 = head;
        ListNode temp = null;

        while (n1.next.next != null) {
            n1 = n1.next;
        }

        temp = n1.next;
        n1.next = null;
        temp.next = head.next;
        head.next = temp;

        reorderList(temp.next);
    }
    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
    
        reorderList(head);
        printList(head);
    }
    
}
