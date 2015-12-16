package pl.sages.spring.lab.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.sages.spring.lab.model.Supplier;

import java.util.List;

/**
 * Created by Administrator on 2015-12-16.
 */
public interface SupplierDAO extends JpaRepository<Supplier, Long> {
    public List<Supplier> findByNameLike(String name);

}
