package no.hvl.dat250.jpa.assignment2;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Bank {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @OneToMany
    private Set<CreditCard> cards;

    public Long getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCards(Set<CreditCard> cards) {
        this.cards = cards;
    }

    public String getName() {
        // TODO: implement method!
        return name;
    }

    public Set<CreditCard> getOwnedCards() {
        // TODO: implement method!
        return cards;
    }
}
