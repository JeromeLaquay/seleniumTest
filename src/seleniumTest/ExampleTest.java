package seleniumTest;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertTrue;


import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class ExampleTest {

	@Test
	public void test() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\JEROMELaquay\\Documents\\SeleniumTest\\jar\\chromedriver.exe");
		WebDriver browser = new ChromeDriver();
        browser.get("https://www.saucelabs.com");
        WebElement href = browser.findElement(By.xpath("//a[@href='https://app.saucelabs.com/login']"));
        assertTrue((href.isDisplayed()));

       browser.close();       
	}

}
