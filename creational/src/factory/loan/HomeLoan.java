package factory.factory;

import factory.loan.Loan;

public class HomeLoan implements Loan {

    @Override
    public void getLoanDetails() {
        System.out.println("HomeLoan details");
    }
}
