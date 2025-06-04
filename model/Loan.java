package model;

import java.time.LocalDate;
/**Loan class represents a loan taken by a member.
 * It stores the member ID, loan amount, interest rate, and the date the loan was issued. */
public class Loan {
    private String memberId;         // Member who took the loan
    private double principalAmount;  // Original loan amount (principal)
    private double interestRate;     // Monthly interest rate (e.g., 1%)
    private LocalDate loanDate;      // Date when the loan was issued

    // Optional: You can use this to track repayment status if needed
    private boolean isFullyRepaid;

    // --- Constructor ---
    public Loan(String memberId, double principalAmount, double interestRate, LocalDate loanDate) {
        this.memberId = memberId;
        this.principalAmount = principalAmount;
        this.interestRate = interestRate;
        this.loanDate = loanDate;
        this.isFullyRepaid = false; // by default, loan is unpaid when created
    }

    // --- Getters ---
    public String getMemberId() {
        return memberId;
    }

    public double getPrincipalAmount() {
        return principalAmount;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public LocalDate getLoanDate() {
        return loanDate;
    }

    public boolean isFullyRepaid() {
        return isFullyRepaid;
    }

    // --- Setters / Updates ---
    public void setFullyRepaid(boolean fullyRepaid) {
        this.isFullyRepaid = fullyRepaid;
    }

    // --- Business Logic ---

    /**
     * Calculates simple interest till date using the formula:
     * Interest = Principal × Rate × Months
     */
    public double calculateInterest(LocalDate today) {
        int monthsBetween = loanDate.until(today).getMonths() + (loanDate.until(today).getYears() * 12);
        return (principalAmount * interestRate * monthsBetween) / 100;
    }

    /**
     * Calculates total repayment amount = principal + interest till date
     */
    public double getTotalAmountToRepay(LocalDate today) {
        return principalAmount + calculateInterest(today);
    }

    @Override
    public String toString() {
        return "Loan{" +
                "memberId='" + memberId + '\'' +
                ", principalAmount=" + principalAmount +
                ", interestRate=" + interestRate +
                ", loanDate=" + loanDate +
                ", isFullyRepaid=" + isFullyRepaid +
                '}';
    }
}

