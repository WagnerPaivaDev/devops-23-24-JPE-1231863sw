import com.greglturnquist.payroll.Employee;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import static org.junit.Assert.assertEquals;


import static org.assertj.core.api.Assertions.assertThat;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Objects;
import java.util.Set;

import org.gradle.api.Project;
import org.gradle.api.file.RegularFile;
import org.gradle.api.plugins.BasePlugin;
import org.gradle.api.publish.plugins.PublishingPlugin;
import org.gradle.language.base.plugins.LifecycleBasePlugin;
import org.gradle.testfixtures.ProjectBuilder;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.siouan.frontendgradleplugin.infrastructure.gradle.AssembleTask;
import org.siouan.frontendgradleplugin.infrastructure.gradle.CheckTask;
import org.siouan.frontendgradleplugin.infrastructure.gradle.CleanTask;
import org.siouan.frontendgradleplugin.infrastructure.gradle.FrontendExtension;
import org.siouan.frontendgradleplugin.infrastructure.gradle.InstallFrontendTask;
import org.siouan.frontendgradleplugin.infrastructure.gradle.InstallNodeTask;
import org.siouan.frontendgradleplugin.infrastructure.gradle.InstallPackageManagerTask;
import org.siouan.frontendgradleplugin.infrastructure.gradle.PublishTask;
import org.siouan.frontendgradleplugin.infrastructure.gradle.ResolvePackageManagerTask;



public class EmployeeTest {

    /**
     * Test of Employee constructor, of class Employee.
     */
    @Test

   void testEmployee() {
        //Arrange
        String firstName = "Frodo";
        String lastName = "Baggins";
        String description = "ring bearer";
        int jobYears = 4;
        String email = "frodobaggins@hotmail.com";


        //Act
        Employee employee = new Employee(firstName, lastName, description, jobYears,email);

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
        String email = "frodobaggins@hotmail.com";

        //Act
        Employee employee = new Employee(firstName, lastName, description, jobYears,email);

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
    public void testExceptionNullFirstName () {
        //Arrange
        String firstName = null;
        String lastName = "Baggins";
        String description = "ring bearer";
        int jobYears = 4;
        String email = "frodobaggins@hotmail.com";

        String exceptionMessage = "First name must not be null or empty.";

        //Act + Assert
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Employee(firstName, lastName, description, jobYears,email);
        });
        assertEquals(exceptionMessage, exception.getMessage());
    }

    /**
     * Test of Employee if exception is thrown, of class Employee, when first name is empty.
     */
    @Test
    public void testExceptionEmptyFirstName (){
        //Arrange
        String firstName = "";
        String lastName = "Baggins";
        String description = "ring bearer";
        int jobYears = 4;
        String email = "frodobaggins@hotmail.com";

        String exceptionMessage = "First name must not be null or empty.";

        //Act + Assert
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Employee(firstName, lastName, description, jobYears,email);
        });
        assertEquals(exceptionMessage, exception.getMessage());
    }

    /**
     * est of Employee if exception is thrown, of class Employee, when last name is null.
     */
    @Test
    public void testExceptionNullLastName () {
        //Arrange
        String firstName = "Frodo";
        String lastName = null;
        String description = "ring bearer";
        int jobYears = 4;
        String email = "frodobaggins@hotmail.com";

        String exceptionMessage = "Last name must not be null or empty.";

        //Act + Assert
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Employee(firstName, lastName, description, jobYears,email);
        });
        assertEquals(exceptionMessage, exception.getMessage());
    }

    /**
     * Test of Employee if exception is thrown, of class Employee, when last name is empty.
     */
    @Test
    public void testExceptionEmptyLastName () {
        //Arrange
        String firstName = "Frodo";
        String lastName = "";
        String description = "ring bearer";
        int jobYears = 4;
        String email = "frodobaggins@hotmail.com";

        String exceptionMessage = "Last name must not be null or empty.";

        //Act + Assert
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Employee(firstName, lastName, description, jobYears,email);
        });
        assertEquals(exceptionMessage, exception.getMessage());
    }

    /**
     * Test of Employee if exception is thrown, of class Employee, when description is null.
     */
    @Test
    public void testExceptionNullDescription () {
        //Arrange
        String firstName = "Frodo";
        String lastName = "Baggins";
        String description = null;
        int jobYears = 4;
        String email = "frodobaggins@hotmail.com";

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
    public void testExceptionEmptyDescription () {
        //Arrange
        String firstName = "Frodo";
        String lastName = "Baggins";
        String description = "";
        int jobYears = 4;
        String email = "frodobaggins@hotmail.com";

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
    public void testExceptionNullJobYearsLowerThanZero () {
        //Arrange
        String firstName = "Frodo";
        String lastName = "Baggins";
        String description = "ring bearer";
        int jobYears = -15;
        String email = "frodobaggins@hotmail.com";

        String exceptionMessage = "Job years must be greater than 0.";

        //Act + Assert
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Employee(firstName, lastName, description, jobYears,email);
        });
        assertEquals(exceptionMessage, exception.getMessage());
    }

    /**
     * Test of Employee if exception is thrown, of class Employee, when email is null.
     */

    @Test
    public void testExceptionNullEmail () {
        //Arrange
        String firstName = "Frodo";
        String lastName = "Baggins";
        String description = "ring bearer";
        int jobYears = 4;
        String email = null;
        String exceptionMessage = "Invalid input";

        //Act + Assert
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Employee(firstName, lastName, description, jobYears,email);
        });
        assertEquals(exceptionMessage, exception.getMessage());
    }

    /**
     * Test of Employee if exception is thrown, of class Employee, when email is empty.
     */
    @Test
    public void testExceptionEmptyEmail () {
        //Arrange
        String firstName = "Frodo";
        String lastName = "Baggins";
        String description = "ring bearer";
        int jobYears = 4;
        String email = "";
        String exceptionMessage = "Invalid input";

        //Act + Assert
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Employee(firstName, lastName, description, jobYears,email);
        });
        assertEquals(exceptionMessage, exception.getMessage());
    }

    @Test
    public void testExceptionInvalidEmailWithoutAt () {
        //Arrange
        String firstName = "Frodo";
        String lastName = "Baggins";
        String description = "ring bearer";
        int jobYears = 4;
        String email = "frodobagginshotmail.com";
        String exceptionMessage = "Invalid input";
        //Act + Assert
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Employee(firstName, lastName, description, jobYears,email);
        });
        assertEquals(exceptionMessage, exception.getMessage());
    }
}