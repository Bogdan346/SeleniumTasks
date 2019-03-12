import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WebDriveSetting {
    public WebDriver driver;

    @Before
    public void initChrome() throws IOException {
        System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\drivers/chromedriver.exe");
        System.setProperty("webdriver.ie.driver", "src\\main\\resources\\drivers/IEDriverServer.exe");


        Properties properties = new Properties();
        properties.setProperty("CH", "Chrome");
        properties.setProperty("FF", "FireFox");
        properties.setProperty("IE", "IE");
        FileOutputStream out = new FileOutputStream("browserFile");
        properties.store(out, "Brawser name");

        String browser = properties.getProperty("CH", "Default Value"); // Выбор браузера

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
