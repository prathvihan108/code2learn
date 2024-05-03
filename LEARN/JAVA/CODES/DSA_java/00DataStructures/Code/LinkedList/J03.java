//Circular LL
//here head will be pointing to null only when list is empty,if list has at least one item also head points itself
/*
 * A circular linked list is a type of linked list where the last node of the list points back to the first node instead of containing a null reference, creating a loop.
 * 
 *  Here are some points about circular linked lists:

    Termination: Unlike a traditional linked list where the last node points to null, in a circular linked list, the last node points to the first node, forming a closed loop.

    Traversal: Traversing a circular linked list requires careful handling to avoid an infinite loop. It's essential to have a condition to stop the traversal or keep track of a starting point.

    Insertion and Deletion: Insertion and deletion operations in a circular linked list are similar to those in a regular linked list. However, extra care must be taken to update the pointers correctly to maintain the circular structure.

    Memory Utilization: Circular linked lists can be more memory-efficient than singly linked lists in certain scenarios since there is no need for a separate null reference to mark the end of the list.
 */
//for our reference we are using head and tail

class CLL{
    private Node head;
    private Node tail;

    public void insertAfterTail(int data)
    {
        Node node=new Node(data);  //create new node

        if(head==null)//check if head is null that is list is empty(Edge case)
        {
            head=node; 
            tail=node;
            return;
        }
        
        tail.next=node; //just do imagination of circular ll u will easily get logic
        node.next=head;
        tail=node;

    }
     
    public void delete(int val)//delete a a node in CLL based on value
    {
        Node node=head;
        //case1  
        if(node==null)
        {
            return;
        }
        //case 2
        if(node.data==val)//Head itself has the value to be deleted then do this
        {
            head=head.next;//move the head forward
            tail.next=head;  //tail.next always refers to head in CLL
            return;

        }
        //case3
        //if both the above are not cases then do following

        do{

        Node n=node.next; //n is reference to next node of current node while traversing
        if(n.data==val)
        {
            node.next=n.next;//breaks the link of n from CLL
            //break;  if i add break statement then it will only delete first instance 




        }
         node=node.next; //just move forward the node


        }while(node!=head);
      

    }
    public void display() //if no value fond then this function is not going to delete anything
    {
        Node temp=head;

        if(head!=null)
        {
            do{
                System.out.print(temp.data+"-->");
                temp=temp.next;

            }while(temp!=head);
        }
        System.out.println();
    }

    CLL()
    {
        this.head=null;
        this.tail=null;
    }


     class Node
    {
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            
        }

        public Node (int data,Node next )
        {
            this.data=data;
            this.next=next;
        }
    }

}

class J03
{
    public static void main(String args[])
    {

        CLL list =new CLL();
    
        list.insertAfterTail(4);

        list.insertAfterTail(5);

        list.insertAfterTail(6);

        list.insertAfterTail(5);
        list.display();

        list.delete(5);

        System.out.print("\nAfter Deletion\n");
        
      
       
        list.display();
}
}
