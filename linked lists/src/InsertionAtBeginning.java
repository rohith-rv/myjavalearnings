/*

// InsertionAtBeginning
{
    public void insert(int new_data) {
        Node new_node = new Node(new_data);     //create a new node
        new_node.next = head;                   //link to head node
        head = new_node;                        //make new node as HEAD

    }
}


// InsertionAtEnd
        {
            void insert(){
                Node new_node = new Node(new_data);         //create new node
                new_node.next = null;
                Node last = head;                           //point nw node next as null
                while(last.next!=null)                      //traverse till the last node
                    last = last.next;
                last.next = new_node;                       //point last node next as new node
                return;
        }
        }


// Insertion In Between
        {
        public void insertBetween(Node prev_node, int new_data)
        {
        Node new_node = new Node(new_data);                 //create a new node
        new_node.next = prev_node.next;                     //make next of new node as next of previous node
        prev_node.next = new_node;                          //point previous node. next to new node
        }
        }
 */