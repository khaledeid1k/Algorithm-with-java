package SOLID_Design_Principles.I;

public class Not_Interface_Segregation_Principle {
  /* For example let’s say you have an interface 
  called UPIPayment like below */

  public interface UPIPayments {
    
    public void payMoney();
    
    public void getScratchCard();
    
    public void getCashBackAsCreditBalance();
}
}
/*
 Now let’s talk about few implementation 
for UPIPayments like Google Pay and Paytm Google Pay support 
these features so he can directly implement 
this UPIPayments but Paytm doesn’t support 
getCashBackAsCreditBalance() feature so here we shouldn’t 
force client paytm to override this method by implementating
UPIPayments .
 */
   // create a separate interface who will deal with Cashback
