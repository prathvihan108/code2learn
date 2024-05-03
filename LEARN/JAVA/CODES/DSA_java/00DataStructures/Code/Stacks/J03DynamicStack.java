//Creting a dynamic Stack which will not give Stackfull error

public class J03DynamicStack  extends CustomStack{ //just extend the already created class

    public J03DynamicStack()
    {
        super();//this calls super class constructor
    }

     public J03DynamicStack(int size)
    {
        super(size);//this calls super class constructor with size
    }
   
    @Override//override only one method since we have problem with this only
    //all other methods are same
    public boolean push(int item)
    {
        if(isFull())
        {
            int[] temp=new int[(data.length)*2] ;//  create an temporary array of the double the size of current array

            for(int i=0;i<data.length;i++) //copy the elements from data to temp
        {
            temp[i]=data[i];
        }
        data=temp; //change the reference variable


         }

         //At this point we know that the array is not full so push element

       return super.push(item);//insert item
    }




    

    



    
}

