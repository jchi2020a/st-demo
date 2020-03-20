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

    public ComponentReferencePage clickDropDown() {
        new WebDriverWait(driver, 10)
            .until(ExpectedConditions.presenceOfElementLocated(dropdown))
            .click();
        return this;
    }

    public ComponentReferencePage selectOptionByText(String text){
        clickDropDown();
        By option = By.xpath("//*[contains(text(), '" + text + "')]");
        new WebDriverWait(driver, 10)
            .until(ExpectedConditions.visibilityOfElementLocated(option))
            .click();
        return this;
    }

    public ComponentReferencePage editTable(){
        new WebDriverWait(driver, 20)
            .until(ExpectedConditions.visibilityOfElementLocated(InlineTable.editIconLabel))
            .click();
        return this;
    }

    static class InlineTable{
        static By editIconLabel = By.xpath("//tr[3]/th/lightning-primitive-cell-factory/span/button/lightning-primitive-icon");
        static By editIconWebSite = By.xpath("//tr[3]/td[3]/lightning-primitive-cell-factory/span/button/lightning-primitive-icon");
        static By editIconPhone = By.xpath("//tr[3]/td[4]/lightning-primitive-cell-factory/span/button/lightning-primitive-icon");
        static By editIconClosedAt = By.xpath("//tr[3]/td[5]/lightning-primitive-cell-factory/span/button/lightning-primitive-icon");
        static By editIconBalance = By.xpath("//tr[3]/td[6]/lightning-primitive-cell-factory/span/button/lightning-primitive-icon");
    }
}