//printing the nth fibo nuber

class J01
{
    public static void main(String[] args) {

        int n=1;

        System.out.println(fibo(n));
        
    }

    public static int fibo(int n)
    {
        if(n<2)
        {
            return n;
        }

        return fibo(n-1)+fibo(n-2);
    }
}