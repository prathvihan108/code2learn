/*
 * The stack is a fundamental data structure that follows the Last In, First Out (LIFO) principle. 
 * In a stack, elements are added and removed from the same end, known as the "top" of the stack. 
 * Here are some key points about the stack data structure:
 */

class CustomStack
{
    public static final int DEFAULT_SIZE=10;
    protected int[] data;

    int top=-1;

    CustomStack() //when no argument is specified during object creation ,then the size will be default size
    {
        this(DEFAULT_SIZE);//A constructor calling another constructor with argument deafult size
    }


    CustomStack(int size)
    {
        this.data=new int[size];
    }

    public boolean push(int item)
    {
        if(isFull())
        {
            System.out.println("Stack is Full");
            return false;
        }

        top++;
        data[top]=item;
        return true;
    }
   
    public boolean isFull()
    {
        return top==data.length-1;
    }
    public boolean isEmpty()
    {
        return top==-1;
    }

    public int pop() throws Exception
    {
        if(isEmpty())
        {
          throw new Exception("Can not pop from empty Stack!");
        }

       // int y=data[top];
        //top--;
        //return y;

        return data[top--]; //in simple combine all 3 lines in to one line
    }

    public int peek() throws Exception
    {

        if(isEmpty())
        {
          throw new Exception("Can not peek from empty Stack!");
        }



        return data[top];
    }
}

public class J02
{
    public static void main(String args[]) throws Exception
    {
       /*  CustomStack stack=new CustomStack();
        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.push(8);
        stack.push(9);
        stack.push(1);
        stack.push(56);
        stack.push(34);

        System.out.print(" "+stack.pop());

        System.out.print(" "+stack.pop());

        System.out.print(" "+stack.pop());

        System.out.print(" "+stack.pop());*/

       //  CustomStack stack=new CustomStack(); //this will give exception

        CustomStack stack=new J03DynamicStack();  //this will not give exception
        stack.push(5);//note:referenece type specifies what all can we access,and object type specifies which method is called in case of overriding happens
        stack.push(6);
        stack.push(7);
        stack.push(8);
        stack.push(9);
        stack.push(1);
        stack.push(56);
        stack.push(34);
        stack.push(34);
        stack.push(34);
        stack.push(34);
        stack.push(34);
        stack.push(34);

        System.out.print(" "+stack.pop());

        System.out.print(" "+stack.pop());

        System.out.print(" "+stack.pop());

        System.out.print(" "+stack.pop());



    }
}
