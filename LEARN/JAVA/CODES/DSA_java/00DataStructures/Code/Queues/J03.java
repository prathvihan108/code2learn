// CircularQueue.java

// CircularQueues

//we are using front and rear pointer here
//we need to handle circular buffer.

/*
 * Efficient Memory Utilization: Circular queues allow immediate reuse of dequeued positions, preventing gaps in memory.

No Wasted Space at the Front: Dequeuing from the front in a circular queue avoids wasting space, unlike linear queues.

//complexity of removal is O(1) since we only increament the front pointer
 */

class CircularQueue {
  private int[] data;
  private static final int DEFAULT_SIZE = 4;
  int rear = -1;
  int front = -1;
  int count = 0; // New variable to keep track of the number of elements for easiness

  public CircularQueue() {
      this(DEFAULT_SIZE);
  }

  public CircularQueue(int size) {
      data = new int[size];
  }

  public boolean isFull() {
      return count == data.length; //u can think of another condition  to chack if queue is full
  }

  public boolean isEmpty() {
      return count == 0;
  }

  public void insert(int item) {
      if (isFull()) {
          System.out.println("Queue is Full. Cannot enqueue.");
      } else {
          if (front == -1) {
              // If the queue is initially empty, set both front and rear to 0.
              front = rear = 0;
          } else {
              // Move rear to the next circular position.(_)
              rear++;
              rear = (rear) % data.length;//to handle circular position properly /suppose rear ==10(size of array) then 10%10=0 so rear will become 0
              //rear = (rear+1) % data.length; this line is smae as above 2 lines for handling circular buffer
            }



          data[rear] = item;
          count++; // Increment count
          System.out.println("Enqueued: " + item);
      }
  }

  public int remove() throws Exception {
      if (isEmpty()) {
          throw new Exception("Queue is Empty");
      }

      int removed = data[front];
      front++;
      front = (front) % data.length;//when ever front+1 exceed the range of maxIndex then wrap it to 0// alo it works properly when 
      count--; // Decrement count

      // Check if the queue becomes empty after removal
      if (isEmpty()) {
          front = rear = -1; // Reset front and rear to -1
      }

      return removed;
  }

  public int front() throws Exception {
      if (isEmpty()) {
          throw new Exception("Queue is Empty");
      }
      return data[front];
  }
  public void display() {
    if (isEmpty()) {
        System.out.println("Queue is Empty.");
    } else {
        System.out.print("Queue elements: ");
        int i = front;
        do {
            System.out.print(data[i] + " ");
           // i++;
            //i = (i) % data.length;

            //is same as
            i = (i+1) % data.length; //if i+1  crosses the max index then wrap up to 
        } while (i != (rear+1)%data.length); //just remember this for travesing through circular buffer u will not stuck 
        //rear+1 here is to print up to i not eual to rear+1 index(if it equals rear+1 index it will stop printing) this ensures that all 
        //elements are printed up to rear
        //and %data.length esures proper circular buffer
        System.out.println();
    }
}

}

// J03.java

public class J03 {
  public static void main(String[] args) throws Exception {
      CircularQueue q = new CircularQueue();
      q.insert(34);
      q.insert(35);
      q.insert(37);
      q.insert(39);
      System.out.println("Removed: " + q.remove() + "  Front: " + q.front + "   Rear: " + q.rear);
      System.out.println("Removed: " + q.remove() + "  Front: " + q.front + "   Rear: " + q.rear);
      System.out.println("Front element is: " + q.front() + "   Rear: " + q.rear);

      q.display();
  }
}
