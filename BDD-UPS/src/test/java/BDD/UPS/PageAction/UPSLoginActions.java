package BDD.UPS.PageAction;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import BDD.UPS.PageElement.UPSLoginElements;
import BDD.UPS.Utilities.SetUpDrivers;



public class UPSLoginActions {
	UPSLoginElements webelement;

	public UPSLoginActions() {

		this.webelement = new UPSLoginElements();
		PageFactory.initElements(SetUpDrivers.chromeDriver   , webelement);

	}
	
	
	
	
	



	public void getUpsLoginPage()
	{SetUpDrivers.chromeDriver.get("https://www.ups.com/lasso/login?loc=en_US");
	SetUpDrivers.chromeDriver.manage().window().maximize();
	SetUpDrivers.chromeDriver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	SetUpDrivers.chromeDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	
	
	
	}
	
	

	public void login(String log) {
		this.webelement.login.sendKeys(log);
	}

	public void pass(String pas) {
		this.webelement.password.sendKeys(pas);

	}

	public void sbmt() {
		this.webelement.click.click();
	}

	public String errormsg() {
		return this.webelement.text.getText();
	}

	public String loginlogo() {
		return this.webelement.loginlogo.getText();
	}
	public String UPSLoginTitle()
	{
		String title=SetUpDrivers.chromeDriver.getTitle();
		return title;
		
	}
	public String UPSHomePageTitle()
	{
		String hometitle=SetUpDrivers.chromeDriver.getTitle();
		return hometitle;
		
	}
}
