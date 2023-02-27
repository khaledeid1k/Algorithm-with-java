package SOLID_Design_Principles.I;

public class Interface_Segregation_Principle {
    public interface UPIPayments {
    
        public void payMoney();
        
        public void getScratchCard();
            }
    public interface CashbackManager{
        public void getCashBackAsCreditBalance();
       }
     
}

 