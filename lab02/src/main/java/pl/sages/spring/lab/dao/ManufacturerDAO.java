package pl.sages.spring.lab.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.sages.spring.lab.model.Manufacturer;

public interface ManufacturerDAO extends JpaRepository<Manufacturer, Long> {
}
