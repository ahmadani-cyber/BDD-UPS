package BDD.UPS.Utilities;

import cucumber.api.Scenario;
import cucumber.api.java.Before;

public class BeforeActions {

	@Before
	public void beforeActions(Scenario scen){
		System.out.println("===============Driver Initialization================");
		SetUpDrivers.SetUpChromeDriver();
		System.out.println(scen.getName());
	}
	
	
}
