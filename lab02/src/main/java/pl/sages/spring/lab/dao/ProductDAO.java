package pl.sages.spring.lab.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.sages.spring.lab.model.Manufacturer;
import pl.sages.spring.lab.model.Product;

import java.util.List;

public interface ProductDAO extends JpaRepository<Product, Long> {
    List<Product> findByNameLikeIgnoreCase(String name);
    List<Product> findByManufacturer(Manufacturer manufacturer);

    List<Product> findByManufacturerNameLikeIgnoreCase(String name);
}
