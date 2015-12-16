package pl.sages.spring.lab.model;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2015-12-14.
 */
@Component
@Qualifier("basicAddress")
public class BasicAddress implements IAddress {

    @Value("#{'${cityBasicAddress}'.toUpperCase()}")
    String city;
    String street;
    Integer number;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", number=" + number +
                '}';
    }
}
