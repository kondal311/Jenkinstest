# Jenkinstest - Spring Boot Hello World REST API

This is a Spring Boot application that provides a simple "Hello World" REST API.

## Features

- Spring Boot 3.2.0 with Java 17
- REST API endpoints:
  - `GET /` - Welcome message
  - `GET /hello` - Hello World greeting
- Maven build system
- JUnit 5 tests included

## How to Run

### Prerequisites
- Java 17 or higher
- Maven 3.6+

### Build and Run
```bash
# Build the application
mvn clean package

# Run the application
java -jar target/jenkinstest.jar
```

The application will start on port 8080.

### Test the API
```bash
# Test the home endpoint
curl http://localhost:8080/

# Test the hello endpoint
curl http://localhost:8080/hello

# Test the hello endpoint with a custom name
curl "http://localhost:8080/hello?name=John"
```

### Run Tests
```bash
mvn test
```

## API Endpoints

| Endpoint | Method | Description | Response |
|----------|--------|-------------|----------|
| `/` | GET | Welcome message | `Welcome to Jenkins Test Spring Boot Application! Visit /hello for the greeting.` |
| `/hello` | GET | Hello World greeting | `Hello World updated with Spring Boot!` |
| `/hello?name={name}` | GET | Hello greeting with custom name | `Hello {name} updated with Spring Boot!` |