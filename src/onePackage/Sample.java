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
		
		String my_Title00 = driver.getTitle();
		System.out.print("<title>" + my_Title00);System.out.println("<title>");
		String my_Url00 = driver.getCurrentUrl();
		System.out.print("	<url>" + my_Url00);System.out.println("<url>");
		
		
		driver.findElement(By.xpath("//*[@id=\"navigationmenu\"]/div[2]/ul/li[2]/a")).click();
		String my_Title01 = driver.getTitle();
		System.out.print("<title>" + my_Title01);System.out.println("<title>");
		String my_Url01 = driver.getCurrentUrl();
		System.out.print("	<url>" + my_Url01);System.out.println("<url>");
		
		List<WebElement> childLinks01 = driver.findElement(By.xpath("//*[@id=\"ttr_content\"]")).findElements(By.tagName("a"));
		for(WebElement Link : childLinks01) {
			System.out.print("		<title>" + Link.getText());System.out.println("<title>");
			System.out.print("			<url>" + Link.getAttribute("href"));System.out.println("<url>");
		}
		
		////////////////////////////////////////////////
		
		driver.findElement(By.xpath("//*[@id=\"navigationmenu\"]/div[2]/ul/li[3]/a")).click();
		String my_Title02 = driver.getTitle();
		System.out.print("<title>" + my_Title02);System.out.println("<title>");
		String my_Url02 = driver.getCurrentUrl();
		System.out.print("	<url>" + my_Url02);System.out.println("<url>");
		
		
		List<WebElement> childLinks02 = driver.findElement(By.xpath("//*[@id=\"ttr_content\"]")).findElements(By.tagName("a"));
		for(WebElement Link : childLinks02) {
			System.out.print("		<title>" + Link.getText());System.out.println("<title>");
			System.out.print("			<url>" + Link.getAttribute("href"));System.out.println("<url>");
		}
		
		////////////////////////////////////////////////		
		
		driver.findElement(By.xpath("//*[@id=\"navigationmenu\"]/div[2]/ul/li[4]/a")).click();
		String my_Title03 = driver.getTitle();
		System.out.print("<title>" + my_Title03);System.out.println("<title>");
		String my_Url03 = driver.getCurrentUrl();
		System.out.print("	<url>" + my_Url03);System.out.println("<url>");
		
		
		List<WebElement> childLinks03 = driver.findElement(By.xpath("//*[@id=\"ttr_content\"]")).findElements(By.tagName("a"));
		for(WebElement Link : childLinks03) {
			System.out.print("		<title>" + Link.getText());System.out.println("<title>");
			System.out.print("			<url>" + Link.getAttribute("href"));System.out.println("<url>");
		}
		
		////////////////////////////////////////////////
		
		driver.findElement(By.xpath("//*[@id=\"navigationmenu\"]/div[2]/ul/li[5]/a")).click();
		String my_Title04 = driver.getTitle();
		System.out.print("<title>" + my_Title04);System.out.println("<title>");
		String my_Url04 = driver.getCurrentUrl();
		System.out.print("	<url>" + my_Url04);System.out.println("<url>");
		
		
		List<WebElement> childLinks04 = driver.findElement(By.xpath("//*[@id=\"ttr_content\"]")).findElements(By.tagName("a"));
		for(WebElement Link : childLinks04) {
			System.out.print("		<title>" + Link.getText());System.out.println("<title>");
			System.out.print("			<url>" + Link.getAttribute("href"));System.out.println("<url>");
		}
		
		////////////////////////////////////////////////
		
		driver.findElement(By.xpath("//*[@id=\"navigationmenu\"]/div[2]/ul/li[6]/a")).click();
		String my_Title05 = driver.getTitle();
		System.out.print("<title>" + my_Title05);System.out.println("<title>");
		String my_Url05 = driver.getCurrentUrl();
		System.out.print("	<url>" + my_Url05);System.out.println("<url>");
		
		
		List<WebElement> childLinks05 = driver.findElement(By.xpath("//*[@id=\"ttr_content\"]")).findElements(By.tagName("a"));
		for(WebElement Link : childLinks05) {
			System.out.print("		<title>" + Link.getText());System.out.println("<title>");
			System.out.print("			<url>" + Link.getAttribute("href"));System.out.println("<url>");
		}
		
		////////////////////////////////////////////////
		
		
		Thread.sleep(3000);
		driver.quit();
		
					
	}

}
