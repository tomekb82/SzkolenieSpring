package pl.sages.spring.lab.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.sages.spring.lab.model.Employee;

import java.util.List;

/**
 * Created by Administrator on 2015-12-16.
 */
public interface EmployeeDAO extends JpaRepository<Employee, Long> {
    public List<Employee> findBySalaryGreaterThan(double salary);
}
