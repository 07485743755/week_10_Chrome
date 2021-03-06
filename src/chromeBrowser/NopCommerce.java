package chromeBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class NopCommerce {

    public static void main(String[] args) {

        String baseUrl = "https://demo.nopcommerce.com/";

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(baseUrl);

        String title = driver.getTitle();
        System.out.println("Title : " + driver.getTitle());
        System.out.println("Length of title : " + title.length());
        boolean verifyTitle = title.equals("nopCommerce demo store");

        boolean verifyTitleContain = title.contains("Login");
        System.out.println(verifyTitle);
        System.out.println("Title contains 'login': \t"+ verifyTitleContain);

        driver.close();


    }
}
