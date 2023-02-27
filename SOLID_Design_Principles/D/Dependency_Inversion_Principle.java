package SOLID_Design_Principles.D;

public class Dependency_Inversion_Principle {
    public interface BankCard {
         void doTransaction(int amount);
      }
      public class CreditCard implements BankCard{
        public void doTransaction(int amount){           
             System.out.println("tx done with CreditCard  "+ amount);
            }
        }
        public class DebitCard implements BankCard{
            public void doTransaction(int amount){
            System.out.println("tx done with DebitCard");
                }
            }

            public class ShoppingMall {
                private BankCard bankCard;
                public ShoppingMall(BankCard bankCard) {
                        this.bankCard = bankCard;
                    }
                public void doPayment(Object order, int amount){
                        bankCard.doTransaction(amount);
                    }
                
                }
public static void main(String[] args) {
    Dependency_Inversion_Principle outerObject = 
    new Dependency_Inversion_Principle();

    BankCard bankCard=outerObject.new CreditCard();
    ShoppingMall shoppingMall1=outerObject.new ShoppingMall(bankCard);
    shoppingMall1.doPayment("do some order", 10000);
}
}
