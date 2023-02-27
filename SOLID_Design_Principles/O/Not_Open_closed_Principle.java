package SOLID_Design_Principles.O;

public class Not_Open_closed_Principle {
    
    public class NotificationService{
        public void sendOTP(String medium) {
                if (medium.equals("email")) {
                    //write email related logic
                    //use JavaMailSenderAPI
                }
            }
        }
}
