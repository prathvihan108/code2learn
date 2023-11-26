public class J09{

//Strings are immutable
public static void main(String[] args) {
    char[] str = {'H','A','R','R','Y'};
     String s = new String(str);

     //is same as
   String s1 = "Harry";
   s1="hello"; //this is ok ,we are completitly changing the string so
   System.out.println(s1);
   //length of string
   int l=s1.length();
   System.out.printf("Length of string is %d\n",l);//U couldn't have used println for this format

   //Conacatenation
   String s2= "Hello";
   String s3="World";
   String res=s2+" i am "+s3;
   System.out.println(res);
}
}

