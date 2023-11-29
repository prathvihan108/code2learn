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

