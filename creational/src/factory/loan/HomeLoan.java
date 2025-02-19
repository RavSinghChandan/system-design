package factory.loan;

public class HomeLoan implements Loan {

    @Override
    public void getLoanDetails() {
        System.out.println("HomeLoan details");
    }
}
