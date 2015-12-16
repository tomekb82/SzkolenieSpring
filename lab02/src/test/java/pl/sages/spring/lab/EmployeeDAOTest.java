package pl.sages.spring.lab;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;
import pl.sages.spring.lab.dao.EmployeeDAO;
import pl.sages.spring.lab.model.Employee;

import java.util.List;

/**
 * Created by Administrator on 2015-12-16.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "/context.xml")
@TransactionConfiguration(defaultRollback = false)
public class EmployeeDAOTest {
    @Autowired
    private EmployeeDAO employeeDAO;

    @Test
    @Transactional
    public void test(){
        Employee employee = new Employee();
        employee.setSalary(5486);
        employeeDAO.save(employee);
        Employee employee1 = new Employee();
        employee1.setSalary(1244);
        employeeDAO.save(employee1);
        List<Employee> employeeList = employeeDAO.findBySalaryGreaterThan(2000);
        System.out.println(employeeList);
        assert employeeList.contains(employee);
    }
}
