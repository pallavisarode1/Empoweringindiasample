package Com.importia.stepDefination;


import PageObject.HomePage;
import cucumber.api.java.en.Given;

public class Homestep {
	HomePage homepageObject=new HomePage();
	@Given("^user open homepage$")
	public void user_open_homepage() throws Throwable {
		
		System.out.println("user is on Home page.");
	   homepageObject.open_homepage(); 
	}

	@Given("^verify if home page accessiable$")
	public void verify_if_home_page_accessiable() throws Throwable {
		System.out.println("user is accessiable Home page.");
		homepageObject.open_homepage(); 
	}

}
