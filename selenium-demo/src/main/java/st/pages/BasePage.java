package st.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import st.util.BaseConfig;

public class BasePage{

    private WebDriver driver;
    private static final BaseConfig CONFIG = BaseConfig.getConfig();

    public BasePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}