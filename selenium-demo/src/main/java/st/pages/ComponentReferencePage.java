package st.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ComponentReferencePage{
    private WebDriver driver;
    
    @FindBy(css = "input[type='search']")
    WebElement serchField;

    By dropdown = By.cssSelector("input[placeholder='Choose Example']");

    By firstLinkUnderComponentsXpath = By.xpath("(//div[@class='slds-tree_container'])[1]/componentreference-tree-item/componentreference-tree-item/div[2]");
    
    public ComponentReferencePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public ComponentReferencePage searchComponent(String query){
        serchField.clear();
        serchField.sendKeys(query);
        return this;
    }

    public ComponentReferencePage clickFirstLinkUnderComponents(){
        new WebDriverWait(driver, 10)
            .until(ExpectedConditions.presenceOfElementLocated(firstLinkUnderComponentsXpath))
            .click();
        return this;
    }

    public ComponentReferencePage clickDropDown(){
        new WebDriverWait(driver, 10)
            .until(ExpectedConditions.presenceOfElementLocated(dropdown))
            .click();
        return this;
    }
}