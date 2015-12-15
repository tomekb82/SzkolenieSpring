package pl.sages.spring.lab.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Created by Administrator on 2015-12-15.
 */

@Entity
public class OrderItem extends BaseEntity{

    @OneToOne
    @JoinColumn(name="PRODUCT_ID")
    private Product product;

    @Column(name = "ORDERED_QUANTITY")
    @NotNull
    private Long orderedQuantity;

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }




    public void setId(Long id) {
        this.id = id;
    }

    public Long getOrderedQuantity() {
        return orderedQuantity;
    }

    public void setOrderedQuantity(Long orderedQuantity) {
        this.orderedQuantity = orderedQuantity;
    }
}
