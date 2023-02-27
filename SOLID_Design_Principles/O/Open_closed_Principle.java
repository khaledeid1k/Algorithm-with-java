package SOLID_Design_Principles.O;

public class Open_closed_Principle {

        //You can design something like below
    public interface NotificationService{
        public void sendOTP(String medium);
        public void sendTransactionNotification(String medium);
        }

        //EmailNotification implantation
    public class EmailNotification implements NotificationService{
        public void sendOTP(String medium){
        // write Logic using JavaEmail api
        }
        public void sendTransactionNotification(String medium){
        }
        }

        //Mobile Notification implementation
    public class MobileNotification implements NotificationService{
        public void sendOTP(String medium){
        // write Logic using Twilio SMS API
        }
        public void sendTransactionNotification(String medium){
        }
        }

        
       // similarly you can add implementation for WhatsApp notification service
    public class WhatsAppNotification implements NotificationService{
    public void sendOTP(String medium){
    // write Logic using whatsapp API
    }
    public void sendTransactionNotification(String medium){
    }
    }
}
