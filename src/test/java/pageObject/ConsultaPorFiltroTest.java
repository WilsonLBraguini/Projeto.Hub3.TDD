package pageObject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class ConsultaPorFiltroTest {
	private WebDriver driver;
	
	public void consultaPorFiltroPositivo() {
		String exePath = "C:\\Users\\wilson.braguini\\chromedriver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		String url = "https://www.advantageonlineshopping.com/#/";
		driver.get(url);
		driver.findElement(By.id("menuSearch")).click();
		WebElement consultaPorFiltro = driver.findElement(By.id("autoComplete"));
		consultaPorFiltro.sendKeys("LAPTOPS");
	    consultaPorFiltro.sendKeys(Keys.ENTER);
		String texto = driver.findElement(By.xpath("//*[@id=\"mobileSlide\"]/ul/li[1]/div/div/div/span")).getText();
		Assert.assertEquals("LAPTOPS", texto);
	    //driver.close();
	}
	
	public void consultaPorFiltroNegativo() {
		String exePath = "C:\\Users\\wilson.braguini\\chromedriver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		String url = "https://www.advantageonlineshopping.com/#/";
		driver.get(url);
		driver.findElement(By.id("menuSearch")).click();
		WebElement consultaPorFiltro = driver.findElement(By.id("autoComplete"));
	    consultaPorFiltro.sendKeys("BIKE");
	    consultaPorFiltro.sendKeys(Keys.ENTER);
	     //driver.close();
		
	}

}
