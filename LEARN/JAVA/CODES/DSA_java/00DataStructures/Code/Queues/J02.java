/*
 * The queue operations generally involve adding elements to the rear (enqueue) and removing 
 * elements from the front (dequeue). The front and rear positions may change as 
 * elements are added or removed.
 */

//It follows FIFO
//we have 2 pointers front and rear
 //The front represents the oldest element in the queue.
 //The rear represents the newest element in the queue.
 //it not compulsary to have both the pointers must be given in linear  queue.

     //##Linear Queues##//
 ///linear ques may give queue full message even though if space is empty in reality
 
 //complexity of enqueue operartion on queue is O(1) since we are just inserting in both linkedlist and array implementation
 
  //complexity of removing an item from queue isO(N) for array implemenation of linear queue
 //since we need to shift the all elements back  by one index.But in linkedList implementation the complexity is O(1)
 //since we only change the front(end) pointer to point the next oldest element in queue
 //Cicular Queue also has O(1) compexity for dequeue operation

 //  here we are using only single pointer for implemetation
 //this is array implemetation
 


 class CustomQueue
 {
   private int[] data;
   private static final int DEFAULT_SIZE=10;
   int rear=-1;

   public CustomQueue()
   {

    this(DEFAULT_SIZE);

    
   }

   public CustomQueue(int size)
  {
    data=new int [size];
  }

  public boolean isFull()
  {
      return rear==data.length-1;
  }
  public boolean isEmpty()
  {
      return rear==-1;
  }


  public boolean insert(int item)
  {
      if(isFull())
      {
          System.out.println("Queue is Full");
          return false;
      }

      rear++;
      data[rear]=item;
      return true;
  }

  public int remove() throws Exception
  {
    if(isEmpty()){
      throw new Exception("Queue is Empty");

    }

    int removed=data[0];
    //Shift the elements to left;

    for(int i=1;i<=rear;i++)
    {
      data[i-1]=data[i];

  }

  

  rear--;
  return removed;
  }

  public int front() throws Exception
  {

    if(isEmpty()){
      throw new Exception("Queue is Empty");

    }
    return data[0];

  }

  public void display()
  {
    for(int i=0;i<=rear;i++)
    {
      System.out.print(data[i]+"-->");
    }
  }
 }
public class J02
 {

  public static void main(String[] args)  throws Exception
  {

    CustomQueue q=new CustomQueue();
  q.insert(34);
  q.insert(35);
  q.insert(37);
  q.insert(39);
  System.out.println("Removed"+q.remove()+"   Rear:"+q.rear);
  System.out.println("Removed"+q.remove()+"   Rear:"+q.rear);
  System.out.println("Removed"+q.remove()+"   Rear:"+q.rear);
  System.out.println("Front element is"+q.front()+"   Rear:"+q.rear);

 
  q.insert(400);

  q.display();
    
  }

  
    
}
