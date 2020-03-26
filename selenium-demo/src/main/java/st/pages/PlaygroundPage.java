package st.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PlaygroundPage {

    private WebDriver driver;

    public PlaygroundPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

}

