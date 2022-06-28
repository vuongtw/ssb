package io.github.vuongtw.ssb.models;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GenerationType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigInteger;

@Table(name = "products")
@Entity
public class Product {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
  private String name;
  private BigInteger price;

  public Product(String name, BigInteger price) {
    this.name = name;
    this.price = price;
  }

  public Integer getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public BigInteger getPrice() {
    return price;
  }

  public String toString() {
    return String.format("Product[id=%d, name='%s', price=%d cents]", id, name, price);
  }
}
