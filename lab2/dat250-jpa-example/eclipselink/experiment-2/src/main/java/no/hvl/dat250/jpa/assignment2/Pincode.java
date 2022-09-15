package no.hvl.dat250.jpa.assignment2;

import javax.persistence.*;

@Entity
public class Pincode {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String pincode;
    private Integer count;

    public Long getId() {
        return id;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public String getPincode() {
        // TODO: implement method!
        return pincode;
    }

    public Integer getCount() {
        // TODO: implement method!
        return count;
    }
}
