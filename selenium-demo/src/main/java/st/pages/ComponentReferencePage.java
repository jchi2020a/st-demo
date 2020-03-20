package st.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ComponentReferencePage{
    private WebDriver driver;
    
    @FindBy(css = "input[type='search']")
    WebElement serchField;
    
    public ComponentReferencePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public ComponentReferencePage searchComponent(String query){
        serchField.clear();
        serchField.sendKeys(query);
        return this;
    }
}