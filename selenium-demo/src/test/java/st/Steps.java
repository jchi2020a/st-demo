package st;

import static org.junit.Assert.assertThat;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import st.pages.BasePage;
import st.pages.ComponentReferencePage;
import st.util.BaseConfig;
import static org.hamcrest.CoreMatchers.is;

public class Steps {

    private static final String TITLE = BasePage.getTitle();
    private WebDriver driver;
    private Object currentPage;

    @Before({ "@with_browser" })
    public void setUp() {
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");
        if (System.getProperty("driver") == null) {
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
    public void tearDown() {
        driver.quit();
    }

    @Given("^the base page is accessible$")
    public void the_base_page_is_accessible() throws Throwable {
        currentPage = BasePage.load(driver);
        assertThat(driver.getTitle(), is(TITLE));
    }

    @Given("^I switch to the \"([^\"]*)\" tab$")
    public void i_switch_to_the_tab(String tabName) throws Throwable {
        currentPage = ((BasePage) currentPage).switchToTab(tabName);
    }

    @Given("^I search for \"([^\"]*)\" component$")
    public void i_search_for_component(String query) throws Throwable {
        ((ComponentReferencePage) currentPage).searchComponent(query);
    }

    @Then("^testable outcome$")
    public void testable_outcome() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}