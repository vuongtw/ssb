# Problems

- [ ] `test` env is using H2 but it still requires postgresql connection to be defined in `application-test.properties`. Do we have to have a `build.gradle` file for each env?
- [ ] Try to find a way to mock data returned when testing controller actions.
- [ ] Introduce service layer to replace injecting repositories directly to controllers.
- [ ] Why is the following necessary?

```java
  // .../models/product.java
  public Product() {
  }

  public Product(String name, BigInteger price) {
    this.name = name;
    this.price = price;
  }
```