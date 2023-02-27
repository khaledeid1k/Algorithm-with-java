package Recursion;

public class Non_tail_recursive_function {
       // A NON-tail-recursive function.
    // The function is not tail
    // recursive because the value
    // returned by fact(n-1) is used
    // in fact(n) and call to fact(n-1)
    // is not the last thing done by
    // fact(n)
    static int fact(int n)
    {
        if (n == 0)
            return 1;
 
        return n * fact(n - 1);
    }
 
    // Driver program
    public static void main(String[] args)
    {
        System.out.println(fact(5));
    }
}
