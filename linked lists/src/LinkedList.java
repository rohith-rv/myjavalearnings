import java.util.Scanner;

//  Java program to  all insertion methods
class LinkedList
{
    Node head; // head of list
    class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }

    /* Inserts a new Node at front of the list. */
    public void push(int new_data)
    {
        Node new_node = new Node(new_data);     //create a new node
        new_node.next = head;                   //link to head node
        head = new_node;                        //make new node as HEAD
    }

    /* Inserts a new node after the given prev_node. */
    public void insertAfter(Node prev_node, int new_data)
    {
        /* 1. Check if the given Node is null */
        if (prev_node == null)
        {
            System.out.println("The given previous node cannot be null");
            return;
        }
        Node new_node = new Node(new_data);                 //create a new node
        new_node.next = prev_node.next;                     //make next of new node as next of previous node
        prev_node.next = new_node;                          //point previous node. next to new node

    }

    /* Insert a new node at the end.*/
    public void append(int new_data)
    {
        Node new_node = new Node(new_data);                  //create new node
        if (head == null)
        {
            head = new Node(new_data);
            return;
        }
        Node last = head;                                   //point nw node next as null
        while(last.next!=null)                              //traverse till the last node
            last = last.next;
        last.next = new_node;                               //point last node next as new node
        return;
    }

    public Node deleteEvenNodes(Node head){
        Node current = head;
        while (current != null && current.next != null){
            current.next = current.next.next;
            current = current.next;
        }
        return head;
    }

    public Node deleteOddNodes(Node head){
        Node current = head;
        while (current != null && current.next != null) {
            current = current.next;
            current.next = current.next.next;
        }
        this.head = head.next;
        return head;
    }

   public void evenOdd(Node head)
    {
        int odd = 0, even = 0;
        int pos = 1;

        Node cur = head;
        while (cur != null)
        {
            if (pos % 2 == 0)      // If current node's data is even
                even += cur.data;
            else
                odd += cur.data;
            cur = cur.next;     //to move to next node
            pos = pos + 1;
        }
        System.out.println("\nEven Sum = " + even);
        System.out.println("Odd Sum = " + odd);
    }

    public void evenOddPosition(Node head)
    {
        int odd = 0, even = 0;
        Node cur = head;
        while (cur != null)
        {
            if (cur.data % 2 == 0)      // If current node's data is even
                even += cur.data;
            else
                odd += cur.data;
            cur = cur.next;     //to move to next node
        }
        System.out.println("Even pos Sum = " + even);
        System.out.println("Odd pos Sum = " + odd);
    }
    public void findMiddlElement(Node head){
        Node slow, fast ;
        slow = head;
        fast = head;
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println(slow.data);;
    }

    public void printNthElemntFromLast(Node head, int n){
            int len = 0;
            Node cur = head;
            while (cur != null) {
                cur = cur.next;
                len++;
            }
            cur = head;
              int i = 1;
              while (i < len-n + 1){
                  cur = cur.next;
                  i++;
              }

            System.out.println(cur.data);

    }

    public void printNthEleFromLast_1(Node head, int n){
        Node slow = head;
        Node fast = head;
        int i = 0;
        while(i < n-1){
            fast = fast.next;
            i++;
        }
        while (fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }
        System.out.println(slow.data);;
    }
    /* This function prints contents of linked list starting from the given node */
    public void printList()
    {
        Node tnode = head;
        while (tnode != null)
        {
            System.out.print(tnode.data+" ");
            tnode = tnode.next;
        }
    }

    public static void main(String[] args)
    {
        LinkedList list_1 = new LinkedList();

        // Insert 6. So linked list becomes 6->NUllist
        list_1.append(6);

        // Insert 7 at the beginning. So linked list becomes
        // 7->6->NUllist
        list_1.push(7);

        // Insert 1 at the beginning. So linked list becomes
        // 1->7->6->NUllist
        list_1.push(1);

        // Insert 4 at the end. So linked list becomes
        // 1->7->6->4->NUllist
        list_1.append(4);

        // Insert 8, after 7. So linked list becomes
        // 1->7->8->6->4->NUllist
        list_1.insertAfter(list_1.head.next, 8);

        System.out.println("\nCreated Linked list is: ");
        list_1.printList();

        //list_1.evenOdd(list_1.head);

        //list_1.evenOddPosition(list_1.head);

        // System.out.println("\n middle element of linked list is");
        // list_1.findMiddlElement(list_1.head);

        Scanner input = new Scanner(System.in);
        System.out.println("\nEnter the position from last");
        int n = input.nextInt();
        System.out.println("\nThe " + n + " element is");
        list_1.printNthEleFromLast_1(list_1.head, n);
        System.out.println();
    }
}

