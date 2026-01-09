# First REST API Spring

A RESTful API for product management built with Spring Boot, Spring Data JPA, and H2 in-memory database.

## Project Overview

This is a simple CRUD (Create, Read, Update, Delete) application that demonstrates the implementation of a REST API using Spring Boot framework. The application manages products with basic operations exposed through RESTful endpoints.

## Tech Stack

- **Java 25**
- **Spring Boot 4.0.1**
- **Spring Data JPA** - for data persistence
- **H2 Database** - in-memory database for development
- **SpringDoc OpenAPI** - for API documentation (Swagger UI)
- **Maven** - build and dependency management

## Project Structure

```
src/main/java/pl/edu/vistula/firstrestapispring/
├── FirstRestApiSpringApplication.java      # Main application entry point
├── product/
│   ├── api/
│   │   ├── ProductController.java          # REST controller
│   │   ├── request/
│   │   │   ├── ProductRequest.java         # DTO for creating products
│   │   │   └── UpdateProductRequest.java   # DTO for updating products
│   │   └── response/
│   │       └── ProductResponse.java        # DTO for API responses
│   ├── domain/
│   │   └── Product.java                    # JPA Entity
│   ├── repository/
│   │   └── ProductRepository.java          # Data access layer
│   ├── service/
│   │   └── ProductService.java             # Business logic layer
│   └── support/
│       ├── ProductMapper.java              # Entity-DTO mapper
│       ├── ProductExceptionAdvisor.java    # Global exception handler
│       ├── ProductExceptionSupplier.java   # Exception supplier utility
│       └── exception/
│           └── ProductNotFoundException.java
└── shared/
    └── api/response/
        └── ErrorMessageResponse.java       # Error response DTO
```

## API Endpoints

| Method | Endpoint | Description |
|--------|----------|-------------|
| POST | `/api/v1/products` | Create a new product |
| GET | `/api/v1/products` | Get all products |
| GET | `/api/v1/products/{id}` | Get product by ID |
| PUT | `/api/v1/products/{id}` | Update product by ID |
| DELETE | `/api/v1/products/{id}` | Delete product by ID |

## Getting Started

### Prerequisites

- Java 25 or higher
- Maven 3.x

### Running the Application

1. Clone the repository:
```bash
git clone https://github.com/SaintSlavone/java_viacheslav_71918.git
cd java_viacheslav_71918
git switch project2
```

2. Build and run the application:
```bash
./mvnw spring-boot:run
```

3. The application will start on `http://localhost:8080`

### Accessing the Application

- **Swagger UI**: `http://localhost:8080/swagger-ui.html`
- **H2 Console**: `http://localhost:8080/console/`
  - JDBC URL: `jdbc:h2:mem:testdb`
  - Username: `sa`
  - Password: (empty)

## How it works?

1. First start the project and navigate to "http://localhost:8080/console", you will see login form.
Check screenshot "/screenshots/starting_project.png", 1) enter the same url "jdbc:h2:mem:testdb" and 2) press connect;
2. Select table like on screenshot "/screenshots/selecting_table.png", 1) left click on table, 2) press run;
3. In next part lets post some data. Open postman or swagger in browser. 1) type url where we posting data, 2) type some data in JSON format, 3) press send button, 4) if you see status 200 you are good;
"/screenshots/post_request.png". Post data like this a couple of times and then check database liek on screenshot "/screenshots/check_db.png" (press run another time).
4. To get data in postman use GET request "/screenshots/get_all.png". If you sending GET request only to /products you will get all products, if you specify id (for example /products/2) you will get specifyed item (if it exist).
5. Lets update data by using PUT request "/screenshots/put_request.png", and then check the db "/screenshots/check_db2.png".
6. To delete data just use DELETE request "/screenshots/delete_request.png" (simple).

## Architecture

The application follows a layered architecture pattern:

1. **Controller Layer** (`ProductController`) - handles HTTP requests and responses
2. **Service Layer** (`ProductService`) - contains business logic
3. **Repository Layer** (`ProductRepository`) - handles data persistence
4. **Domain Layer** (`Product`) - JPA entity representing the data model

---

## Question: How Does ProductRepository Work Without Any Implemented Methods?

### The Question

> As you have probably noticed, our ProductRepository interface is empty (there is no code in it), and yet our ProductService uses the ProductRepository methods: `save`, `findById`, `findAll`, `deleteById`. How is it possible that our ProductService class does not throw errors if it uses methods not implemented in the ProductRepository class?

### The Answer

This "magic" is made possible by **Spring Data JPA**, which is one of the most powerful features of the Spring ecosystem.

#### 1. Interface Inheritance

Looking at the `ProductRepository` interface:

```java
@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
```

Even though this interface appears empty, it actually **inherits** all methods from `JpaRepository<Product, Long>`. The `JpaRepository` interface extends `ListCrudRepository`, `ListPagingAndSortingRepository`, and `QueryByExampleExecutor`, which provide a rich set of methods including:

- `save(S entity)` - saves an entity
- `findById(ID id)` - retrieves an entity by its ID
- `findAll()` - retrieves all entities
- `deleteById(ID id)` - deletes an entity by its ID
- `count()`, `existsById()`, and many more...

#### 2. Runtime Proxy Generation

When the Spring application starts, **Spring Data JPA** scans for interfaces that extend `Repository` (or its sub-interfaces like `JpaRepository`). For each such interface, Spring automatically generates a **proxy class** at runtime that provides concrete implementations of all the inherited methods.

This is accomplished through:

- **Java Dynamic Proxies** - Spring creates a proxy object that implements the `ProductRepository` interface
- **`SimpleJpaRepository`** - The actual implementation class that Spring uses behind the scenes to execute JPA operations

#### 3. Dependency Injection

When `ProductService` requests a `ProductRepository` through constructor injection:

```java
public ProductService(ProductRepository productRepository, ProductMapper productMapper) {
    this.productRepository = productRepository;
    this.productMapper = productMapper;
}
```

Spring injects the **proxy instance** that it generated. This proxy delegates method calls to the underlying `SimpleJpaRepository` implementation, which uses `EntityManager` to perform actual database operations.

#### 4. The Complete Flow

```
ProductService.create()
    ↓
productRepository.save(product)
    ↓
Spring Proxy (generated at runtime)
    ↓
SimpleJpaRepository.save()
    ↓
EntityManager.persist() / merge()
    ↓
H2 Database
```

#### Summary

The key points to remember are:

1. **Inheritance** - `ProductRepository` inherits methods from `JpaRepository`
2. **Spring Data JPA Magic** - automatically generates implementation classes at runtime
3. **Proxy Pattern** - Spring creates a proxy that implements the interface
4. **Dependency Injection** - the generated proxy is injected wherever `ProductRepository` is needed

This design pattern allows developers to write minimal boilerplate code while still having full CRUD functionality. You only need to define custom query methods in your repository interface when the standard CRUD operations are not sufficient for your use case.

---

## Author

Viacheslav Kostenko