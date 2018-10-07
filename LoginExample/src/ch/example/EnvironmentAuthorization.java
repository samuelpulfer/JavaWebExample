package ch.example;

public class EnvironmentAuthorization implements Authorization {

	@Override
	public boolean authorize(Employee emp) {
		// If
		if (emp.getUsername().equalsIgnoreCase("admin"))
			return true;
		return false;
	}

}
