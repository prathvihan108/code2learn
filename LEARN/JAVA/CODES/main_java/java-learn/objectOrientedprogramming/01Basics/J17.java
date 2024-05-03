//Java supports only pass  by value and does not support pass by reference even tough u use wrapper classes

public class J17 {
    public static void swapNumbers(Integer num1, Integer num2) {
        Integer temp = num1;
        num1 = num2;
        num2 = temp;
    }

    public static void main(String[] args) {
        Integer num1 = new Integer(5);
        Integer num2 = new Integer(10);

        System.out.println("Before Swapping:");
        System.out.println("Number 1: " + num1);
        System.out.println("Number 2: " + num2);

        swapNumbers(num1, num2); //only valuses are passes not the reference to original object eben 
        //though we are using wrapper class this is because wrapper classes are final 

        System.out.println("\nAfter Swapping:");
        System.out.println("Number 1: " + num1);
        System.out.println("Number 2: " + num2);
    }
}
