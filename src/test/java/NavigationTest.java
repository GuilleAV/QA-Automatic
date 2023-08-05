import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class NavigationTest {

    @Test
    public void navigateToGoogle() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\usuario\\IdeaProjects\\seleniun-basic\\src\\test\\resources\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com");

        driver.findElement(By.cssSelector("input#email")).sendKeys("");
        driver.findElement(By.cssSelector("input#pass")).sendKeys("");
        driver.findElement(By.cssSelector("button[name='login']")).click();

        Thread.sleep(3000);

        driver.quit();

    }

    @Test
    public void navigateToArgentina(){

        System.setProperty("webdriver.chrome.driver","C:\\Users\\usuario\\IdeaProjects\\seleniun-basic\\src\\test\\resources\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.mercadolibre.com");

        driver.findElement(By.xpath("//nav//ul//li//a[contains(text(),'Argentina')]")).click();

        String currentUrl = driver.getCurrentUrl();

        String expectedUrl = "www.mercadolibre.com.ar";

        assertTrue(currentUrl.contains(expectedUrl),
                "se esperaba que la variable contenga "+expectedUrl+" pero se obtuvo "+currentUrl);

        driver.quit();

    }


}
