package pl.sages.spring.lab.model;

import javax.persistence.*;

/**
 * Created by Administrator on 2015-12-15.
 */
@Entity
public class Client extends Person {

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "contact_id")

    private Contact contact;

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    @Override
    public String toString() {
        return "Client{" +
                "contact=" + contact +
                '}';
    }
}
