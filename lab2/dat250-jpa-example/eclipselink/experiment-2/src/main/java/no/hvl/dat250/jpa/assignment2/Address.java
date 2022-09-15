package no.hvl.dat250.jpa.assignment2;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String street;
    private Integer number;
    @ManyToMany
    Collection<Person> owners;

    public void setStreet(String street) {
        this.street = street;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public void setOwners(Collection<Person> owners) {
        this.owners = owners;
    }

    public String getStreet() {
        // TODO: implement method!
        return street;
    }

    public Integer getNumber() {
        // TODO: implement method!
        return number;
    }

    public Collection<Person> getOwners() {
        // TODO: implement method!
        return owners;
    }
}
