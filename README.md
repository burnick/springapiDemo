# Spring Boot Demo API

This is a simple Spring Boot application that demonstrates how to create a simple API.

## How to build and run the application

### Prerequisites

*   Java 17
*   Maven 3.8.5
*   Docker

### Building the application

To build the application, run the following command:

```bash
./mvnw package
```

### Running the application

To run the application, run the following command:

```bash
java -jar target/demo-0.0.1-SNAPSHOT.jar
```

### Running the application with Docker

To run the application with Docker, first build the Docker image:

```bash
docker build -t spring-boot-demo .
```

Then run the Docker container:

```bash
docker run -p 8080:8080 spring-boot-demo
```

The application will be available at http://localhost:8080.
