import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Sample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.muvelodes.eu");
		
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		System.out.println("Links count is: " +allLinks.size());
		
		for(WebElement Link : allLinks)
			System.out.println(Link.getText());
		
		driver.close();

		Thread.sleep(6000);
		driver.quit();
		
					
	}

}
