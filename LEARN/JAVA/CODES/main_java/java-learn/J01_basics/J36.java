//try something by changing static to non static and  all //flat to int etc
class J36 {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        float res=Divide.fundiv(2.0f,3.0f);
        System.out.println(res);
    }
    
    static class Divide //if u removes static it will show  error  //static keyword   for a clasvcan be used only when it is nested class
    {
        public static float fundiv(float a, float b)
        {
            float  c=(int)(a/b);//try different things with this statements and program  
            return c;
        }
    }
}