package pl.sages.spring.lab;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;
import pl.sages.spring.lab.dao.ManufacturerDAO;
import pl.sages.spring.lab.dao.ProductDAO;
import pl.sages.spring.lab.model.Manufacturer;
import pl.sages.spring.lab.model.Product;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "/context.xml")
@TransactionConfiguration(defaultRollback = false)
public class SpringDataTestPatryk {

    @Autowired
    private ProductDAO productDAO;

    @Autowired
    private ManufacturerDAO manufacturerDAO;

    @Test
    @Transactional
    public void test(){
        Product p = new Product();
        p.setCatalogNumber("Nr.001");
        p.setName("Płetwy");
        p.setDescription("Opis: ...");


        Manufacturer manufacturer=new Manufacturer();
        manufacturer.setName("Firma ABC");
        manufacturerDAO.save(manufacturer);
        p.setManufacturer(manufacturer);

        productDAO.save(p);



        Product res =  productDAO.findOne(1L);
        System.out.println(res);

        List<Product> res2 = productDAO.findByNameLikeIgnoreCase("%etwy%");
        System.out.println(res2);

        res2 = productDAO.findByManufacturerNameLikeIgnoreCase("%ABC%");
        System.out.println(res2);
    }
}
