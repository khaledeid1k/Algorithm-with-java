package SOLID_Design_Principles.D;

public class Not_Dependency_Inversion_Principle {


            public class DebitCard{
        public void doTransaction(int amount){
                System.out.println("tx done with DebitCard"+amount);
            }
        }
            public class CreditCard{
            public void doTransaction(int amount){
                System.out.println("tx done with CreditCard "+amount);
            }}

            public class ShoppingMall {
            private DebitCard debitCard;
            public ShoppingMall(DebitCard debitCard) {
                    this.debitCard = debitCard;
               }
            public void doPaymentByDebitCard( int amount){
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

                Not_Dependency_Inversion_Principle.DebitCard debitCardObj =
                outerObject.new DebitCard();

                Not_Dependency_Inversion_Principle.ShoppingMall shoppingMallObj =
                outerObject.new ShoppingMall(debitCardObj);

                shoppingMallObj.doPaymentByDebitCard(5000);
               
}
}
