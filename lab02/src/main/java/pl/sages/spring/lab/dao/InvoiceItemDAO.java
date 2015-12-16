package pl.sages.spring.lab.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.sages.spring.lab.model.InvoiceItem;

import java.util.List;

/**
 * Created by Administrator on 2015-12-16.
 */
public interface InvoiceItemDAO extends JpaRepository<InvoiceItem, Long> {

    public List<InvoiceItem> findByNameLikeIgnoreCase(String name);
}
