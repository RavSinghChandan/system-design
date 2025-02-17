package factory.factory;

import factory.loan.Loan;

public class PersonalLoan implements Loan {

    @Override
    public void getLoanDetails() {
        System.out.println("Personal Loan Details");
    }
}
