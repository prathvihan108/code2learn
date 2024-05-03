//doubly linked list
//note:constructors can be public private or default,but they shoul not have return type
//Every thing is imagination here so u can solve easily
//only insertion functions are done here//u can similary follow for deletions


class DLL{

    private Node head;
    private Node tail;
    private int size;

    DLL()
    {
        this.size=0;;

    }

    public void insertFirst(int data)
    {
        Node node =new Node(data);
        node.next=head;
        node.prev=null;

        if(head!=null) //do it only if head is not null,or else it gives null pointer exception
        {
             head.prev=node;

        }
        head=node;
       

        

    }

    public void display()
    {
        Node temp =head; //no need to create new node just create reference variable of Node
        Node last=null;   //printing reverse same logic just start from reveese

        
        while(temp!=null)
       {
        last=temp; //last will refer to last node 
        
        System.out.print(temp.data+"-->");
        temp=temp.next;
       }
       
       System.out.println("\nReverse");

       while(last!=null)//printing in reverse;
       {
        System.out.print(last.data+"-->");
        last=last.prev;

       }
      
      

    }

    public void insertLast(int data)
    {
        Node node=new Node(data);
        node.next=null;//basic as we know
        //get the last node reference
        Node last=head;
        while(last.next!=null) //use last.next ==null to get tail in case tail is not given (since we know that last node will be pointing to null)
        {
            last=last.next;  
        }

        if(head==null)//Handling the edge case when head is null means list is empty
        {
            node.prev=null;
            head=node; //head itself will be the new node
            return;

        }
        //when head is not null
        last.next=node;
        node.prev=last;
    }

    public void insertAtPos(int index,int data) 
    {

            if(index==0)
        {
            insertFirst(data);
            return;

        } 
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

       Node node =new Node(data);
      
       node.next=temp.next;  //first u establish bridge on right side or else connection will be broken and u can not access next
       temp.next.prev=node;
       
       temp.next=node;
       node.prev=temp;
    
       size++;

    }
    //insertion after a particular value
    public void insertAfterValue(int afterVal,int data)
    {
        Node p=find(afterVal);//get the reference to node with given value

        if(p==null)
        {
            System.out.println("Value does not exist\n");

        }
        Node node=new Node(data);
        node.next=p.next;
        p.next=node;
        node.prev=p;
        if(node.next!=null)//handle this exception
        {
            node.next.prev=node; //this can cause null pointer exception if node.next is null(that is we are inseting at last)

        }


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

    Node find(int val)
    {
        Node temp=head;
        while(temp.data!=val)
        {
            temp=temp.next;
        }
        return temp;
    }

   

   private class Node{

        int data;
        Node next;
        Node prev;

      private Node(int data)
        {
            this.data=data;
        }

        private Node(int data,Node next,Node prev)
        {
            this.data=data;
            this.next=next;
            this.prev=prev;
        }
      
    }
}

class J02
{
    public static void main(String args[])
    {

        DLL list=new DLL();
        list.insertFirst(3);
          list.insertFirst(5);
          list.insertFirst(4);
          list.insertAfterValue(5, 67);
         // list.insertAtPos(2, 30);
         
          list.display();



    }
}