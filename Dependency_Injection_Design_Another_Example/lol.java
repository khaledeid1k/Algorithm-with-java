package Dependency_Injection_Design_Another_Example;
//https://mohamedisoliman.github.io/dependency-injection/
public class lol{
  public static void main(String[] args) {
      //in main application 
  Injector injector = Injector.getInstance();
  Person person = injector.getPerson();
  Person anotherPerson = injector.getPerson();

  Car fiat = injector.getFiat();
  Car lambo = injector.getLambo();
  
  person.drive();
  person.learnSomeStuff();

  anotherPerson.drive();
  anotherPerson.learnSomeStuff();


  System.out.println( fiat.getName());
  System.out.println(fiat.getSpeed());

  System.out.println(lambo.getName());
  System.out.println(lambo.getSpeed());
  }

}