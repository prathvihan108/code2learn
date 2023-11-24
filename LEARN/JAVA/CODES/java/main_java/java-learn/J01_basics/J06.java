

public class J06 {
    public static void main(String[] args) {
        /* byte x = 5;
        int y = 6;
        short z = 8;
        int a = y + z;//Result is int
        float b = 6.54f + x;//Result is float
        System.out.println(b); */

        // Increment and Decrement Operators
        int i = 56;
        // int b = i++; // first b is assigned i (56) then i is incremented
        int j = 67;
        int c = ++j; // first j is incremented then c is assigned j (68)
        System.out.println(i++);//First prints then increaments
        System.out.println(i);
        System.out.println(++i);//First increaments then prints
        System.out.println(i);
        int y = 7;
        System.out.println( ++y *8);
        char ch = 'a';
        System.out.println(++ch);//output b
    }
}
