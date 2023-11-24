//By changing number of arguments,
public class J28{
     int multiply(int a,int b)
     {
        return a*b;
    }
    float multiply(int a,int b,int c){ //return type also changed along with no of parameters,but for it u need to change the catching variable to float type or else it will show error
         return  a*b*c;
    }

public static void main(String[] args) {

        J28 obj = new J28();
        int c = obj.multiply(5,4);
        float d = obj.multiply(5,4,3);
        System.out.println(c);
        System.out.println(d);

}
}
