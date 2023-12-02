 class Animal {
    protected int legs;

    public void printLegs() {
        System.out.println("Legs: " + legs);
    }
}

public class J08 extends Animal{
    private int legs;

    public J08(int legs) {
        super.legs = legs; // 'super' is used to refer to the superclass field while using inheritance
    }
}
