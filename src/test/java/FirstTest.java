import org.junit.Test;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

public class FirstTest  extends  WebDriveSetting{


    @Test
    public void firstTest() {

        driver.navigate().to("http://www.google.com");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.name("q")).sendKeys("QA");
        driver.findElement(By.name("btnK")).click();

    }
}
