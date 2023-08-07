package com.goldsilver.solid.srp.good.loan;

public class LoanService {

    public void getLoanInterestInfo(LoanStrategy loanStrategy) {
        loanStrategy.countLoans();
    }
}
