package BDD.UPS.Utilities;

import cucumber.api.java.After;

public class AfterActions {
	@After 
	public void afterActions() {
		
		SetUpDrivers.tearDownChromeDriver();
	}

}
