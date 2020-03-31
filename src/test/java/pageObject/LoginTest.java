package pageObject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class LoginTest {
	private WebDriver driver;
	
	public void loginPositivo() {
		String exePath = "C:\\Users\\wilson.braguini\\chromedriver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		String url = "https://www.advantageonlineshopping.com/#/";
		driver.get(url);
		driver.findElement(By.id("menuUser")).click();
		WebElement loginModal = driver.findElement(By.xpath("/html/body/login-modal/div/div/div[3]"));
		loginModal.findElement(By.xpath("/html/body/login-modal/div/div/div[3]/sec-form/sec-view[1]/div/input")).sendKeys("Wilson");
		loginModal.findElement(By.xpath("/html/body/login-modal/div/div/div[3]/sec-form/sec-view[2]/div/input")).sendKeys("Rsi12345");
		try {
				loginModal.findElement(By.name("remember_me")).click();
			}catch (Exception e) {
				System.out.println(e);
			}
			
		loginModal.findElement(By.id("sign_in_btnundefined")).sendKeys(Keys.ENTER);
		String texto = driver.findElement(By.linkText("Wilson")).getText();
		Assert.assertEquals("Wilson", texto);
		//driver.close();
					
		}
	
	public void loginNegativo() {
		String exePath = "C:\\Users\\wilson.braguini\\chromedriver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		String url = "https://www.advantageonlineshopping.com/#/";
		driver.get(url);
		driver.findElement(By.id("menuUser")).click();
		WebElement loginModal = driver.findElement(By.xpath("/html/body/login-modal/div/div/div[3]"));
		loginModal.findElement(By.xpath("/html/body/login-modal/div/div/div[3]/sec-form/sec-view[1]/div/input")).sendKeys("Zetineciv");
		loginModal.findElement(By.xpath("/html/body/login-modal/div/div/div[3]/sec-form/sec-view[2]/div/input")).sendKeys("Rsi358269");
		try {
			loginModal.findElement(By.name("remember_me")).click();
		}catch (Exception e) {
			System.out.println(e);
		}
		loginModal.findElement(By.id("sign_in_btnundefined")).sendKeys(Keys.ENTER);
		//driver.close();
		
	}
	
		
	}
	

