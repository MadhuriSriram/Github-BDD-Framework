package Hooks;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Factory.Driverfactory;
import io.cucumber.java.Before;

public class Myhooks {
	WebDriver driver;
@Before
public void setup() {
Driverfactory.initializeBrowser("Chrome");
driver=Driverfactory.getdriver();
driver=new ChromeDriver();
driver.manage().deleteAllCookies();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.get("https://tutorialsninja.com/demo/");

}
public void tearDown() {
	driver.quit();
}

}
