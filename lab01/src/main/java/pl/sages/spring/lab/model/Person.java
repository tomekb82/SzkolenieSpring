/**
 * Copyright 2015-12-14 the original author or authors.
 */
package pl.sages.spring.lab.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @author Adrian Lapierre {@literal <adrian@soft-project.pl>}
 */
@Component
@Scope("singleton")
public class Person {

    @Value("${name}")
    private String name;
    private String lastName;

    @Autowired
    //@ExtendedAddress
    @Qualifier("advancedAddress2")
    private IAddress address;

    @Value("rtrtrtrtr:wewewewew:23232")
    private BasicAddress basicAddress;

    @PostConstruct
    public void init(){
        System.out.println("PostConstrut = initialization...");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public IAddress getAddress() {
        return address;
    }

    public BasicAddress getBasicAddress() {
        return basicAddress;
    }

    public void setBasicAddress(BasicAddress basicAddress) {
        this.basicAddress = basicAddress;
    }

    public void setAddress(IAddress address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address=" + basicAddress +
                '}';
    }
}
