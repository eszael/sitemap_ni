package onePackage;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.collect.Iterables;

public class Sample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.muvelodes.eu");
		

//		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
//		System.out.println("Links count is: " +allLinks.size());
				
		List<WebElement> navLinks = driver.findElements(By.tagName("nav"));
		
		for(WebElement Link : navLinks)
			System.out.println(Link.getText());
		
		/**********************************************************************/
		
		driver.findElement(By.xpath("//*[@id=\"navigationmenu\"]/div[2]/ul/li[2]/a")).click();
		
		List<WebElement> allLinks1 = driver.findElements(By.tagName("a"));
		for(WebElement Link : allLinks1) {
			System.out.println(Link.getText());			
		}
		
		/**********************************************************************/
		
		driver.findElement(By.xpath("//*[@id=\"navigationmenu\"]/div[2]/ul/li[3]/a")).click();
		
		List<WebElement> allLinks2 = driver.findElements(By.tagName("a"));
		for(WebElement Link : allLinks2) {
			System.out.println(Link.getText());	
		}
		
		/**********************************************************************/		
		
		driver.findElement(By.xpath("//*[@id=\"navigationmenu\"]/div[2]/ul/li[4]/a")).click();
		
		List<WebElement> allLinks3 = driver.findElements(By.tagName("a"));
		for(WebElement Link : allLinks3) {
			System.out.println(Link.getText());
		}
		
		/**********************************************************************/
		
		driver.findElement(By.xpath("//*[@id=\"navigationmenu\"]/div[2]/ul/li[5]/a")).click();
		
		List<WebElement> allLinks4 = driver.findElements(By.tagName("a"));
		for(WebElement Link : allLinks4) {
			System.out.println(Link.getText());
		}
		
		/**********************************************************************/
		
		driver.findElement(By.xpath("//*[@id=\"navigationmenu\"]/div[2]/ul/li[6]/a")).click();
		
		List<WebElement> allLinks5 = driver.findElements(By.tagName("a"));
		for(WebElement Link : allLinks5) {
			System.out.println(Link.getText());
		}
		
		/**********************************************************************/
		
		
		Thread.sleep(6000);
		driver.quit();
		
					
	}

}
