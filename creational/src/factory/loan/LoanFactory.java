package factory.factory;

import factory.loan.Loan;

public class LoanFactory {

    public static Loan getLoan(String loanType) {

        if (loanType == null) {
            return null;
        }
        switch (loanType.toLowerCase()) {
            case "home":
                return new HomeLoan();
            case "personal":
                return new PersonalLoan();
            case "business":
                return new BusinessLoan();
            default:
                throw new IllegalArgumentException("❌ Unknown loan type: " + loanType);
        }
    }
}
