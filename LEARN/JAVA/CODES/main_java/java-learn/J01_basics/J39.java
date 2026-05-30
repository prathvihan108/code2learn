//Narrowing conversion in the java;
/*
 *   The reason why the first line (s += Math.pow(2, 5) * d;) does not give an error,
 *  while the second line (s = s + Math.pow(2, 5) * d;) does, is due to the difference in the compound assignment
 *  operator (+=) and the assignment operator (=).
1. += Compound Assignment Operator:

When you use the += compound assignment operator, like in s += Math.pow(2, 5) * d;, Java automatically 
performs a compound assignment conversion, which means that the result of the expression on the right-hand 
side is automatically narrowed to fit into the type of the left-hand side variable (s in this case).
So, even though Math.pow(2, 5) * d results in a double, Java automatically narrows it to an int before adding it 
to s, because s is of type int. This narrowing conversion is done implicitly by the compiler.

2. = Assignment Operator:

When you use the assignment operator (=), like in s = s + Math.pow(2, 5) * d;, Java does not
 perform compound assignment conversion. Instead, the result of the expression on the right-hand side is not automatically narrowed, and you need to explicitly cast it to an int if you want to assign it to s.
So, in this case, because Math.pow(2, 5) * d results in a double, and you're trying to assign it
 to an int variable s, you need to explicitly cast it to an int to avoid a compilation error.
Conclusion:

In summary, the difference lies in how Java handles compound assignment (+=) and regular assignment (=) with respect to type conversion. The compound assignment operator automatically narrows the result to fit into the type of the variable, while the regular assignment operator requires explicit casting if the types do not match.
 */
import java.util.*;
import java.io.*;

public class J39{
    public static void main(String []argh){
        int s=9;
        int d=9;
        s+=Math.pow(2,5)*d;//this is ok
        s=(int)(s+Math.pow(2,5)*d);//this is also ok
       // s=s+Math.pow(2,3)*6;  this will raise an error

        
       
    
       
         
        }
   
}
    
    
