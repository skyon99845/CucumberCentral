package StepDefinitionRedBus;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;



public class staticTable {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/web-table-element.php");
        Thread.sleep(5000);
        int One=1;
        int Two=1;
        int Three=1;
        int Four=1;
        //String colHeading="//table[@class=\"dataTable\"] //thead/tr/th["+One+"]"; // replace one with the index which you want to cover
        WebElement Company= driver.findElement(By.xpath("//table[@class=\"dataTable\"] //thead/tr/th[1]"));
        WebElement Group=driver.findElement(By.xpath("//table[@class=\"dataTable\"] //thead/tr/th[2]"));
        WebElement Prev=driver.findElement(By.xpath("//table[@class=\"dataTable\"] //thead/tr/th[3]"));
        WebElement Current=driver.findElement(By.xpath("//table[@class=\"dataTable\"] //thead/tr/th[4]"));
        WebElement Change=driver.findElement(By.xpath("//table[@class=\"dataTable\"] //thead/tr/th[5]"));
        String parent ="//table[@class=\"dataTable\"]";
        String colchild1="//tbody/tr/td[1]";
        String colchild2="//tbody/tr/td[2]";
        String colchild3="//tbody/tr/td[3]";
        String colchild4="//tbody/tr/td[4]";
        String colchild5="//tbody/tr/td[5]";
        List<WebElement>colOne= driver.findElements(By.xpath(parent+" "+colchild1));
        List<WebElement>colTwo= driver.findElements(By.xpath(parent+" "+colchild2));
        List<WebElement>colThree= driver.findElements(By.xpath(parent+" "+colchild3));
        List<WebElement>colFour= driver.findElements(By.xpath(parent+" "+colchild4));
        List<WebElement>colFive= driver.findElements(By.xpath(parent+" "+colchild5));
        //System.out.println(colOne.size());
        System.out.println(Company.getText()+"  "+Group.getText()+"  "+Prev.getText()+"  "+Current.getText()+"  "+Change.getText());
//        for(int i=0;i< colOne.size();i++){
//            System.out.println(colOne.get(i).getText());
//        }
        for(int i=0;i< colOne.size();i++)
        {
            System.out.println(colOne.get(i).getText()+"   "+colTwo.get(i).getText()+"   "+colThree.get(i).getText()+"   "+colFour.get(i).getText()+"   "+colFive.get(i).getText());
        }
        Thread.sleep(5000);




        driver.quit();
    }
}
