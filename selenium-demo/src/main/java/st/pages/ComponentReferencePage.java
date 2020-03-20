package st.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ComponentReferencePage{
    private WebDriver driver; 
    
    public ComponentReferencePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}