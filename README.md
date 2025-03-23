TestReportLogger

TestReportLogger is a Spring Boot application designed to generate and log test reports into a database. The reports are later presented on a UI generator, making it easy to visualize test execution results.

Features

Generates structured test reports

Logs reports into a database

Provides a UI for viewing test results

Built with Spring Boot for backend processing

Supports database storage for persistent logging

Technologies Used

Java (Spring Boot) – Backend processing

Spring Data JPA – Database interaction

H2/PostgreSQL/MySQL – Database support (configurable)

Thymeleaf/React/Angular – UI generation (specify which one is used)

Lombok – Reducing boilerplate code

Maven – Dependency management

Installation

Prerequisites

Ensure you have the following installed:

Java 17+

Maven

Database (H2, PostgreSQL, or MySQL)

Clone the Repository

git clone https://github.com/ken4ward/TestReportLogger.git
cd TestReportLogger

Configure Database

Modify the application.properties or application.yml file to set up your preferred database.

Example (H2 database):

spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect

Build and Run the Application

mvn clean install
mvn spring-boot:run

API Endpoints

Method

Endpoint

Description

GET

/reports

Fetch all reports

POST

/reports

Add a new test report

GET

/reports/{id}

Fetch a report by ID

DELETE

/reports/{id}

Delete a test report

UI Access

Once the backend is running, access the UI via:

http://localhost:8080

Contribution

Feel free to fork the repository and submit pull requests.

Steps to Contribute:

Fork the repository

Create a new branch (feature-xyz)

Commit your changes

Push to your fork

Submit a pull request

License

This project is licensed under the MIT License.
