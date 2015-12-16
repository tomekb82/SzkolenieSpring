package pl.sages.spring.lab;

import org.hibernate.annotations.Formula;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import pl.sages.spring.lab.dao.ProductPriceDAO;
import pl.sages.spring.lab.model.Category;
import pl.sages.spring.lab.model.Product;
import pl.sages.spring.lab.model.ProductPrice;

import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2015-12-16.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "/context.xml")
@TransactionConfiguration(defaultRollback = false)
public class ProductPriceTest {

    @Autowired
    ProductPriceDAO productPriceDAO;

    @Test
    public void testFindByIdAndDate() {


        ProductPrice res = productPriceDAO.findByProductIdAndDateFrom(1L, new Date());

        System.out.println(res);

    }

}
