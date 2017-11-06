package onePackage;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

//import java.io.File;

//import com.google.common.collect.Iterables;

public class Sample2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.muvelodes.eu");
		driver.manage().window().maximize();
		

//		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
//		System.out.println("Links count is: " +allLinks.size());
				
		////////////////////////////////////////////////		
		
		try {

			DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder docBuilder = docFactory.newDocumentBuilder();

			// root elements
			Document doc = docBuilder.newDocument();
			Element rootElement = doc.createElement("sitemap");
			doc.appendChild(rootElement);

			// staff elements
			Element main00 = doc.createElement(driver.getTitle());
			rootElement.appendChild(main00);

			// 00 element
			String my_Title00 = driver.getTitle();
			Element Title00 = doc.createElement("title");
			Title00.appendChild(doc.createTextNode(my_Title00));
			main00.appendChild(Title00);
			String my_Url00 = driver.getCurrentUrl();
			Element Url00 = doc.createElement("url");
			Url00.appendChild(doc.createTextNode(my_Url00));
			main00.appendChild(Url00);
			
			driver.findElement(By.xpath("//*[@id=\"navigationmenu\"]/div[2]/ul/li[2]/a")).click();
			
			// staff elements
			Element main01 = doc.createElement(driver.getTitle());
			rootElement.appendChild(main01);
			
			// 01 element
			String my_Title01 = driver.getTitle();
			Element Title01 = doc.createElement("title");
			Title01.appendChild(doc.createTextNode(my_Title01));
			main01.appendChild(Title01);
			String my_Url01 = driver.getCurrentUrl();
			Element Url01 = doc.createElement("url");
			Url01.appendChild(doc.createTextNode(my_Url01));
			main01.appendChild(Url01);
			
			List<WebElement> childLinks01 = driver.findElement(By.xpath("//*[@id=\"ttr_content\"]")).findElements(By.tagName("a"));
			List<String> strings01 = new ArrayList<String>();
			for(WebElement e : childLinks01){
			    strings01.add(e.getText());
			}
			
			Element e = doc.createElement("title");
			e.appendChild(doc.createTextNode(strings01.get(0)));
			main01.appendChild(e);
			
			//String my_Url01 = driver.getCurrentUrl();
			//Element Url01 = doc.createElement("url");
			//Url01.appendChild(doc.createTextNode(my_Url01));
			//main01.appendChild(Url01);
			
			//String e = driver.getTitle();
			//Element Title03 = doc.createElement("title");
			//Title03.appendChild(doc.createTextNode(e));
			//sub.appendChild(Title03);
			
			//for(WebElement Link : childLinks01) {				
			//	String("			<url>" + Link.getAttribute("href"));System.out.println("<url>");
			//}
			
			
			// write the content into xml file
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource source = new DOMSource(doc);
			StreamResult result = new StreamResult(new File("file.xml"));

			// Output to console for testing
			// StreamResult result = new StreamResult(System.out);

			transformer.transform(source, result);

			System.out.println("File saved!");

		  } catch (ParserConfigurationException pce) {
			pce.printStackTrace();
		  } catch (TransformerException tfe) {
			tfe.printStackTrace();
		  }
		
		
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
		
		Thread.sleep(1500);
		driver.quit();
		
					
	}

}