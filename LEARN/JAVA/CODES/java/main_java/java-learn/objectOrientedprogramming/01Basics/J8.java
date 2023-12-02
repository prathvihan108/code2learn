/*Create a class Game, which allows a user to play "Guess the Number" game once.

Game should have the following methods:
Constructor to generate the random number between 1 to 100,should prompt him until he guesses it right
takeUserInput() to take a user input of number
isCorrectNumber() to detect whether the number entered by the user is true
getter and setter for noOfGuesses */
import java.util.Random;
import java.util.Scanner;
class GuessNumber
{   int rand_num;
    int user_num;
    int count=0;
     
    GuessNumber() //Constructor
    {
        Random r=new Random();
        rand_num=r.nextInt(50);
        }

    public int getData()
    {
        Scanner sc= new Scanner(System.in);
        
         user_num=sc.nextInt();
      //  boolean res=isCorrectNumber();
       
        while(!(isCorrectNumber()))
        {   user_num=sc.nextInt();

            count=count+1;
            

        }
        System.out.printf("Computer generated %d ;",rand_num);
        return count;
    }
    
    public  boolean isCorrectNumber()
    {

        if(rand_num==user_num)
        {
            return true;
        }
        else
        {  
            if(this.rand_num >this.user_num)
            {
                System.out.println("is mote than what u guessed");
            }
            else{
                System.out.println("is less than what u typed");
            }


            return false;

        } 
    }
}

//if the getdata() method was  a static in the  the above class than we could have directly used "ClassName.methodName()" for calling the method
public class J8 {
    public static void main(String[] args) {
        GuessNumber obj = new GuessNumber(); //whwen ever objected is created constructor does its job
        int res= obj.getData();
        System.out.printf("You guessed the number in %d attempts :",res);

        
    }
}
