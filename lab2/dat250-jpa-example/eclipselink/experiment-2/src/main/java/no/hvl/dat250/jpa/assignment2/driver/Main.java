package no.hvl.dat250.jpa.assignment2.driver;

import no.hvl.dat250.jpa.assignment2.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static final String PERSISTENCE_UNIT_NAME = "experiment2";

    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        EntityManager em = factory.createEntityManager();

        // TODO: Persist object world corresponding to the domain model of experiment 2.
        em.getTransaction().begin();

        Person person = new Person();
        Address address = new Address();
        Bank bank = new Bank();
        CreditCard cc1 = new CreditCard();
        CreditCard cc2 = new CreditCard();
        Pincode pin = new Pincode();

        HashSet<CreditCard> cards = new HashSet<>();
        HashSet<Person> personsOnAddress = new HashSet<>();
        HashSet<Address> addresses = new HashSet<>();

        person.setName("Max Mustermann");

        pin.setCount(1);
        pin.setPincode("123");

        cc1.setNumber(12345);
        cc2.setNumber(123);
        cc1.setLimit(10000);
        cc2.setLimit(2000);
        cc1.setBalance(-5000);
        cc2.setBalance(1);

        cards.add(cc1);
        cards.add(cc2);

        address.setStreet("Inndalsveien");
        address.setNumber(28);
        personsOnAddress.add(person);
        address.setOwners(personsOnAddress);

        addresses.add(address);

        bank.setName("Pengebank");
        bank.setCards(cards);

        person.setAddresses(addresses);
        person.setCreditCards(cards);

        em.persist(person);
        em.persist(bank);
        em.persist(cc1);
        em.persist(cc2);
        em.persist(pin);
        em.persist(address);

        em.getTransaction().commit();
        em.close();
    }
}
