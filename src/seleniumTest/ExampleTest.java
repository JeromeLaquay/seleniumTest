package seleniumTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExampleTest {
	WebDriver driver;
	
	@Test
	public void test() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\JEROMELaquay\\git\\seleniumTest\\jar\\chromedriver.exe");
		driver = new ChromeDriver();
        driver.get("https://www.saucelabs.com");
        //attends 3 secondes
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        //mets la fenêtre en grand
        driver.manage().window().maximize();
        //récupérer le titre de l'onglet de la page
        String title = driver.getTitle();
        //tester le titre
        assertEquals("Cross Browser Testing, Selenium Testing, Mobile Testing | Sauce Labs", title);
        //trouver le bouton via xpath, dans chrome -> inspecter l'élément -> click droit sur l'élément -> copy -> full xpath
        WebElement learnMore = driver.findElement(By.xpath("/html/body/div[2]/section[1]/div/div/div/div[1]/div/div/a"));
        assertTrue((learnMore.isDisplayed()));
        assertEquals("Learn more", learnMore.getText());
        learnMore.click();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        WebElement classe = driver.findElement(By.className("supertitle"));
        assertTrue((classe.isDisplayed()));
        assertEquals("CONTINUOUS TESTING", classe.getText());
	} 
	@After
	public void after() {
		driver.close();
	}
}
