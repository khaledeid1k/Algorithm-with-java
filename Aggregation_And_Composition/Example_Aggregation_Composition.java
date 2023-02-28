package Aggregation_And_Composition;

public class Example_Aggregation_Composition {
    
 public static void main(String[] args) {
  Departnent departnent=new Departnent(255, 12);
    Employee employee=new Employee
    (departnent, 1, 5,"ali", "ahmed", "omar" , "O", 
    "2121", "BAK", "1998") ;
    
    System.out.println(employee);

 }   
}
