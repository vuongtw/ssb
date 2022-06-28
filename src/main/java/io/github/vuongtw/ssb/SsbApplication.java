package io.github.vuongtw.ssb;

import io.github.vuongtw.ssb.repositories.ProductRepository;
import io.github.vuongtw.ssb.models.Product;

import java.math.BigInteger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SsbApplication {

  private static final Logger log = LoggerFactory.getLogger(SsbApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SsbApplication.class, args);
	}

  @Bean
  CommandLineRunner seed(ProductRepository products) {
    return (args) -> {
      if (products.count() > 0) {
         log.info("Skip seeding! Database 'products' table is not empty.");
         return;
      }

      int i;
      for(i = 1; i < 5; i++) {
        Product newProduct = products.save(new Product("Product " + i, BigInteger.valueOf(i * 1000)));
        log.info("Seeded " + newProduct + "!");
      }
    };
  }
}
