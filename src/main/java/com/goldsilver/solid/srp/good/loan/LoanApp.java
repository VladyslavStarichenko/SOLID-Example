package com.goldsilver.solid.srp.good.loan;

public class LoanApp {
    public static void main(String[] args) {
        LoanService loanService = new LoanService();
        CarLoan carLoan = new CarLoan();
        HomeLoan homeLoan = new HomeLoan();
        PersonalLoan personalLoan = new PersonalLoan();
        loanService.getLoanInterestInfo(carLoan);
        loanService.getLoanInterestInfo(homeLoan);
        loanService.getLoanInterestInfo(personalLoan);
    }
}
