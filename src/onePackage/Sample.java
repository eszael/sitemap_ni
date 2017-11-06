package onePackage;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//import com.google.common.collect.Iterables;

public class Sample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.muvelodes.eu");
		driver.manage().window().maximize();
				
		////////////////////////////////////////////////
		
		try {
			
		
		File file = new File("sitemap_txt.txt");
        
		if(!file.exists()) {
				file.createNewFile();	
		}
		
		PrintWriter pw = new PrintWriter(file);
		
		String my_Title00 = driver.getTitle();
		pw.print("<title>" + my_Title00);pw.println("<title>");
		String my_Url00 = driver.getCurrentUrl();
		pw.print("	<url>" + my_Url00);pw.println("<url>");
		
		/////////////////////////////////////////////////////
		
		driver.findElement(By.xpath("//*[@id=\"navigationmenu\"]/div[2]/ul/li[2]/a")).click();
		
		String my_Title01 = driver.getTitle();
		pw.print("<title>" + my_Title01);pw.println("<title>");
		String my_Url01 = driver.getCurrentUrl();
		pw.print("	<url>" + my_Url01);pw.println("<url>");
		
		List<WebElement> childLinks01 = driver.findElement(By.xpath("//*[@id=\"ttr_content\"]")).findElements(By.tagName("a"));
		for(WebElement Link : childLinks01) {
			pw.print("		<title>" + Link.getText());pw.println("<title>");
			pw.print("			<url>" + Link.getAttribute("href"));pw.println("<url>");
		}
		
		/////////////////////////////////////////////////////
		
		driver.findElement(By.xpath("//*[@id=\"navigationmenu\"]/div[2]/ul/li[3]/a")).click();
		String my_Title02 = driver.getTitle();
		pw.print("<title>" + my_Title02);pw.println("<title>");
		String my_Url02 = driver.getCurrentUrl();
		pw.print("	<url>" + my_Url02);pw.println("<url>");
		
		List<WebElement> childLinks02 = driver.findElement(By.xpath("//*[@id=\"ttr_content\"]")).findElements(By.tagName("a"));
		for(WebElement Link : childLinks02) {
			pw.print("		<title>" + Link.getText());pw.println("<title>");
			pw.print("			<url>" + Link.getAttribute("href"));pw.println("<url>");
		}
		
		/////////////////////////////////////////////////////
		
		driver.findElement(By.xpath("//*[@id=\"navigationmenu\"]/div[2]/ul/li[4]/a")).click();
		String my_Title03 = driver.getTitle();
		pw.print("<title>" + my_Title03);pw.println("<title>");
		String my_Url03 = driver.getCurrentUrl();
		pw.print("	<url>" + my_Url03);pw.println("<url>");
		
		
		List<WebElement> childLinks03 = driver.findElement(By.xpath("//*[@id=\"ttr_content\"]")).findElements(By.tagName("a"));
		for(WebElement Link : childLinks03) {
			pw.print("		<title>" + Link.getText());pw.println("<title>");
			pw.print("			<url>" + Link.getAttribute("href"));pw.println("<url>");
		}		
		
		/////////////////////////////////////////////////////
		
		driver.findElement(By.xpath("//*[@id=\"navigationmenu\"]/div[2]/ul/li[5]/a")).click();
		String my_Title04 = driver.getTitle();
		pw.print("<title>" + my_Title04);pw.println("<title>");
		String my_Url04 = driver.getCurrentUrl();
		pw.print("	<url>" + my_Url04);pw.println("<url>");
		
		
		List<WebElement> childLinks04 = driver.findElement(By.xpath("//*[@id=\"ttr_content\"]")).findElements(By.tagName("a"));
		for(WebElement Link : childLinks04) {
			pw.print("		<title>" + Link.getText());pw.println("<title>");
			pw.print("			<url>" + Link.getAttribute("href"));pw.println("<url>");
		}
		
		/////////////////////////////////////////////////////
		
		driver.findElement(By.xpath("//*[@id=\"navigationmenu\"]/div[2]/ul/li[6]/a")).click();
		String my_Title05 = driver.getTitle();
		pw.print("<title>" + my_Title05);pw.println("<title>");
		String my_Url05 = driver.getCurrentUrl();
		pw.print("	<url>" + my_Url05);pw.println("<url>");
		
		
		List<WebElement> childLinks05 = driver.findElement(By.xpath("//*[@id=\"ttr_content\"]")).findElements(By.tagName("a"));
		for(WebElement Link : childLinks05) {
			pw.print("		<title>" + Link.getText());pw.println("<title>");
			pw.print("			<url>" + Link.getAttribute("href"));pw.println("<url>");
		}
		
		/////////////////////////////////////////////////////
		
		pw.close();
		System.out.println("The sitemap has been completed.");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		Thread.sleep(1500);
		driver.quit();
				
	}

}
