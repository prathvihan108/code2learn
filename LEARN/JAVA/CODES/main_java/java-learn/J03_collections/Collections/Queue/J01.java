/*
 * Queue Interface

Queue interface maintains the first-in-first-out order. It can be defined as an ordered list that is used to hold the elements which are about to be processed. There are various classes like PriorityQueue, Deque, and ArrayDeque which implements the Queue interface.

Queue interface can be instantiated as:

    Queue<String> q1 = new PriorityQueue();  
    Queue<String> q2 = new ArrayDeque();  
 */
/*PriorityQueue
 * 
 * The PriorityQueue class implements the Queue interface. 
 * It holds the elements or objects which are to be processed by their priorities. 
 * PriorityQueue doesn't allow null values to be stored in the queue.
 */

 /*
  * When elements are added to a PriorityQueue, they are ordered according to their natural ordering (if they implement the Comparable interface) or by a comparator provided at queue construction time.

The priorities are decided based on the ordering of elements specified by either:

    Natural Ordering: If the elements inserted into the PriorityQueue implement the Comparable interface(String objects implement the comparable interface), 
    the PriorityQueue will use the natural ordering defined by the compareTo method of the elements to determine 
    their priority.
   
    "PriorityQueue<String> queue = new PriorityQueue<String>();//THIS BY DEFAULT ACTS AS  MIN HEAP//(i.e) the element which is haiving the smallest value will be having the heigher priority.
    
    The elements are ordered based on their natural ordering because String objects implement the Comparable interface. 
    The natural ordering of strings is lexicographic order.


    Custom Comparator: Alternatively, you can specify a custom comparator when creating the PriorityQueue. 
    The comparator is used to order the elements in the queue according to the logic defined in the comparator's 
    compare method.
    
   " PriorityQueue<String> queue = new PriorityQueue<String>(Comparator.reverseOrder());"//Since the String already implements the comparator interface so we can call it
   Note:"Comparator.reverseOrder()"  is a static method in "Comparator" interface

  */


package Collections.Queue;

import java.util.*;  
public class J01{  
public static void main(String args[]){  
PriorityQueue<String> queue=new PriorityQueue<String>();  //This is min heap,means the smallest element will be the having 
//heigher priority and so will be held on top,if we add/remove ant element from the priority queue then it
// rearanges automatically(Integer)

//PriorityQueue<String> queue=new PriorityQueue<String>(Comparator.reverseOrder());  //This acts as a max heap(Integer)
//Since we know that the String interface implements the Comparable interface,so the string will be sorted in natural way
queue.add("Amit Sharma");  
queue.add("Vijay Raj");  
queue.add("JaiShankar");  
queue.add("Raj");  
System.out.println("head:"+queue.element());  
System.out.println("head:"+queue.peek());  
System.out.println("iterating the queue elements:");  
Iterator itr=queue.iterator();  
while(itr.hasNext()){  
System.out.println(itr.next());  
}  
queue.remove();  
queue.poll();  
System.out.println("after removing two elements:");  
Iterator<String> itr2=queue.iterator();  
while(itr2.hasNext()){  
System.out.println(itr2.next());  
}  
}  
}  