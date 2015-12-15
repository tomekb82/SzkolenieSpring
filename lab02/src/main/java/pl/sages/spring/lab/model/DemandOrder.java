package pl.sages.spring.lab.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;

/**
 * Created by Administrator on 2015-12-15.
 */
@Entity
@DiscriminatorValue("demand")
public class DemandOrder extends Order{

    @ManyToOne(fetch = FetchType.LAZY)
    private Supplier supplier;

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }


}
