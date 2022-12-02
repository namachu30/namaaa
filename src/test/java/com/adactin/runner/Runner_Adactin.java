package com.adactin.runner;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import io.github.bonigarcia.wdm.WebDriverManager;
@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\GOD\\eclipse-workspace\\AdactinCucumber\\src\\test\\java\\com\\adactin\\feature\\Adactin.feature",
glue = "com.adactin.stepdefinition",
strict = false
//plugin = { "html:Reports/HtmlReport"
//	
//}
)
public class Runner_Adactin {
public static WebDriver driver;
@BeforeClass
public static void setup() {
	WebDriverManager.chromedriver().setup();
	
	driver = new ChromeDriver();
	
	driver.manage().window().maximize();
}

@AfterClass
public static  void teardown() {
	driver.close();

}		
	}

