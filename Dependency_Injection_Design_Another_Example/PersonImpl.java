package Dependency_Injection_Design_Another_Example;
public class PersonImpl implements Person {

    private Car car;
 
     public PersonImpl(Car car) {
        this.car = car;
     }
    
     public void drive() {
        System.out.println("driving " + car.getName());
    }

    public void learnSomeStuff(){
        System.out.println("learning some stuff");
    }
}
