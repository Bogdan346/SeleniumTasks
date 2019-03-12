import org.junit.Test;
import org.openqa.selenium.By;

public class FirstTest  extends  WebDriveSetting{


    @Test
    public void firstTest() {

        driver.navigate().to("http://www.google.com");
        driver.findElement(By.name("q")).sendKeys("QA");
        driver.findElement(By.name("btnK")).click();

    }
}
