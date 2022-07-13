package StepDefinitionRedBus;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;

public class HandleTab {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.makemytrip.com/");
        //assertStartAdvertising();

        // considering that there is only one tab opened in that point.
        String oldTab = driver.getWindowHandle();
        driver.findElement(By.linkText("Homestays")).click();
        ArrayList<String> newTab = new ArrayList<String>(driver.getWindowHandles());
        newTab.remove(oldTab);
        // change focus to new tab
        driver.switchTo().window(newTab.get(0));
        //assertAdvertisingBlog();

        // Do what you want here, you are in the new tab

        driver.close();
        // change focus back to old tab
        driver.switchTo().window(oldTab);
    }
}
