package no.hvl.dat250.jpa.assignment2;

import javax.persistence.*;

@Entity
public class CreditCard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne
    private Pincode pincode;
    private Integer number;
    @ManyToOne
    private Bank bank;
    private Integer balance;
    private Integer limit;

    public void setNumber(Integer number){
        this.number = number;
    }

    public void setPincode(Pincode pincode) {
        this.pincode = pincode;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getNumber() {
        // TODO: implement method!
        return number;
    }

    public Integer getBalance() {
        // TODO: implement method!
        return balance;
    }

    public Integer getLimit() {
        // TODO: implement method!
        return limit;
    }

    public Pincode getPincode() {
        // TODO: implement method!
        return pincode;
    }

    public Bank getOwningBank() {
        // TODO: implement method!
        return bank;
    }
}
