package pl.sages.spring.lab.model;

import java.util.Date;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Created by Administrator on 2015-12-15.
 */
@Entity
public class ProductPrice extends BaseEntity {

    @NotNull
    @ManyToOne
    @JoinColumn(name = "PRODUCT_ID")
    private Product product;
    private int price;
    @Temporal(TemporalType.DATE)
    @NotNull
    private Date dateFrom;
    @OneToOne
    @JoinColumn(name = "VAT_CATEGORY")
    private VatCategory vatCategory;

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Date getDateFrom() {
        return dateFrom;
    }

    public void setDateFrom(Date dateFrom) {
        this.dateFrom = dateFrom;
    }

    public VatCategory getVatCategory() {
        return vatCategory;
    }

    public void setVatCategory(VatCategory vatCategory) {
        this.vatCategory = vatCategory;
    }
}
