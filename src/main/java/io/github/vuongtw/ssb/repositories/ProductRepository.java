package io.github.vuongtw.ssb.repositories;

import org.springframework.data.repository.CrudRepository;
import io.github.vuongtw.ssb.models.Product;
import java.util.Optional;

public interface ProductRepository extends CrudRepository<Product, Integer> {
  Optional<Product> findById(Integer id);
}
