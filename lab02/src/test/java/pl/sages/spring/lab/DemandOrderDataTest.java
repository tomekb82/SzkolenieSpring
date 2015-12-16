package pl.sages.spring.lab;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;
import pl.sages.spring.lab.dao.DemandOrderDAO;
import pl.sages.spring.lab.dao.SupplierDAO;
import pl.sages.spring.lab.model.DemandOrder;
import pl.sages.spring.lab.model.Supplier;

import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2015-12-16.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "/context.xml")
@TransactionConfiguration(defaultRollback = false)
public class DemandOrderDataTest {

    @Autowired
    private DemandOrderDAO demandOrderDao;

    @Autowired
    private SupplierDAO supplierDAO;

    @Test
    @Transactional
    public void test() {

        Supplier s = new Supplier();

        s.setName("Głowny dostawca");

        supplierDAO.save(s);

        DemandOrder d = new DemandOrder();

        d.setOrderDate(new Date());
        d.setSupplier(s);

        demandOrderDao.save(d);

        List<DemandOrder> res = demandOrderDao.findBySupplierNameLikeIgnoreCase("Głowny%");

        System.out.println(res);

        res = demandOrderDao.findByOrderDateBefore(new Date());

        System.out.println(res);

        res = demandOrderDao.findByOrderDateAfter(new Date());

        System.out.println(res);
    }
}
