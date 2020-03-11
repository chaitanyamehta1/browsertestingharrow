package browsertesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IE {
    public static void main(String[] args) {
        String baseUrl1 = "https://www.harrow.gov.uk/";
        System.setProperty("webdriver.ie.driver", "driver/IEDriverServer.exe");
        WebDriver driver = new InternetExplorerDriver();
        driver.manage().window().maximize();
        driver.get(baseUrl1);
        String title = driver.getTitle();
        System.out.println("Main Page"+title);
        driver.quit();
    }
}
