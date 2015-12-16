/**
 * Copyright 2015-12-15 the original author or authors.
 */
package pl.com.sages.model;

import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author Adrian Lapierre {@literal <adrian@soft-project.pl>}
 */
@MappedSuperclass
public class BaseEntity  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected long id;

    @Temporal(TemporalType.TIMESTAMP)
    protected Date created;

    @Temporal(TemporalType.TIMESTAMP)
    protected Date lastModify;

    public long getId() {
        return id;
    }

    @PrePersist
    private void createdDateInitialization() {
        if(created == null) {
            created = new Date();
        }
        else {
            lastModify = new Date();
        }
    }



}
