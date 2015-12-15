/**
 * Copyright 2015-12-15 the original author or authors.
 */
package pl.sages.spring.lab.dao;

import pl.sages.spring.lab.model.Category;

/**
 * @author Adrian Lapierre {@literal <adrian@soft-project.pl>}
 */
public interface CategoryDAO {

    Category load(long id);

    void save(Category category);
}
