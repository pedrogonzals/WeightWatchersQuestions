package Questions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Question2span {
	// set parameters
	WebDriver driver;

	// set path to local computer and location of file in computer
	// must set file path to location of file, place filepath after file////.

	String url = "file:////Users/pedrogonzales/Desktop/spanPage.html";
	String url2 = "file:////Users/pedrogonzales/Documents/workspace/WeightWatchersQuestions/src/test/resources/TestData/spanPage.html";

	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "/Users/pedrogonzales/Documents/Libraries/drivers/chromedriver");
		driver = new ChromeDriver();
	}

	@Test
	public void siteNavigation() {
		driver.manage().timeouts().pageLoadTimeout(100000, TimeUnit.MILLISECONDS);
		driver.get(url2);

		// String element3 =
		// driver.findElement(By.xpath("//span[.='Applesauce']")).getText();

		// System.out.println(element3);
	}
}
