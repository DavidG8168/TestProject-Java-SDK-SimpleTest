import io.testproject.sdk.drivers.web.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 * Example test.
 */
public class Test {
    public static void main(String[] args) throws Exception {
        // Create driver.
        ChromeDriver driver = new ChromeDriver("xMOUq-CTwc12Ru7Vjls1syE6uZ8B7vxcv1KAs55XaOY1" ,new ChromeOptions(), "JenkinsPipeline");

        // Navigate to URL.
        driver.get("https://example.testproject.io/web/");

        // Perform login.
        driver.findElement(By.cssSelector("#name")).sendKeys("John Smith");
        driver.findElement(By.cssSelector("#password")).sendKeys("12345");
        driver.findElement(By.cssSelector("#login")).click();

        // Determine test result.
        boolean passed = driver.findElement(By.cssSelector("#logout")).isDisplayed();

        // Print to console test result.
        if (passed) {
            System.out.println("Test Passed.");
        } else {
            System.out.println("Test Failed.");
        }

        // Quit driver to generate report.
        driver.quit();
    }
}
