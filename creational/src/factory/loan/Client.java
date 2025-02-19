package factory.loan;

public class Client {
    public static void main(String[] args) {
        Loan homeLoan = LoanFactory.getLoan("home");
        homeLoan.getLoanDetails();

        Loan personalLoan = LoanFactory.getLoan("personal");
        personalLoan.getLoanDetails();

        Loan businessLoan = LoanFactory.getLoan("business");
        businessLoan.getLoanDetails();
    }
}
