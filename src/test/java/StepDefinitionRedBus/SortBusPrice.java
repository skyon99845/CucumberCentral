package StepDefinitionRedBus;

import PageFactoryModel.RedBus;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SortBusPrice {
    public static WebDriver driver;
    public static RedBus objRedBus;
    @Given("User Enters the Destination and To and Date")
    public void user_enters_the_destination_and_to_and_date() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        objRedBus = new RedBus(driver);
        objRedBus.visitWebsite();
        driver.manage().window().maximize();
        Thread.sleep(2000);

        objRedBus.EnterTheDestination();
        Thread.sleep(3000);

        objRedBus.EnterTheTo();
        Thread.sleep(4000);
        objRedBus.SelectTravelDate();
        Thread.sleep(3000);
    }

    @When("User clicks on search Button and clicks on Sort Button")
    public void user_clicks_on_search_button_and_clicks_on_sort_button() throws InterruptedException {
        objRedBus.searchButtonClick();
        Thread.sleep(6000);
        objRedBus.sortByFare();
        Thread.sleep(5000);
    }

    @Then("Bus Ticket in Sorted Order is Displayed")
    public void bus_ticket_in_sorted_order_is_displayed() {
        //System.out.println("Quitting the Function");

        objRedBus.closeBrowser();
    }




}
