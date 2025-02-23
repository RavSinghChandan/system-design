package adapter.payment;

public class PayPal {
    public void makePayment(String email, double amount){
        System.out.println("Email is : "+email+"Amount is : "+amount + "By PayPal Payment ");
    }
}
