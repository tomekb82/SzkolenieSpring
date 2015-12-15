package pl.sages.spring.lab.model;

import java.util.Date;

import javax.persistence.*;

/**
 * Created by Administrator on 2015-12-15.
 */
@Entity
public class Employee extends Person{
    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;
    private double salary;
    private Date employmentStart;
    private Date employmentEnd;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Date getEmploymentStart() {
        return employmentStart;
    }

    public void setEmploymentStart(Date employmentStart) {
        this.employmentStart = employmentStart;
    }

    public Date getEmploymentEnd() {
        return employmentEnd;
    }

    public void setEmploymentEnd(Date employmentEnd) {
        this.employmentEnd = employmentEnd;
    }
}
