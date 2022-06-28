package io.github.vuongtw.ssb.repositories;

import java.math.BigInteger;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import org.springframework.boot.jdbc.EmbeddedDatabaseConnection;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import io.github.vuongtw.ssb.models.Product;

@DataJpaTest
@AutoConfigureTestDatabase(connection = EmbeddedDatabaseConnection.H2)
public class ProductRepositoryTests {
	@Autowired
	private TestEntityManager entityManager;

	@Autowired
	private ProductRepository products;

	@Test
	public void testFindById() {
		Product product = new Product("Toothpaste", BigInteger.valueOf(20)); 
		entityManager.persist(product);

		Optional<Product> findById = products.findById(product.getId());

    assertTrue(findById.isPresent());
		assertEquals(findById.get().getName(), product.getName());
    assertEquals(findById.get().getPrice(), product.getPrice());
	}

  @Test
  public void testSaveAndCount() {
    Product product = new Product("Toothpaste", BigInteger.valueOf(20));

    long originalCount = products.count();

    products.save(product);

    long afterSaveCount = products.count();

    assertEquals(afterSaveCount - originalCount, 1);
  }

  @Test
  public void testFindAll() {
	List<Product> allProducts = products.findAll();

	assertEquals(allProducts.size(), products.count());
  }
}
