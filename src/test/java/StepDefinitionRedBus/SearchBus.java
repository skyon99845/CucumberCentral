package StepDefinitionRedBus;

import PageFactoryModel.RedBus;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.eo.Se;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;





@Test
public class SearchBus {
    public static WebDriver driver;
    public static RedBus objRedBus;

    //driver = new void ChromeDriver();
    @Given("User Enters the Destination and To and Date and Search")
    public void user_enters_the_destination_and_to_and_date_and_search() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        objRedBus = new RedBus(driver);
        objRedBus.visitWebsite();
        driver.manage().window().maximize();
        Thread.sleep(2000);

        objRedBus.EnterTheDestination();
        Thread.sleep(4000);

        objRedBus.EnterTheTo();
        Thread.sleep(4000);
        objRedBus.SelectTravelDate();
        Thread.sleep(3000);

        objRedBus.searchButtonClick();
        Thread.sleep(3000);

        objRedBus.displayTheBusTicket();
        Thread.sleep(3000);

        //--------------------Quitting the Browser
        objRedBus.closeBrowser();

    }

    @When("User Select the Sort by Price")
    public void user_select_the_sort_by_price() {
        System.out.println("");
    }

    @Then("User Selects the Price Ticket Between {int} to {int}")
    public void user_selects_the_price_ticket_between_to(Integer int1, Integer int2) {

        System.out.println("Taking the screenShot");

    }

    @AfterStep()
    public void afterSite(Scenario scenario) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        TakesScreenshot ts = (TakesScreenshot) driver;
        byte[] screenshot = ts.getScreenshotAs(OutputType.BYTES);
        scenario.log("this is my failure message……….");
        scenario.attach(screenshot, "image/png", "");
        driver.quit();
    }

}




