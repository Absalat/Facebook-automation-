import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.print.DocFlavor;

//import java.util.List;
public class fbauto {
    public static void main(String [] args) {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver FB = new ChromeDriver();
        FB.get("https://www.facebook.com");

        WebElement user = FB.findElement(By.id("email"));
        user.sendKeys("absisd1123@gmail.com");

        WebElement pass = FB.findElement(By.id("pass"));
        pass.sendKeys("akkd2015absis");

        WebElement login = FB.findElement(By.id("loginbutton"));

        WebElement btn = login.findElement(By.tagName("input"));

        btn.click();

        WebElement notif = FB.findElement(By.id("notificationsCountValue"));
        String html = notif.getAttribute("innerHTML");

        System.out.println("Number of notifications is: " + html);
    }
}
