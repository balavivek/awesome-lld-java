### Introduction to Generics in Java

Generics in Java allow you to create classes, interfaces, and methods that operate on types specified by the user. This provides type safety and reduces the need for type casting.

### Real-Time Scenario: Data Repository

Let's consider a real-time scenario where we have a data repository that can store and retrieve different types of data. We'll use generics to create a type-safe repository.

#### DataRepository Class

The `DataRepository` class uses generics to store and retrieve data of any type.

[DataRepository.java](../../java/src/awesome/lld/fundamentals/generics/datarepository/DataRepository.java)



#### User Class

The `User` class represents a user entity.

[User.java](../../java/src/awesome/lld/fundamentals/generics/datarepository/User.java)

#### Product Class

The `Product` class represents a product entity.

[Product.java](../../java/src/awesome/lld/fundamentals/generics/datarepository/Product.java)

#### GenericsApp Class

The `GenericsApp` class demonstrates the usage of the `DataRepository` with different types.

[GenericsApp.java](../../java/src/awesome/lld/fundamentals/generics/datarepository/GenericsApp.java)

### Explanation

- **Generics:** Allow you to create classes, interfaces, and methods with type parameters.
- **Type Safety:** Ensures that you can only store and retrieve the specified type of data, reducing runtime errors.
- **Reusability:** The same `DataRepository` class can be used for different types of data.

By using generics, you can create flexible and type-safe code that can handle various data types efficiently.

### Key Concepts

**Bounded Generics**: You can restrict the types used with generics using bounds. For example, `T extends Number` ensures that only subclasses of `Number` can be passed as the type parameter.

```java
public class StatisticsCalculator<T extends Number> {
    public double calculateAverage(List<T> numbers) {
        double sum = 0;
        for (T num : numbers) {
            sum += num.doubleValue();
        }
        return sum / numbers.size();
    }
}
```

**Wildcards (?)**: You can use wildcard characters (`?`) to represent unknown types. For example, `List<?>` can hold any type of object.

```java
public void printList(List<?> list) {
    for (Object obj : list) {
        System.out.println(obj);
    }
}
```
By using generics, you can build flexible, reusable, and scalable systems, a common requirement in modern enterprise-level applications, microservices architecture, and APIs in areas like e-commerce, banking, and big data analytics.