package pl.sages.spring.lab;

/**
 * Copyright 2015-12-15 the original author or authors.
 */

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;

import pl.sages.spring.lab.config.JavaConfig;
import pl.sages.spring.lab.dao.CategoryDAO;
import pl.sages.spring.lab.model.Category;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Adrian Lapierre {@literal <adrian@soft-fghgfdproject.pl>}
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = JavaConfig.class)//(locations = "/context.xml")
@TransactionConfiguration(defaultRollback = true)
public class TextContext {

    @Autowired
    private CategoryDAO categoryDAO;

    @Test
    @Transactional
    public void saveOne() {

        Category category = new Category();

        category.setName("Kategoria 1");
        category.setDescription("Ala ma kota");

        categoryDAO.save(category);

        Category res = categoryDAO.load(category.getId());

        assert res.getId() == category.getId();

    }

    @Test
    @Transactional
    public void saveTree() {

        Category category = new Category();

        category.setName("Kategoria 2");
        category.setDescription("Ala ma kota 2");

        Category child = new Category();
        child.setName("pod kategoria");
        child.setDescription("dkjdjdjdj");

        category.addChildCategory(child);

        categoryDAO.save(category);

    }

}
