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
		driver.manage().window().maximize();
		

//		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
//		System.out.println("Links count is: " +allLinks.size());
				
		////////////////////////////////////////////////
		
		driver.findElement(By.xpath("//*[@id=\"navigationmenu\"]/div[2]/ul/li[2]/a")).click();
		
		List<WebElement> childLinks1 = driver.findElement(By.xpath("//*[@id=\"ttr_content\"]")).findElements(By.tagName("a"));
		for(WebElement Link : childLinks1) {
				System.out.println(Link.getText());
		}
		
		////////////////////////////////////////////////
		
		driver.findElement(By.xpath("//*[@id=\"navigationmenu\"]/div[2]/ul/li[3]/a")).click();

		List<WebElement> childLinks2 = driver.findElement(By.xpath("//*[@id=\"ttr_content\"]")).findElements(By.tagName("a"));
		for(WebElement Link : childLinks2) {
				System.out.println(Link.getText());
		}
		
		////////////////////////////////////////////////		
		
		driver.findElement(By.xpath("//*[@id=\"navigationmenu\"]/div[2]/ul/li[4]/a")).click();

		List<WebElement> childLinks3 = driver.findElement(By.xpath("//*[@id=\"ttr_content\"]")).findElements(By.tagName("a"));
		for(WebElement Link : childLinks3) {
				System.out.println(Link.getText());
		}
		
		////////////////////////////////////////////////
		
		driver.findElement(By.xpath("//*[@id=\"navigationmenu\"]/div[2]/ul/li[5]/a")).click();

		List<WebElement> childLinks4 = driver.findElement(By.xpath("//*[@id=\"ttr_content\"]")).findElements(By.tagName("a"));
		for(WebElement Link : childLinks4) {
				System.out.println(Link.getText());
		}
		
		////////////////////////////////////////////////
		
		driver.findElement(By.xpath("//*[@id=\"navigationmenu\"]/div[2]/ul/li[6]/a")).click();

		List<WebElement> childLinks5 = driver.findElement(By.xpath("//*[@id=\"ttr_content\"]")).findElements(By.tagName("a"));
		for(WebElement Link : childLinks5) {
				System.out.println(Link.getText());
		}
		
		////////////////////////////////////////////////
		
		
		Thread.sleep(3000);
		driver.quit();
		
					
	}

}
