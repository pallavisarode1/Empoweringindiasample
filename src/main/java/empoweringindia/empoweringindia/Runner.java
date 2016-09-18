package empoweringindia.empoweringindia;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions


(   
		 features="D:\\inportia\\empoweringindia\\resources\\Features",
		 glue="Com\\importia\\stepDefination",
		 tags = { "@home" },
			plugin = { "pretty", "html:target/cucumber" }
		)

public class Runner 
{
   
}
