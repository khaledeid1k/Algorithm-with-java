package Aggregation_Composition;

public class Employee {
    int id;
    int salary;
    Departnent departnent;
    //Composition
    Personalinformation Personalinformation;
    public Employee(  Departnent departnent,
                      int id, int salary,
     String fname,String mname,String lname,  String blood, String accountnumber,
     String nationality,String yearofbirth) {
        this.id = id;
        this.salary = salary;
        //Aggregation
        this.departnent = departnent;
        /*Composition : if i creat instance of employee that will creat with it 
        a new object of Personalinformation and if instance of Employee is Destroyed
        a instace of object will Destroyed 
        */
        Personalinformation = new Personalinformation
        (  fname, mname, lname,   blood,  accountnumber,
         nationality, yearofbirth);

        
    }
    @Override
    public String toString() {
        return "Employee [id=" + id + ", salary=" + salary + ", Personalinformation=" + Personalinformation
                + ", departnent=" + departnent + "]";
    }
   
    
}
