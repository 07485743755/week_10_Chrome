package chromeBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class X_Cart {


    public static void main(String[] args) {

        String baseUrl = "https://www.x-cart.com/";

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(baseUrl);

        String title = driver.getTitle();
        System.out.println("Title : " + driver.getTitle());
        System.out.println("Length of title : " + title.length());
        boolean verifyTitle = title.equals("X-Cart | The Last Ecommerce Platform You Will Ever Need");

        boolean verifyTitleContain = title.contains("Homepage");
        System.out.println(verifyTitle);
        System.out.println("Title contains 'Homepage': \t"+ verifyTitleContain);

        driver.close();


    }
}
