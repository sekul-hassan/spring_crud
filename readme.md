# Spring Framework Employee Management System (CRUD)

This is a basic **Employee Management System** built with **Spring Framework (non-Boot)**, **JDBC**, and **MySQL**. It demonstrates fundamental CRUD (Create, Read, Update, Delete) operations using **annotation-based configuration**.

---

## 📌 Features

- Create new employees
- Retrieve all employees or a specific one by ID
- Update existing employee details
- Delete employees
- Configured using Java annotations (no XML)

---

## 🧰 Technologies Used

- Java 8+
- Spring Framework (Core, Context, JDBC)
- MySQL Database
- Maven (for dependency management)
- JDBC Template (Spring abstraction)

---

## 📁 Project Structure

```
src/
├── config/
│   └── AppConfig.java          # Spring configuration and beans
├── dao/
│   ├── EmployeeDAO.java        # DAO interface
│   └── EmployeeDAOImpl.java    # DAO implementation
├── models/
│   └── Employee.java           # POJO class
└── Main.java                   # Application entry point
```

---

## ⚙️ MySQL Table Structure

Run this SQL before starting:

```sql
CREATE DATABASE spring_crud_db;

USE spring_crud_db;

CREATE TABLE employee (
  id INT PRIMARY KEY AUTO_INCREMENT,
  name VARCHAR(100),
  email VARCHAR(100),
  department VARCHAR(100)
);
```

---

## 🚀 How to Run

### 1. Clone the Repository
```bash
git clone https://github.com/your-username/spring-employee-crud.git
cd spring-employee-crud
```

### 2. Configure `AppConfig.java`

Update your MySQL username & password in the `DataSource` bean:
```java
ds.setUsername("your_username");
ds.setPassword("your_password");
```

### 3. Build and Run

Use your IDE or compile via terminal:
```bash
mvn clean compile exec:java -Dexec.mainClass="org.example.Main"
```

---

## 📝 CRUD Operations

- **Insert**: `dao.save(employee)`
- **Read All**: `dao.findAll()`
- **Read One**: `dao.findById(id)`
- **Update**: `dao.update(employee)`
- **Delete**: `dao.delete(id)`

---

## 📦 Dependencies (in pom.xml)

```xml
<dependencies>
    <dependency>
        <groupId>org.springframework</groupId>
        <artifactId>spring-context</artifactId>
        <version>5.3.36</version>
    </dependency>
    <dependency>
        <groupId>org.springframework</groupId>
        <artifactId>spring-jdbc</artifactId>
        <version>5.3.36</version>
    </dependency>
    <dependency>
        <groupId>mysql</groupId>
        <artifactId>mysql-connector-java</artifactId>
        <version>8.3.0</version>
    </dependency>
</dependencies>
```

---

## 🧑‍💻 Author

**Sekul**  
Spring + MySQL Developer | Job Preparation Project  
🇧🇩 Bangladesh

---

## 📃 License

This project is open-source and free to use for educational and job preparation purposes.