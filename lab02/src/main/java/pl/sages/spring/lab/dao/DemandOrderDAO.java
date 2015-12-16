package pl.sages.spring.lab.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.sages.spring.lab.model.DemandOrder;
import pl.sages.spring.lab.model.Supplier;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2015-12-16.
 */
public interface DemandOrderDAO extends JpaRepository<DemandOrder, Long>{

    public List<DemandOrder> findBySupplierId(Long id);

    public List<DemandOrder> findBySupplierNameLikeIgnoreCase(String name);

    public List<DemandOrder> findByOrderDateBefore(Date date);
    public List<DemandOrder> findByOrderDateAfter(Date date);
}
