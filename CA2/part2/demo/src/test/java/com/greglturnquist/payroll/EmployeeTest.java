package com.greglturnquist.payroll;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;


class EmployeeTest {
    /**
     * Test of Employee constructor, of class Employee.
     */
    @Test

    public void testEmployee() {
        //Arrange
        String firstName = "Frodo";
        String lastName = "Baggins";
        String description = "ring bearer";
        int jobYears = 4;
        String email = "isep@gmail.com";

        //Act
        Employee employee = new Employee(firstName, lastName, description, jobYears, email);

        //Assert
        assertNotNull(employee);
    }

    /**
     * Test of Employee getters, of class Employee.
     */
    @Test
    public void testEmployeeGetters() {
        //Arrange
        String firstName = "Frodo";
        String lastName = "Baggins";
        String description = "ring bearer";
        int jobYears = 4;
        String email = "isep@gmail.com";

        //Act
        Employee employee = new Employee(firstName, lastName, description, jobYears, email);

        //Assert
        assertEquals(firstName, employee.getFirstName());
        assertEquals(lastName, employee.getLastName());
        assertEquals(description, employee.getDescription());
        assertEquals(jobYears, employee.getJobYears());
    }

    /**
     * Test of Employee if exception is thrown, of class Employee, when first name is null.
     */
    @Test
    public void testExceptionNullFirstName() {
        //Arrange
        String firstName = null;
        String lastName = "Baggins";
        String description = "ring bearer";
        int jobYears = 4;
        String email = "isep@gmail.com";

        String exceptionMessage = "First name must not be null or empty.";

        //Act + Assert
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Employee(firstName, lastName, description, jobYears, email);
        });
        assertEquals(exceptionMessage, exception.getMessage());
    }

    /**
     * Test of Employee if exception is thrown, of class Employee, when first name is empty.
     */
    @Test
    public void testExceptionEmptyFirstName() {
        //Arrange
        String firstName = "";
        String lastName = "Baggins";
        String description = "ring bearer";
        int jobYears = 4;
        String email = "isep@gmail.com";

        String exceptionMessage = "First name must not be null or empty.";

        //Act + Assert
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Employee(firstName, lastName, description, jobYears, email);
        });
        assertEquals(exceptionMessage, exception.getMessage());
    }

    /**
     * est of Employee if exception is thrown, of class Employee, when last name is null.
     */
    @Test
    public void testExceptionNullLastName() {
        //Arrange
        String firstName = "Frodo";
        String lastName = null;
        String description = "ring bearer";
        int jobYears = 4;
        String email = "isep@gmail.com";


        String exceptionMessage = "Last name must not be null or empty.";

        //Act + Assert
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Employee(firstName, lastName, description, jobYears, email);
        });
        assertEquals(exceptionMessage, exception.getMessage());
    }

    /**
     * Test of Employee if exception is thrown, of class Employee, when last name is empty.
     */
    @Test
    public void testExceptionEmptyLastName() {
        //Arrange
        String firstName = "Frodo";
        String lastName = "";
        String description = "ring bearer";
        int jobYears = 4;
        String email = "isep@gmail.com";

        String exceptionMessage = "Last name must not be null or empty.";

        //Act + Assert
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Employee(firstName, lastName, description, jobYears, email);
        });
        assertEquals(exceptionMessage, exception.getMessage());
    }

    /**
     * Test of Employee if exception is thrown, of class Employee, when description is null.
     */
    @Test
    public void testExceptionNullDescription() {
        //Arrange
        String firstName = "Frodo";
        String lastName = "Baggins";
        String description = null;
        int jobYears = 4;
        String email = "isep@gmail.com";


        String exceptionMessage = "Description must not be null or empty.";

        //Act + Assert
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Employee(firstName, lastName, description, jobYears, email);
        });
        assertEquals(exceptionMessage, exception.getMessage());
    }

    /**
     * Test of Employee if exception is thrown, of class Employee, when description is empty.
     */
    @Test
    public void testExceptionEmptyDescription() {
        //Arrange
        String firstName = "Frodo";
        String lastName = "Baggins";
        String description = "";
        int jobYears = 4;
        String email = "isep@gmail.com";


        String exceptionMessage = "Description must not be null or empty.";

        //Act + Assert
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Employee(firstName, lastName, description, jobYears, email);
        });
        assertEquals(exceptionMessage, exception.getMessage());
    }

    /**
     * Test of Employee if exception is thrown, of class Employee, when jobYears is lower than 0.
     */
    @Test
    public void testExceptionNullJobYearsLowerThanZero() {
        //Arrange
        String firstName = "Frodo";
        String lastName = "Baggins";
        String description = "ring bearer";
        int jobYears = -1;
        String email = "isep@gmail.com";


        String exceptionMessage = "Job years must be greater than 0.";

        //Act + Assert
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Employee(firstName, lastName, description, jobYears, email);
        });
        assertEquals(exceptionMessage, exception.getMessage());
    }

    /**
     * Test of Employee if exception is thrown, of class Employee, when email is null.
     */

    @Test
    public void testExceptionNullEmail() {
        //Arrange
        String firstName = "Frodo";
        String lastName = "Baggins";
        String description = "ring bearer";
        int jobYears = 4;
        String email = null;

        String exceptionMessage = "Invalid input";

        //Act + Assert
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Employee(firstName, lastName, description, jobYears, email);
        });
        assertEquals(exceptionMessage, exception.getMessage());
    }

    /**
     * Test of Employee if exception is thrown, of class Employee, when email is empty.
     */

    @Test
    public void testExceptionEmptyEmail() {
        //Arrange
        String firstName = "Frodo";
        String lastName = "Baggins";
        String description = "ring bearer";
        int jobYears = 4;
        String email = "";

        String exceptionMessage = "Invalid input";

        //Act + Assert
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Employee(firstName, lastName, description, jobYears, email);
        });
        assertEquals(exceptionMessage, exception.getMessage());
    }

    @Test
    public void testIfEmailIsValid() {
        //Arrange
        String firstName = "Frodo";
        String lastName = "Baggins";
        String description = "ring bearer";
        int jobYears = 4;
        String email = "invalid.com";

        String exceptionMessage = "Invalid input";

        //Act + Assert
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Employee(firstName, lastName, description, jobYears, email);
        });
        assertEquals(exceptionMessage, exception.getMessage());
    }

}