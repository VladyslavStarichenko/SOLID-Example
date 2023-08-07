package com.goldsilver.solid.srp.good.loan;

public class PersonalLoan implements LoanStrategy{
    public void countLoans() {
        System.out.println("It's a loan for personal purposes");
    }
}
