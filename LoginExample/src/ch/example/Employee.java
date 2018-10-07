package ch.example;

public interface Employee {
	
	public enum Sex {
	    MALE, FEMALE, APACHEHELICOPTER
	}
	public String getEmployeeNumber();
	public String getTitle();
	public String getFirstname();
	public String getLastname();
	public Sex getSex();
	public String getUsername();
	public String getEmail();
}
