package pl.sages.spring.lab.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.sages.spring.lab.model.ClientOrder;

import java.util.List;

/**
 * Created by Administrator on 2015-12-16.
 */
public interface ClientOrderDAO extends JpaRepository<ClientOrder, Long> {

    public List<ClientOrder> findByNameLike(String name);
    public List<ClientOrder> findByClientNameLike(String clientName);

}
