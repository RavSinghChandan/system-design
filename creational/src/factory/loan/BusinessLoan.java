package factory.factory;

import factory.loan.Loan;

public class BusinessLoan implements Loan {

    @Override
    public void getLoanDetails() {
        System.out.println("Business Loan Details");
    }
}
