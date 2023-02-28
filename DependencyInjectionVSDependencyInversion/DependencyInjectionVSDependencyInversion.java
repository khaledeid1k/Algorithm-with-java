package DependencyInjectionVSDependencyInversion;

public class DependencyInjectionVSDependencyInversion {


    public static class Dependency_Inversion_Principle {

        public static class DebitCard implements Buy {

            @Override
            public String buyByYourWay(String amount) {
                return "tx done with DebitCard " + amount;

            }
        }

        public static class CreditCard implements Buy {
            @Override
            public String buyByYourWay(String amount) {
                return "tx done with CreditCard " + amount;

            }
        }

        interface Buy {
            String buyByYourWay(String amount);
        }

        public static class ShoppingMall {
            Buy buy;

            public void doPayment(String amount) {
                System.out.println(buy.buyByYourWay(amount));
            }

        }

    }

    public static class Dependency_Injection {

        public static class DebitCard implements Buy {

            @Override
            public String buyByYourWay(String amount) {
                return "tx done with DebitCard " + amount;

            }
        }

        public static class CreditCard implements Buy {
            @Override
            public String buyByYourWay(String amount) {
                return "tx done with CreditCard " + amount;

            }
        }

        interface Buy {
            String buyByYourWay(String amount);
        }

        public static class ShoppingMall {
            Buy buy;

            public ShoppingMall(Buy buy) {
                this.buy = buy;
            }

            public void doPayment(String amount) {
                System.out.println(buy.buyByYourWay(amount));
            }

        }

    }

    public static void main(String[] args) {

        //Dependency_Inversion_Principle
        Dependency_Inversion_Principle.ShoppingMall shoppingMall1 =
                new Dependency_Inversion_Principle.ShoppingMall();

        Dependency_Inversion_Principle.ShoppingMall shoppingMall2 =
                new Dependency_Inversion_Principle.ShoppingMall();

        shoppingMall1.buy = new Dependency_Inversion_Principle.CreditCard();
        shoppingMall2.buy = new Dependency_Inversion_Principle.DebitCard();

        shoppingMall1.doPayment("500");
        shoppingMall2.doPayment("300");


        //Dependency_Inject
        Dependency_Injection.CreditCard creditCard
                = new Dependency_Injection.CreditCard();

        Dependency_Injection.DebitCard debitCard
                = new Dependency_Injection.DebitCard();

        Dependency_Injection.ShoppingMall shoppingMallDJ =
                new Dependency_Injection.ShoppingMall(debitCard);
        shoppingMallDJ.doPayment("200");


    }

}
