/*r

import com.sun.org.apache.xpath.internal.objects.XNodeSet;

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}
public class LinkedList {
    Node head;
    LinkedList(){
        head = null;
    }

    public void insert (int data) {
        Node new_node = new Node(data);
        if (this.head == null) {
            this.head = new_node;

        } else {
            Node current = this.head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = new_node;

        }
    }

    public void print (){

        Node current = this.head;
        while (current != null)
        {
            System.out.println(current.data);
            current = current.next;
        }

    }


    public boolean search(int item) {
        Node current = this.head;
        while (current != null) {
            if (current.data == item) {
                return true;

            }
            current = current.next;
        }
        return false;

    }

    public void deletion(int position) {
        if (head == null)
            return;
        Node temp = head;
        if (position == 0) {
            head = temp.next;
            return;
        }

        for (int i = 0;temp != null && i < position - 1; i++)
            temp = temp.next;
        System.out.println(temp.data);
        if (temp == null || temp.next == null)
            return;

        //Node next = temp.next.next;
        temp.next = temp.next.next;


    }

    public static void main(String[] args)
    {
        LinkedList list1 = new LinkedList();
        list1.insert(0);
        list1.insert(1);
        list1.insert(2);
        list1.insert(3);
        list1.insert(4);
        list1.insert(5);

        boolean result = list1.search(3);
        System.out.println(result);

        list1.deletion(6);

        list1.print();

    }
}

*/