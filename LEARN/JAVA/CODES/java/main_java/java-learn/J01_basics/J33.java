//String formatings

public class J33
{
    public static void main(String args[])
    {


        String name ="Prathvi";
        float a=4.55556677f;
    System.out.printf("Name: %s age is %.2f%n\n",name,a); //notice %.2f,we can use %n also instead of \n
        String text="""
                Hello Every one:
                    \u2022 My name is Prathvi
                       \u2022 I am 20 years old  //note:\u2022 is unicode for dot
                """;//Notice the output
        System.out.println(text);

    }
}