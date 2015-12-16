package pl.sages.spring.lab.model;

import javax.persistence.*;

/**
 * Created by Administrator on 2015-12-15.
 */
@Entity
@DiscriminatorValue("demand")
public class DemandOrder extends Order{

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "supplier_id")
    private Supplier supplier;

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    @Override
    public String toString() {
        return "DemandOrder{" +
                "supplier=" + supplier +
                '}';
    }
}
