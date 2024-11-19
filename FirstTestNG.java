package Day21;

import org.testng.annotations.Test;

public class FirstTestNG {
	@Test(priority=1)
	void openURL() {
		System.out.println("Opening url");
	}
	@Test(priority=2)
	void login() {
		System.out.println("Login in to the URL");
	}
	@Test(priority=3)
	void autoValidation() {
		System.out.println("Automatic Validation");
	}
	@Test(priority=4)
	void logout() {
		System.out.println("logout from the URL");
	
	}

}
