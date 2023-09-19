package isp;

public class InternetPaymentService extends PaymentService implements WebMoneyPayable,CreditCardPayable,PhonePayable{

    public void payWebMoney(double amount){
        System.out.printf("Internet pay by web money %.2f \n",amount);
    };
    public void payCreditCard(double amount){

        System.out.printf("Internet pay by credit card %.2f \n",amount);
    };
   public void payPhoneNumber(double amount){

       System.out.printf("Internet pay by phone number %.2f \n",amount);
    };
}
