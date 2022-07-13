package StepDefinitionRedBus;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class dynamicTable {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/table.html");
        Thread.sleep(5000);

//        List<WebElement> table = driver.findElements(By.xpath("//html/body/table/tbody //tr/td"));
//        for(WebElement tp:table)
//        {
//            int k=0;
//            while(k<3){
//            System.out.print(tp.getText()+" ");
//            k++;
//            }
//            System.out.println("");
//        }
        Thread.sleep(2000);

        List<WebElement> row = driver.findElements(By.tagName("tr"));
        for(int k=0;k< row.size();k++){
            //System.out.println(row.get(k).getText());
            List<WebElement> col =row.get(k).findElements(By.tagName("td"));
            for(int g=0;g<col.size();g++)
            {
                System.out.println(col.get(g).getText());
            }
        }

        driver.quit();
    }



    //-----------------
//    public static void main(String[] args) throws Exception {
//
//        System.setProperty("webdriver.chrome.driver","G://chromedriver.exe");
//        WebDriverManager.chromedriver().setup();
//        WebDriver wd = new ChromeDriver();
//        wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//        wd.get("http://demo.guru99.com/test/table.html");
//        //To locate table.
//        WebElement mytable = wd.findElement(By.xpath("/html/body/table/tbody"));
//        //To locate rows of table.
//        List < WebElement > rows_table = mytable.findElements(By.tagName("tr"));
//        //To calculate no of rows In table.
//        int rows_count = rows_table.size();
//        //Loop will execute till the last row of table.
//        for (int row = 0; row < rows_count; row++) {
//            //To locate columns(cells) of that specific row.
//            List < WebElement > Columns_row = rows_table.get(row).findElements(By.tagName("td"));
//            //To calculate no of columns (cells). In that specific row.
//            int columns_count = Columns_row.size();
//            System.out.println("Number of cells In Row " + row + " are " + columns_count);
//            //Loop will execute till the last cell of that specific row.
//            for (int column = 0; column < columns_count; column++) {
//                // To retrieve text from that specific cell.
//                String celtext = Columns_row.get(column).getText();
//                System.out.println("Cell Value of row number " + row + " and column number " + column + " Is " + celtext);
//            }
//            System.out.println("-------------------------------------------------- ");
//        }
//    }
}
