package pl.sages.spring.lab.model;

import javax.persistence.*;

/**
 * Created by Administrator on 2015-12-15.
 */
@Entity
@DiscriminatorValue("client")
public class ClientOrder extends Order {

    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CLIENT_ID")
    private Client client;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

}
