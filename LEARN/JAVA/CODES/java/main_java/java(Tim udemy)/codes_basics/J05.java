public class J05{
    public static void main(String[] args) {
        int option = 2;
        int result = calculateResult(option);
        System.out.println("Result: " + result);
    }

    static int calculateResult(int option) {
        return switch (option) {
            case 1 -> 10;
            case 2 -> 20;
            default -> -1;
        };
    }
}

//diffrecen beteen traditional and enhanced

//in Java's enhanced switch statement (introduced as part of JEP 325 in Java 12),
// each case is an expression, meaning it produces a value that can be used in 
//assignments or other expressions. This is in contrast to the traditional switch 
//statement, where each case is a statement and doesn't directly produce a value.