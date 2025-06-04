package model;

import java.time.LocalDate;

/**
 * Deposit class represents a monthly deposit transaction by a member.
 * It stores the member's ID, amount deposited, and the date of deposit.
 */
public class Deposit {

    private String memberId;       // Unique ID to identify the member
    private double amount;         // e.g., ₹500
    private LocalDate depositDate; // Date when the deposit was made

    // --- Constructor ---
    public Deposit(String memberId, double amount, LocalDate depositDate) {
        this.memberId = memberId;
        this.amount = amount;
        this.depositDate = depositDate;
    }

    // --- Getters ---
    public String getMemberId() {
        return memberId;
    }

    public double getAmount() {
        return amount;
    }

    public LocalDate getDepositDate() {
        return depositDate;
    }

    // --- Business Logic ---

    /**
     * Checks if the deposit was made on or before the 1st of the month.
     * Returns true if on time, false if late.
     */
    public boolean isOnTime() {
        return depositDate.getDayOfMonth() <= 1;
    }

    @Override
    public String toString() {
        return "Deposit{" +
                "memberId='" + memberId + '\'' +
                ", amount=" + amount +
                ", depositDate=" + depositDate +
                ", onTime=" + isOnTime() +
                '}';
    }
}
