# TestReportLogger

TestReportLogger is a **Spring Boot** application designed to **generate and log test reports** into a database. The reports are later presented on a **UI generator**, making it easy to visualize test execution results.

## Features
- Generates structured test reports
- Logs reports into MySQL database
- Provides a UI for viewing test results
- Built with **Spring Boot** for backend processing
- Supports database storage for persistent logging

## Technologies Used
- **Java (Spring Boot)** – Backend processing
- **Spring Data JPA** – Database interaction
- **MySQL** – Database support
- **Lombok** – Reducing boilerplate code
- **Maven** – Dependency management

## Installation
### Prerequisites
Ensure you have the following installed:
- **Java 17+**
- **Maven**
- **MySQL**

### Clone the Repository
```sh
git clone https://github.com/ken4ward/TestReportLogger.git
cd TestReportLogger
```

### Configure Database
Modify the `application.properties` or `application.yml` file to set up MySQL.

Example (MySQL configuration):
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/testreportdb
spring.datasource.driverClassName=com.mysql.cj.jdbc.Driver
spring.datasource.username=root
spring.datasource.password=yourpassword
spring.jpa.database-platform=org.hibernate.dialect.MySQL8Dialect
spring.jpa.hibernate.ddl-auto=update
```

### Build and Run the Application
```sh
mvn clean install
mvn spring-boot:run
```

## API Endpoints
| Method | Endpoint           | Description              |
|--------|--------------------|--------------------------|
| GET    | `/reports`         | Fetch all reports       |
| POST   | `/reports`         | Add a new test report   |
| GET    | `/reports/{id}`    | Fetch a report by ID    |
| DELETE | `/reports/{id}`    | Delete a test report    |

## UI Access
Once the backend is running, access the UI via:
```
http://localhost:8080
```

## Contribution
Feel free to fork the repository and submit pull requests.

### Steps to Contribute:
1. Fork the repository
2. Create a new branch (`feature-xyz`)
3. Commit your changes
4. Push to your fork
5. Submit a pull request

## License
This project is licensed under the **MIT License**.

---

