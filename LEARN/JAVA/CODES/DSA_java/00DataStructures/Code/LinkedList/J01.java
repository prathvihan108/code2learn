//Singly  Linked List
//node has two parts data and address
//Head points to first node
//Tail points to last node
//last node points to null
//in singly LL one node stores the address of its next node only ,it has no idea about its previous node
class LL
{
    
    private Node head; //tail and head will be pointing to null initially by java rules
    private Node tail;
   
    private  int size;

    public LL()
    {
        this.size=0;
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

    void insertFirst(int data)
    {

        Node node=new Node(data); //create a new node
        node.next=head;    //  initially when the insertFirst function is called first time the head is pointing to null
      
        head=node; //dont follow head.next here sicne head will be initially null

        if(tail==null) //this is the first item we had in the list
        //dont use head pointer to check if it is the first element because head will be pointing to 
        //first node as soon as first element is inserted but tail may be still pointing to null when list was made empty
        {
            tail=head;

        }

        size+=1;


    }

    public void insertLast(int data)
    {
        if(tail==null)//it means list is empty  ,we use tail pointer to check if list is empty becase when we delete all the items on by one from list tail is decremented and if only one item item 
        //is left and once we delete last item also then tail will be pointing to null,
        {
            insertFirst(data);
            return;
        }

        Node node =new Node(data);
        tail.next=node; //this.next is no more a tail now after this line
        tail=node; ///tail must point last node always so make it point to last node

        size++;

    }
    public void insertAtPos(int data,int index)
    {
        if(index==0)
        {
            insertFirst(data);
            return;

        } //how ever if u dont write these two cases then too the insertion will happen accourdingly but u can save time by doing so
        if(index==size-1)
        {
            insertLast(data);
            return;
        }

      
       Node temp=head;
       for(int i=1;i<index;i++)
       {
        temp=temp.next;

       }

       Node node =new Node(data,temp.next);//see book notes for understanding logic
       temp.next=node;//here the actial modification to ll happens
       size++;


      


    }

    public int deleteFirst()
    {
        int val=head.data;
        head=head.next;//if head.next is pointing to null then list has only one item.
        //need to check if  list has only one item because we need to assign tail to null
        if(head==null)//if list has only one item ,then head.next will be pointing to null wich is assigned to head ,so make tail also null
                        //note :we use head pointer only to check if there is only one item because,tail.next will be always pointing to null(after complete operation)
        { 
            tail=null;

        }

        size--;
        return val;
    }

    public int deleteLast()
    {
        if(size<=1)
        {
            
            return deleteFirst();
        }

        Node secondLast=get(size-2);//it will give reference to second last element
        int val=tail.data;
        tail=secondLast;
        tail.next=null;
        size--;
        return val;
    }

    public int deleteAtPos(int index)
    {
        if(index==0)
        {
            return deleteFirst();
        }

        if(index==size-1)
        {
            return deleteFirst();
        }

        Node prev=get(index-1); //will give the reference of previous node (node behind the actual node to be deleted)
        int val=prev.next.data;
        prev=prev.next.next;//breaks the middle link and points to node after the node to be deleted(the node is now actually deleted )
        size--; //even though the deleted node id still pointing to same node the next node but since we have broken the link to reach the deleted node so no need to change the pointer of deleted node
        return val;
    }

    public Node find(int val)
    {
        Node temp=head;
        while(temp!=null)
        {
            if(temp.data==val)
            {
                return temp;
            }
            temp=temp.next;  //returns reference to null;
        }

        return null;//if no value fond reurn null;
    }



    Node get(int index)
    {
        Node temp=head;
        for(int i=0;i<index;i++)
        {
            temp=temp.next;
        }
        return temp;



    }

     void display()
    {
       // Node node=new Node(30);
        Node temp=head;  //use temp node for traversing because u cannot modify head until u want to modify LL

        while(temp!=null)
        {
            System.out.print(temp.data+"-->");
           

            temp=temp.next;
        }
          System.out.println("\nSize:"+size);

    }
}

public class J01{

    public static void main(String args[])
    {

        LL list =new LL();
    
        list.insertFirst(4);
        list.insertFirst(2);
        list.insertFirst(1);

        list.insertLast(99);
        list.insertAtPos(400,3);
       
        list.display();
}

    }
    