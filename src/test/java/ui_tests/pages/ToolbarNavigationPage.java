package ui_tests.pages;


import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;


/**
 * Created by Iryna_Minchekova on 2/3/2017.
 */
public class ToolbarNavigationPage extends PageObject {

    public WebElement getCategoryInToolbar(String category){
        return $("//td[@role='listitem']/a[text()='"+category+"']");
    }

    public String getPageTitleDesciption() {
        return $("#mainTitle").getText();
    }
}
