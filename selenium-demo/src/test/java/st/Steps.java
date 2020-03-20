package st;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {

    private WebDriver driver;

    @Before({ "@with_browser" })
    public void setUp() {
        switch (System.getProperty("driver").toLowerCase()) {
            case "firefox":
                System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");
                driver = new FirefoxDriver();
            break;
            default:
                System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");
                driver = new FirefoxDriver();
            break;
        }
    }

    @After
    public void tearDown(){
        driver.quit();
    }

    @Given("^precondition$")
    public void precondition() throws Throwable {
        driver.get("https://google.com/ncr");
    }

    @When("^action$")
    public void action() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^testable outcome$")
    public void testable_outcome() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}