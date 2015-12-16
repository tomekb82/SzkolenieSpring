package pl.sages.spring.lab;

import org.hibernate.annotations.SourceType;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;
import pl.sages.spring.lab.dao.SupplierDAO;
import pl.sages.spring.lab.model.Supplier;

import java.util.List;

/**
 * Created by Administrator on 2015-12-16.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "/context.xml")
@TransactionConfiguration(defaultRollback = false)
public class SupplierDataTest {

    @Autowired
    private SupplierDAO supplierDao;

    @Test
    @Transactional
    public void test() {

        Supplier s = new Supplier();

        s.setName("Głowny dostawca");

        supplierDao.save(s);

        List<Supplier> res = supplierDao.findByNameLike("Glowny%");

        System.out.println(res);
    }
}
