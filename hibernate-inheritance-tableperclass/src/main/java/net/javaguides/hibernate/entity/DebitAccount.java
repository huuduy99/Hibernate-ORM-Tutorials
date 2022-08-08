package net.javaguides.hibernate.entity;


import jakarta.persistence.Entity;

@Entity(name = "DebitAccount")
public class DebitAccount extends Account {

    private double overdraftFee;

    public double getOverdraftFee() {
        return overdraftFee;
    }

    public void setOverdraftFee(double overdraftFee) {
        this.overdraftFee = overdraftFee;
    }
}