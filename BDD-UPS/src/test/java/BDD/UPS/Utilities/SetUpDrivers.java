package BDD.UPS.Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SetUpDrivers {
	public static WebDriver chromeDriver;
	public static void SetUpChromeDriver()
	{WebDriverManager.chromedriver().version("ChromeDriver 81.0.4044.138").setup();
	chromeDriver =new ChromeDriver();
}
	public static WebDriver getChromeDriver()
	{return chromeDriver;
	}
	public static  void tearDownChromeDriver()
	{chromeDriver.quit();
	}
}