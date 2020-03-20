package st.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import st.util.BaseConfig;

public class BasePage{

    private WebDriver driver;
    private static final BaseConfig CONFIG = BaseConfig.getConfig();
    private static final String TITLE = "Introducing Lightning Web Components - Salesforce Lightning Component Library";

    public BasePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    /**
     * @return the title
     */
    public static String getTitle() {
        return TITLE;
    }

    public static BasePage load(WebDriver driver){
        driver.get(CONFIG.getBaseUrl());
        return new BasePage(driver);
    }
}