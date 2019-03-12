import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WebDriveSetting {
    public WebDriver driver;

    @Before
    public void initChrome() throws IOException {
        System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\drivers/chromedriver.exe");
        System.setProperty("webdriver.ie.driver", "src\\main\\resources\\drivers/IEDriverServer.exe");
        System.setProperty("webdriver.gecko.driver", "src\\main\\resources\\drivers/geckodriver.exe");


        Properties properties = new Properties();
        FileInputStream in =  new FileInputStream("browserFile");
        properties.load(in);
        String browser = properties.getProperty("driver1"); // Выбор браузера

        if ("Chrome".equals(browser)) {
            driver = new ChromeDriver();

        } else if ("FireFox".equals(browser)) {
            driver = new FirefoxDriver();

        } else if ("IE".equals(browser)) {
            driver = new InternetExplorerDriver();

        } else if ("Default Value".equals(browser)) {
            driver = new InternetExplorerDriver();

        }

    }



    @After
    public void close() {
        driver.quit();

    }
}
