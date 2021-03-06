package st.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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

	public ComponentReferencePage switchToTab(String tabName) {
        new WebDriverWait(driver, 10)
            .until(ExpectedConditions.elementToBeClickable(
                By.xpath("//span[contains(text(), "+ "'" + tabName + "'" + ")]")))
            .click();
		return new ComponentReferencePage(driver);
	}
}