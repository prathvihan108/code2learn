public class J06 {
    public static void main(String[] args) {

        for(int i=0;i<=6;i++)
        {
            System.out.println(printDayOfweek(i));
        }
        
    }

    public static  String printDayOfweek(int day) //Each case in enhanced switch is an expression meaming that it produces a single value whing can be assigned again to others
    {
        return switch(day)  //Enhanced switch can return anything
        {
            case 1 ->"Mon";
            case 2 ->"Tue";
            case 3 ->"Wed";
            case 4 ->"Thur";
            case 5 -> "Fri";
            case 6 -> "Sat";
            case 0-> "sun";
            default -> "invalid";  //A switch statement should have default statement or else error

        };

    }
}
