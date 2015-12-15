/**
 * Copyright 2015-12-15 the original author or authors.
 */
package pl.sages.spring.lab.dao;

import org.springframework.stereotype.Repository;

import pl.sages.spring.lab.model.Category;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * @author Adrian Lapierre {@literal <adrian@soft-project.pl>}
 */
@Repository
public class CategoryDAOEmImpl implements CategoryDAO {

    @PersistenceContext
    private EntityManager em;

    @Override
    public Category load(long id) {
        return em.find(Category.class, id);
    }

    @Override
    public void save(Category category) {

        if(category.getId() == 0) {
            em.persist(category);
        } else {
            em.merge(category);
        }

    }

}
