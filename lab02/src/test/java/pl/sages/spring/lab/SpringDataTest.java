/**
 * Copyright 2015-12-16 the original author or authors.
 */
package pl.sages.spring.lab;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import pl.sages.spring.lab.dao.CategoryDAO;
import pl.sages.spring.lab.model.Category;

import java.util.List;

/**
 * @author Adrian Lapierre {@literal <adrian@soft-project.pl>}
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "/context.xml")
@TransactionConfiguration(defaultRollback = false)
public class SpringDataTest {

    @Autowired
    private CategoryDAO categoryDAO;

    @Test
    @Transactional
    public void test() {
        System.out.println("!!!!");

        Category category = new Category();

        category.setName("Kategoria 1");
        category.setDescription("Ala ma kota");

        categoryDAO.save(category);

        System.out.println(category.getId());

        Category res = categoryDAO.findOne(category.getId());

        assert res.getId() == category.getId();


    }

    @Test
    public void testPage() {

        PageRequest pr = new PageRequest(0, 10);

        Page<Category> res = categoryDAO.findByNameLike("%", pr);

        res.getContent();

    }



    @Test
    public void testFind() {

        List<Category> res = categoryDAO.findByNameLikeIgnoreCase("ala ma kota%");

        System.out.println(res);

    }

    @Test
    public void testFindByQuery() {

        List<Category> res = categoryDAO.findByQery("ala ma kota%");

        System.out.println(res);

    }

}
