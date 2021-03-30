//Insertion at a given position
    class position{
        // A linked list Node
        static class Node {
            int data;
            Node next;
            // inserting the required data
            public Node(int data) {
                this.data = data;
                this.next = null;

            }
        }

        // function to create and return a Node
        static Node GetNode(int data) {
            return new Node(data);
        }

        // function to insert a Node at required position
        static Node InsertPos(Node head, int position, int data) {

            if (position < 1)
                System.out.print("Invalid position");

            // if position is 1 then new node is
            // set infornt of head node
            // head node is changing.
            if (position == 1) {
                Node newNode = new Node(data);          //create new node
                newNode.next = head;            //assign newnode.next as head
                head = newNode;                         //assign head as new node
            } else {
                while (position != 0) {
                    if (position == 1) {

                        Node newNode = GetNode(data);       // adding Node at required position
                        newNode.next = head.next;           // Making the new Node to point to the old Node at the same position
                        head.next = newNode;                // Replacing current with new Node to the old Node to point to the new Node
                        break;
                    }
                    head = head.next;
                }
                if (position != 1)
                    System.out.print("Position out of range");
            }
            return head;
        }

        static void PrintList(Node node) {
            while (node != null) {
                System.out.print(node.data);
                node = node.next;
                if (node != null)
                    System.out.print(",");
            }
            System.out.println();
        }

        // Driver code
        public static void main(String[] args) {
            Node head = GetNode(3);
            head.next = GetNode(5);
            head.next.next = GetNode(8);
            head.next.next.next = GetNode(10);

            System.out.print("Linked list before insertion: ");
            PrintList(head);

            int data = 12, pos = 3;
            head = InsertPos(head, pos, data);
            System.out.print("Linked list after" + " insertion of 12 at position 3: ");
            PrintList(head);

            // front of the linked list
            data = 1;
            pos = 1;
            head = InsertPos(head, pos, data);
            System.out.print("Linked list after" + "insertion of 1 at position 1: ");
            PrintList(head);

            // insetion at end of the linked list
            data = 15;
            pos = 7;
            head = InsertPos(head, pos, data);
            System.out.print("Linked list after" + " insertion of 15 at position 7: ");
            PrintList(head);
        }
    }



