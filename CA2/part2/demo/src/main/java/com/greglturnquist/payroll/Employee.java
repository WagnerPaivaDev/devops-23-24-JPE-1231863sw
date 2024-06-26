package com.greglturnquist.payroll;

import java.util.Objects;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

/**
 * @author Greg Turnquist
 */
// tag::code[]
@Entity
public class Employee {

	private @Id @GeneratedValue Long id;
	private String firstName;
	private String lastName;
	private String description;
	private int jobYears;
	private String email;

	public Employee() {
	}

	public Employee(String firstName, String lastName, String description, int jobYears, String email) {
		setFirstName(firstName);
		setLastName(lastName);
		setDescription(description);
		setJobYears(jobYears);
		setEmail(email);
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Employee employee = (Employee) o;
		return Objects.equals(id, employee.id) &&
				Objects.equals(firstName, employee.firstName) &&
				Objects.equals(lastName, employee.lastName) &&
				Objects.equals(description, employee.description) &&
				jobYears == employee.jobYears &&
				Objects.equals(email, employee.email);
	}

	@Override
	public int hashCode() {

		return Objects.hash(id, firstName, lastName, description, jobYears, email);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		if (firstName == null || firstName.isEmpty())
			throw new IllegalArgumentException("First name must not be null or empty.");
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		if (lastName == null || lastName.isEmpty())
			throw new IllegalArgumentException("Last name must not be null or empty.");
		this.lastName = lastName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		if (description == null || description.isEmpty())
			throw new IllegalArgumentException("Description must not be null or empty.");
		this.description = description;
	}

	public int getJobYears() {
		return jobYears;
	}

	public void setJobYears(int jobYears) {
		if (jobYears < 0)
			throw new IllegalArgumentException("Job years must be greater than 0.");
		this.jobYears = jobYears;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		if (email == null || email.isEmpty() || !email.contains("@"))
			throw new IllegalArgumentException("Invalid input");

		String emailRegex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$";
		Pattern pattern = Pattern.compile(emailRegex);
		Matcher matcher = pattern.matcher(email);

		if (!matcher.matches()) {
			throw new IllegalArgumentException("Invalid email format");
		}


		this.email = email;
	}

	@Override
	public String toString() {
		return "Employee{" +
				"id=" + id +
				", firstName='" + firstName + '\'' +
				", lastName='" + lastName + '\'' +
				", description='" + description + '\'' +
				", jobYears=" + jobYears + '\'' +
				", email=" + email +
				'}';
	}
}
// end::code[]