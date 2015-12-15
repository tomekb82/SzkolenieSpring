package pl.sages.spring.lab.model;

import javax.persistence.Entity;

@Entity
public class Manufacturer extends BaseEntity{
    private String companyName;
    private String location;

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
