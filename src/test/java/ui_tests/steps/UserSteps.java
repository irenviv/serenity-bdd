package ui_tests.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import ui_tests.steps.search.SearchSteps;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class UserSteps {

    @Steps
    public SearchSteps search;

    @Steps
    public ToolbarNavigationSteps toolbar;



    @Step
    public void setUpBrowser(){
        getDriver().manage().deleteAllCookies();
        getDriver().manage().window().maximize();
    }

    @Step
    public void closeBrowser(){
        getDriver().close();
    }


}