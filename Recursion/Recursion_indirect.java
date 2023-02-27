package Recursion;


public class Recursion_indirect {
    
//Check if number odd or even
    public static boolean oddNum(int i) {
        if (i<0) throw new IllegalArgumentException("Number is negative");
        if(i == 0){
        return false;
        } else {
        return evenNum(i-1);
        }
        }
    public static boolean evenNum(int i) {
        if (i<0) throw new IllegalArgumentException("Number is negative");
        if(i == 0){
        return true;
        } else {
        return oddNum(i-1);
        }
    }
    
   
    // move any ood to even and any even to odd 
    public static int n=1;
    public static void even(){
    if(n<=10){
        System.out.println(n-1);
        n++;
        odd();
    }
    return;
}
    public static void odd(){
        if(n<=10){
            System.out.println(n+1);
            n++;
            even();
            
        }
        return;
   }
    public static void main(String[] args) {
   
        // int n = 5;
        // if (evenNum(n)) System.out.println(n + " is even");
        // else System.out.println(n + " is odd");
        

     // move any ood to even and any even to odd 
     // we call odd function because we handel odd number n=1
        odd();
        }

}