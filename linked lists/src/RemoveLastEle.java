public class RemoveLastEle {
    static class Node{
        int data;
        Node next;
        Node(int temp){
            data = temp;
        }
    }
    static Node delete(Node head)
    {
        if(head == null || head.next == null)
        {
            return null;
        }
        Node temp = head;
        while (temp.next.next != null)
        {
            temp = temp.next;
        }
        temp.next = null;
        return head;
    }
    static  void printList(Node head){
        while (head != null){
            System.out.print(head.data+" ");
            head = head.next;
        }
    }

    public static void main(String[] args) {
        Node a1 = new Node(10);
        Node a2 = new Node(20);
        Node a3 = new Node(30);
        Node a4 = new Node(40);
        a1.next = a2;
        a2.next = a3;
        a3.next = a4;
        printList(a1);
        System.out.println();
        a1 = delete(a1);
        printList(a1);

    }
}
