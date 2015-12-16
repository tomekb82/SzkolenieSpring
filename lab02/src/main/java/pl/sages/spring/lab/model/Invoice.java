package pl.sages.spring.lab.model;

import java.util.Date;
import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

/**
 * Created by Administrator on 2015-12-15.
 */
@Entity
public class Invoice extends BaseEntity{

    @ManyToOne(cascade = CascadeType.ALL)
    private Contact seller;

    @ManyToOne(cascade = CascadeType.ALL)
    private Contact buyer;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "invoice" , orphanRemoval = true, cascade = CascadeType.ALL)
    private Set<InvoiceItem> items = new LinkedHashSet<>();

    @Column(name="PAYMENT_TYPE")
    @Enumerated(EnumType.STRING)
    private PaymentType paymentType;

    @Column(name="PAYMENT_DATE")
    @Temporal(TemporalType.DATE)
    private Date paymentDate = new Date();

    public Contact getSeller() {
        return seller;
    }

    public void setSeller(Contact seller) {
        this.seller = seller;
    }

    public Contact getBuyer() {
        return buyer;
    }

    public void setBuyer(Contact buyer) {
        this.buyer = buyer;
    }

    public Set<InvoiceItem> getItems() {
        return items;
    }

    public void setItems(Set<InvoiceItem> items) {
        this.items = items;
    }

    public PaymentType getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(PaymentType paymentType) {
        this.paymentType = paymentType;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }

    public Invoice addItem(InvoiceItem item) {

        item.setInvoice(this);
        items.add(item);

        return this;

    }

    @Override
    public String toString() {
        return "Invoice{" +
                "seller=" + seller +
                ", buyer=" + buyer +
                ", items=" + items +
                ", paymentType=" + paymentType +
                ", paymentDate=" + paymentDate +
                '}';
    }
}
