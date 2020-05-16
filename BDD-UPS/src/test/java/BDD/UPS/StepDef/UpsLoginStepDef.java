package BDD.UPS.StepDef;

import org.testng.Assert;

import BDD.UPS.PageAction.UPSLoginActions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class UpsLoginStepDef {
	UPSLoginActions UPSLogin=new UPSLoginActions();
	@Given("^UPS login page launched$")
public void ups_login_page_launched() throws Throwable {
UPSLogin.getUpsLoginPage();
String Expectedtitle="Login | UPS - United States";
String Actualtitle=UPSLogin.UPSLoginTitle();
Assert.assertEquals(Actualtitle, Expectedtitle);

}

@When("^Customer input wrong UserName \"([^\"]*)\" and wrong password \"([^\"]*)\"$")
public void customer_input_wrong_UserName_and_wrong_password(String username, String password) throws Throwable {

    UPSLogin.login(username);;
    UPSLogin.pass(password);
}

@When("^Customer click on LogIn button$")
public void customer_click_on_LogIn_button() throws Throwable {

	UPSLogin.sbmt();
}

@Then("^Customer recieve an error message$")
public void customer_recieve_an_error_message() throws Throwable {

    String Actualerrormsg=UPSLogin.errormsg();
    boolean bool=false;
    if (Actualerrormsg.contains("unsuccessful attempts"))
    {bool=true;}
    Assert.assertEquals(bool, true);
}

@When("^Customer input correct UserName \"([^\"]*)\" and correct password \"([^\"]*)\"$")
public void customer_input_correct_UserName_and_correct_password(String username, String password) throws Throwable {

	UPSLogin.login(username);
	UPSLogin.pass(password);
}

@Then("^Customer should be able to login$")
public void customer_should_be_able_to_login() throws Throwable {

    String actualtitle=UPSLogin.UPSHomePageTitle();
    		String expectedtitle="Home | UPS - United States";

Assert.assertEquals(actualtitle,  expectedtitle);

}






}
