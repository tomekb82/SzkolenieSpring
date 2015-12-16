package pl.com.sages.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

/**
 * Created by Administrator on 2015-12-15.
 */
@Entity
public class VatCategory extends BaseEntity {

    private String category;
    private int rate;
    @Temporal(TemporalType.DATE)
    @NotNull
    private Date dateFrom;
    @Temporal(TemporalType.DATE)
    private Date dateTo;

    public Integer getRate() {
        return rate;
    }

    public void setRate(Integer rate) {
        this.rate = rate;
    }

    public Date getDateFrom() {
        return dateFrom;
    }

    public void setDateFrom(Date dateFrom) {
        this.dateFrom = dateFrom;
    }

    public Date getDateTo() {
        return dateTo;
    }

    public void setDateTo(Date dateTo) {
        this.dateTo = dateTo;
    }
}
