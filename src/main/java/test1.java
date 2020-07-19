
import io.testproject.sdk.drivers.web.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeOptions;


final class BasicTest {

    public static void main(final String[] args) throws Exception {

        ChromeDriver driver = new ChromeDriver("xMOUq-CTwc12Ru7Vjls1syE6uZ8B7vxcv1KAs55XaOY1" ,new ChromeOptions(), "CodeDavidJava");

        driver.navigate().to("https://example.testproject.io/web/");

        driver.report().step("Navigated to site successfully", true);

        driver.findElement(By.cssSelector("#name")).sendKeys("John Smith");
        driver.findElement(By.cssSelector("#password")).sendKeys("12345");
        driver.findElement(By.cssSelector("#login")).click();

        driver.report().step("Elements located successfully", true);

        boolean passed = driver.findElement(By.cssSelector("#logout")).isDisplayed();

        if (passed) {
            driver.report().test("Test Passed", true);
            System.out.println("Test Passed");
        } else {
            driver.report().test("Test Failed", false);
            System.out.println("Test Failed");
        }

        driver.quit();
    }
}