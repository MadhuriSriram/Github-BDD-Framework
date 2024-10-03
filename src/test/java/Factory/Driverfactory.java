package Factory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driverfactory {
	static WebDriver driver = null;
public static void initializeBrowser(String browserName) {
	
	if( browserName.equals("Chrome")) {
		 driver=new ChromeDriver();
	}else if(browserName.equals("Firefox")) {
		 driver=new FirefoxDriver();
	}else if (browserName.equals("Edge")) {
		 driver=new EdgeDriver();
	}	

}
public static WebDriver getdriver() {
	return driver ;
}
}
