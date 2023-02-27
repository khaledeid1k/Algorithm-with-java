package Recursion;

public class Recursion_direct {
    
    static int factorial(int n){      
        if (n == 1)      
          return 1;      
        else      
          return(n * factorial(n-1));      
  }      

public static void main(String[] args) {  
System.out.println("Factorial of 5 is: "+factorial(5));  
for (int i = 0; i < 5; ++i) {
  System.out.println(i);
}
for (int i = 0; i < 5; i++) {
  System.out.println(i);
}
}  
}  
