package SOLID_Design_Principles.D;

public class Not_Dependency_Inversion_Principle {


            public class DebitCard{
        public void doTransaction(int amount){
                System.out.println("tx done with DebitCard");
            }
        } 
            public class CreditCard{
            public void doTransaction(int amount){
                System.out.println("tx done with CreditCard");
            }}  
           
            public class ShoppingMall {
            private DebitCard debitCard;
            public ShoppingMall(DebitCard debitCard) {
                    this.debitCard = debitCard;
               }
            public void doPayment(Object order, int amount){
                debitCard.doTransaction(amount); 
             }
           
            }
        /*
if you observe this is wrong design of coding ,
now ShoppingMall class tightly coupled with DebitCard.

now there is some error in your debit card and user want to go with
 Credit card then this won’t be possible because 
ShoppingMall is tightly couple with Debit Card
        */
            public static void main(String[] args) {
                Not_Dependency_Inversion_Principle outerObject = 
                new Not_Dependency_Inversion_Principle();

                Not_Dependency_Inversion_Principle.DebitCard innerObject = 
                outerObject.new DebitCard();

                Not_Dependency_Inversion_Principle.ShoppingMall innerObject2 = 
                outerObject.new ShoppingMall(innerObject);

                innerObject2.doPayment("some order",5000);
               
}
}
