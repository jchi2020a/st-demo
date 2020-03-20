package st;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import st.util.BaseConfig;

public class Steps {

    private WebDriver driver;

    @Before({ "@with_browser" })
    public void setUp() {
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");
        if(System.getProperty("driver") == null) {
            driver = new FirefoxDriver();
        } else {
            switch (System.getProperty("driver").toLowerCase()) {
                case "firefox":
                    driver = new FirefoxDriver();
                break;
                default:
                    driver = new FirefoxDriver();
                break;
            }
        }
    }

    @After
    public void tearDown(){
        driver.quit();
    }

    @Given("^precondition$")
    public void precondition() throws Throwable {
        driver.get("https://google.com/ncr");
        String test = BaseConfig.getConfig().getBaseUrl();
        System.out.println("value: " + test);
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