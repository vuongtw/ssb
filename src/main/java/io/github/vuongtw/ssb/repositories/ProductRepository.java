package io.github.vuongtw.ssb.repositories;

import org.springframework.data.repository.Repository;
import io.github.vuongtw.ssb.models.Product;

import java.util.List;
import java.util.Optional;

public interface ProductRepository extends Repository<Product, Integer> {
  Optional<Product> findById(Integer id);

  long count();

  Product save(Product product);

  List<Product> findAll();
}
