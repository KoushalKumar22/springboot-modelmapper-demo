# Spring Boot ModelMapper Demo: Student Attendance Management

## Overview
This project demonstrates a Spring Boot application that manages student attendance using the ModelMapper library for object mapping. The application includes CRUD operations for student and attendance records, and showcases how to use ModelMapper to convert between DTOs and entities.

## Features
- Manage student records (Create, Read, Update, Delete)
- Use ModelMapper for converting between DTOs and entities

## Technologies Used
- Spring Boot
- Spring Data JPA
- ModelMapper
- H2 Database (for development purposes)
- Maven

## Getting Started

### Prerequisites
- Java 11 or higher
- Maven
- Git

### Installation

1. Clone the repository:
    ```bash
    git clone https://github.com/KoushalKumar22/springboot-modelmapper-demo.git
    ```

2. Navigate to the project directory:
    ```bash
    cd springboot-modelmapper-demo
    ```

3. Build the project using Maven:
    ```bash
    mvn clean install
    ```

4. Run the application:
    ```bash
    mvn spring-boot:run
    ```

The application will start on `http://localhost:8080`.

## API Endpoints

### Student Endpoints
- `GET /all` - Retrieve all students
- `GET /students/{id}` - Retrieve a student by ID
- `POST /save` - Create a new student
- `PUT /students/{id}` - Update an existing student


## Using ModelMapper
ModelMapper is used in this project to convert between entity objects and Data Transfer Objects (DTOs). The configuration can be found in the `MapperConfigration` class, and the mappings are applied in the service layer.

## Contributing
If you would like to contribute to this project, please fork the repository and submit a pull request. For major changes, please open an issue to discuss your proposed changes.

## License
This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Acknowledgements
- [Spring Boot](https://spring.io/projects/spring-boot)
- [ModelMapper](http://modelmapper.org/)
