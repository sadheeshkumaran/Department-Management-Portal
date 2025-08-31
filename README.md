# Department Management Portal

This is a simple Java application for managing department records using JPA (Hibernate) and MySQL. It provides basic CRUD operations for department entities.

## Features

- Insert new department records
- Find department by department number
- Update department details
- Delete department records

## Technologies Used

- Java 17
- Hibernate (JPA)
- MySQL
- Maven
- JUnit 5

## Project Structure

```
src/
  main/
    java/
      com/
        jspiders/
          department/
            App.java
            dao/
              DepartmentDao.java
            dto/
              Department.java
    resources/
      META-INF/
        persistence.xml
test/
  java/
    com/
      jspiders/
        department/
          AppTest.java
```

## Setup Instructions

1. **Clone the repository**  
   `git clone <repo-url>`

2. **Configure MySQL**  
   Ensure MySQL is running and accessible. The default configuration uses:
   - URL: `jdbc:mysql://localhost:3306/department?createDatabaseIfNotExist=true`
   - User: `root`
   - Password: `root`  
   Update `src/main/resources/META-INF/persistence.xml` if needed.

3. **Build the project**  
   Run:
   ```sh
   mvn clean install
   ```

4. **Run the application**  
   Execute the `main` method in [`com.jspiders.department.App`](src/main/java/com/jspiders/department/App.java).

## Usage

On running, you will be prompted to choose an operation:
- Insert Data
- Find Data
- Update Data
- Delete Data

Follow the on-screen instructions to manage department records.

## Testing

Unit tests are located in [`AppTest`](src/test/java/com/jspiders/department/AppTest.java).  
Run tests with:
```sh
mvn test
```

## License

This project is for educational purposes.
