package PageObject;

public class HomePage  extends BasePage

{

	String homepage_url ="http://www.empoweringindia.org/new/LoksabhaElecYear.aspx";
	public  void open_homepage()
	{
		browser.get(homepage_url);
	}
	
	
	
}
