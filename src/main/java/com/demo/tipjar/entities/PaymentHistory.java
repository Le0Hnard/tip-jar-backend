package com.demo.tipjar.entities;

import javax.persistence.*;

@Entity(name = "payment_history")
public class PaymentHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "history_id")
    private Long id;

    @Column(name = "amount", nullable = false)
    private double amount;

    @Column(name = "num_of_people", nullable = false)
    private int numOfPeople;

    @Column(name = "tip_percentage", nullable = false)
    private double tipPercentage;

    @Column(name = "total_tip", nullable = false)
    private double totalTip;

    @Column(name = "tip_per_person", nullable = false)
    private double tipPerPerson;

    public PaymentHistory(double amount, int numOfPeople, double tipPercentage, double totalTip, double tipPerPerson) {
        this.amount = amount;
        this.numOfPeople = numOfPeople;
        this.tipPercentage = tipPercentage;
        this.totalTip = totalTip;
        this.tipPerPerson = tipPerPerson;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getNumOfPeople() {
        return numOfPeople;
    }

    public void setNumOfPeople(int numOfPeople) {
        this.numOfPeople = numOfPeople;
    }

    public double getTipPercentage() {
        return tipPercentage;
    }

    public void setTipPercentage(double tipPercentage) {
        this.tipPercentage = tipPercentage;
    }

    public double getTotalTip() {
        return totalTip;
    }

    public void setTotalTip(double totalTip) {
        this.totalTip = totalTip;
    }

    public double getTipPerPerson() {
        return tipPerPerson;
    }

    public void setTipPerPerson(double tipPerPerson) {
        this.tipPerPerson = tipPerPerson;
    }

}
