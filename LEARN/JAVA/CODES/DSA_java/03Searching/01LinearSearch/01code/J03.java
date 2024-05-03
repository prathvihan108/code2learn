//Searcing in strings
//same concept as of numbers
//we are returning true if char is present or else returns false
//we can cretate many variations of this programs easily
public class J03 {

    public static void main(String[] args) {
        String str="Hello World";
        char target='o';
        boolean ans=LinearSearch(str,target);
        System.out.println(ans);

    }

    public static boolean LinearSearch(String str ,char target)
   {
    if(str.length()==0)
    {
        return false;
    }
    else{
       /*  for(int i=0;i<str.length();i++)
        {
        if(str[i]==target)//can not do this way str[i] can not be done on strings
        {
            return 1
        }
        }*/  

        for(char c:str.toCharArray()) //we can use this method without importing anything
        {
            if(c==target)
            {
                return true;
            }

        }
    }
    return false;
   }
    
}
