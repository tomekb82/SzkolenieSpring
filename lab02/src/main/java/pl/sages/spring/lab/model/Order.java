package pl.sages.spring.lab.model;

import java.util.Date;
import java.util.List;

import javax.persistence.*;

/**
 * Created by Administrator on 2015-12-15.
 */
@Entity
@Table(name = "Orders")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "ORDER_TYPE")
public abstract class Order extends BaseEntity {


    @Column(name = "ORDER_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date orderDate;


    @OneToMany(orphanRemoval = true, cascade = CascadeType.ALL)
    @JoinColumn(name = "ORDER_ID")
    private List<OrderItem> items;

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

}
