package pageObject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CadastroTest {
	private WebDriver driver;
	
	public void cadastroPositivo() {
		String exePath = "C:\\Users\\wilson.braguini\\chromedriver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		String url = "https://www.advantageonlineshopping.com/#/";
		driver.get(url);
		driver.findElement(By.id("menuUser")).click();
		WebElement loginModal = driver.findElement(By.xpath("/html/body/login-modal/div/div/div[3]"));
		loginModal.findElement(By.xpath("/html/body/login-modal/div/div/div[3]/a[2]")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//*[@id=\"formCover\"]/div[1]/div[1]/sec-view[1]/div/input")).sendKeys("AnnaCau");
		driver.findElement(By.xpath("//*[@id=\"formCover\"]/div[1]/div[1]/sec-view[2]/div/input")).sendKeys("anapaulacau@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"formCover\"]/div[1]/div[2]/sec-view[1]/div/input")).sendKeys("Rsi67891");
		driver.findElement(By.xpath("//*[@id=\"formCover\"]/div[1]/div[2]/sec-view[2]/div/input")).sendKeys("Rsi67891");
		driver.findElement(By.xpath("//*[@id=\"formCover\"]/div[2]/div[1]/sec-view[1]/div/input")).sendKeys("Anna");
		driver.findElement(By.xpath("//*[@id=\"formCover\"]/div[2]/div[1]/sec-view[2]/div/input")).sendKeys("Cau");
		driver.findElement(By.xpath("//*[@id=\"formCover\"]/div[2]/div[2]/sec-view/div/input")).sendKeys("936123612");
		WebElement menu = driver.findElement(By.xpath("//*[@id=\"formCover\"]/div[3]/div[1]/sec-view[1]/div/select"));
		Actions actions = new Actions(driver);
		actions.moveToElement(menu).perform();
		driver.findElement(By.xpath("//*[@id=\"formCover\"]/div[3]/div[1]/sec-view[1]/div/select/option[30]")).click();
		driver.findElement(By.xpath("//*[@id=\"formCover\"]/div[3]/div[1]/sec-view[2]/div/input")).sendKeys("Osasco");
		driver.findElement(By.xpath("//*[@id=\"formCover\"]/div[3]/div[2]/sec-view[1]/div/input")).sendKeys("Rua Antônio Peres Paniágua, 410 - Quitaúna");
		driver.findElement(By.xpath("//*[@id=\"formCover\"]/div[3]/div[2]/sec-view[2]/div/input")).sendKeys("São Paulo");
		driver.findElement(By.xpath("//*[@id=\"formCover\"]/div[3]/div[3]/sec-view/div/input")).sendKeys("06186-100");
		try {
			driver.findElement(By.name("i_agree")).click();
		}catch (Exception e) {
			System.out.println(e);
		}
		//driver.findElement(By.id("register_btnundefined")).click();
		//driver.close();
	}
	
	public void cadastroNegativo() {
		String exePath = "C:\\Users\\wilson.braguini\\chromedriver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		String url = "https://www.advantageonlineshopping.com/#/";
		driver.get(url);
		driver.findElement(By.id("menuUser")).click();
		WebElement loginModal = driver.findElement(By.xpath("/html/body/login-modal/div/div/div[3]"));
		loginModal.findElement(By.xpath("/html/body/login-modal/div/div/div[3]/a[2]")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//*[@id=\"formCover\"]/div[1]/div[1]/sec-view[1]/div/input")).sendKeys("Wilson");
		driver.findElement(By.xpath("//*[@id=\"formCover\"]/div[1]/div[1]/sec-view[2]/div/input")).sendKeys("wilson.braguini@rsinet.com.br");
		driver.findElement(By.xpath("//*[@id=\"formCover\"]/div[1]/div[2]/sec-view[1]/div/input")).sendKeys("Rsi12345");
		driver.findElement(By.xpath("//*[@id=\"formCover\"]/div[1]/div[2]/sec-view[2]/div/input")).sendKeys("Rsi12345");
		driver.findElement(By.xpath("//*[@id=\"formCover\"]/div[2]/div[1]/sec-view[1]/div/input")).sendKeys("Wilson");
		driver.findElement(By.xpath("//*[@id=\"formCover\"]/div[2]/div[1]/sec-view[2]/div/input")).sendKeys("Braguini");
		driver.findElement(By.xpath("//*[@id=\"formCover\"]/div[2]/div[2]/sec-view/div/input")).sendKeys("912345678");
		WebElement menu = driver.findElement(By.xpath("//*[@id=\"formCover\"]/div[3]/div[1]/sec-view[1]/div/select"));
		Actions actions = new Actions(driver);
		actions.moveToElement(menu).perform();
		driver.findElement(By.xpath("//*[@id=\"formCover\"]/div[3]/div[1]/sec-view[1]/div/select/option[30]")).click();
		driver.findElement(By.xpath("//*[@id=\"formCover\"]/div[3]/div[1]/sec-view[2]/div/input")).sendKeys("Osasco");
		driver.findElement(By.xpath("//*[@id=\"formCover\"]/div[3]/div[2]/sec-view[1]/div/input")).sendKeys("Rua Antônio Peres Paniágua, 406 - Quitaúna");
		driver.findElement(By.xpath("//*[@id=\"formCover\"]/div[3]/div[2]/sec-view[2]/div/input")).sendKeys("São Paulo");
		driver.findElement(By.xpath("//*[@id=\"formCover\"]/div[3]/div[3]/sec-view/div/input")).sendKeys("06186-100");
		try {
			driver.findElement(By.name("i_agree")).click();
		}catch (Exception e) {
			System.out.println(e);
		}
		driver.findElement(By.id("register_btnundefined")).click();
		//driver.close();
		
	}

}
