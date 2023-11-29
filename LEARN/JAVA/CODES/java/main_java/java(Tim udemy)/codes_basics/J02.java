public class J02 {
    public static void main(String[] args) {
     //   int a="s";  //this will raise an error
        int b='s';//implicit conversion will happen
        System.out.println(b);


        char ch1='3';

        char ch2 ='4';

        System.out.println(ch1+ch2);  // 103: it will add the unicode points(decimalRepresentationOfUnicodes) and gives answer
        System.out.println(""+ch1+ch2);//34  ://it will just join the sting that is 34 //this is becoz string is given high precedence
    }


}
