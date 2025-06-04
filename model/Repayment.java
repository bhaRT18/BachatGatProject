package model;

import java.time.LocalDate;

/**
 * Repayment class represents a payment made by a member towards their loan.
 * It includes details like which member made the payment, how much was paid,
 * on what date, and which loan it belongs to (based on memberId and date).
 */
public class Repayment {

    private String memberId;      // Member who repaid
    private double amountPaid;    // Amount repaid
    private LocalDate repaymentDate; // Date on which payment was made

    // --- Constructor ---
    public Repayment(String memberId, double amountPaid, LocalDate repaymentDate) {
        this.memberId = memberId;
        this.amountPaid = amountPaid;
        this.repaymentDate = repaymentDate;
    }

    // --- Getters ---
    public String getMemberId() {
        return memberId;
    }

    public double getAmountPaid() {
        return amountPaid;
    }

    public LocalDate getRepaymentDate() {
        return repaymentDate;
    }

    @Override
    public String toString() {
        return "Repayment{" +
                "memberId='" + memberId + '\'' +
                ", amountPaid=" + amountPaid +
                ", repaymentDate=" + repaymentDate +
                '}';
    }
}