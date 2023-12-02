//Constructors 
//Default constructors
class CWH { //Should not have any return type for constructor
    CWH(){  //constructor is a special type of mathod in a class ,which initialises the objects automatically
        System.out.println("This is the default constructor of CWH class.");
    }

}
public class J6 {
    public static void main(String[] args) {
        CWH obj1 = new CWH();

    }
}

/*//Parameterised constructor
 class CWH {
    CWH(String s, int b){

        System.out.println("This is the " +b+ "th video of "+ " "+ s);
    }

}
public class J6constructors {
    public static void main(String[] args) {
        CWH obj1 = new J6("CodeWithHarry Java Playlist",42); here obj1 is actually a reference to a object created"J6("CodeWithHarry Java Playlist",42)"

    }
}




 */