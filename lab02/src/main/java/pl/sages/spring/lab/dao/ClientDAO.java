package pl.sages.spring.lab.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.sages.spring.lab.model.Client;

/**
 * Created by Administrator on 2015-12-16.
 */
public interface ClientDAO extends JpaRepository<Client, Long>{
}
