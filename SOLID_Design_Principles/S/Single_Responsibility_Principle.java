package SOLID_Design_Principles.S;

public class Single_Responsibility_Principle {
    public class PrinterService{
        public void printPassbook() {
               //update transaction info in passbook
           }
       }
     //  Similarly Loan related job
       
       public class LoanService{
       public void getLoanInterestInfo(String loanType) {
               if (loanType.equals("homeLoan")) {
                   //do some job
               }
               if (loanType.equals("personalLoan")) {
                   //do some job
               }
               if (loanType.equals("car")) {
                   //do some job
               }
           }
       }
      // similarly OTP related Job
       
       public class NotificationService{
       public void sendOTP(String medium) {
               if (medium.equals("email")) {
                   //write email related logic
                   //use JavaMailSenderAPI
               }
           }
       }
}
