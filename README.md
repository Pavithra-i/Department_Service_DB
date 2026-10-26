# Department Service Microservice

## Project Overview

The Department Service is a RESTful microservice developed using Java and Spring Boot to manage department information. It supports creating, retrieving, updating, and deleting department records using REST APIs and stores the data in MySQL.

## Technologies Used

- Java 21
- Spring Boot 4.1.2
- Spring Web MVC
- Spring Data JPA
- Hibernate
- MySQL
- Maven
- Jakarta Bean Validation
- Springdoc OpenAPI / Swagger UI
- Postman
- Git and GitHub

## Project Architecture

The application follows a layered architecture.

- Controller: Handles REST API requests.
- Service: Implements business logic.
- Repository: Performs database operations.
- Entity: Represents department records.
- Exception Handling: Handles errors and returns appropriate responses.

## Database Integration

Database Name: `department_db`

Application Port: `8081`

Department records are stored in MySQL using Spring Data JPA and Hibernate. The database tables are managed through the configured JPA settings.

## Department Entity

The Department entity contains:

- `id` — Unique department identifier.
- `name` — Department name.
- `location` — Department location.

## REST API Endpoints

Base URL: `http://localhost:8081`

- POST `/departments` — Create a department.
- GET `/departments` — Retrieve all departments.
- GET `/departments/{id}` — Retrieve a department by ID.
- PUT `/departments/{id}` — Update department details.
- DELETE `/departments/{id}` — Delete a department.

## Validation

Implemented request validation to ensure required department information is provided. Invalid requests return a `400 Bad Request` response.

## Exception Handling

Implemented exception handling for scenarios such as requesting a department that does not exist. The application returns a `404 Not Found` response when the requested department ID is unavailable.

## Swagger / OpenAPI

Swagger UI provides documentation for the Department Service APIs.

URL: `http://localhost:8081/swagger-ui/index.html`

## Postman Testing

Tested the Department Service APIs using Postman, including:

- Creating departments.
- Retrieving all departments.
- Retrieving departments by ID.
- Updating department details.
- Deleting departments.
- Testing validation errors.
- Testing nonexistent department IDs.
- Verifying saved records in MySQL.

## Project Information

Project: Employee and Department Microservices

Module: Department Service

Purpose: To manage department information through REST APIs with MySQL database integration.
