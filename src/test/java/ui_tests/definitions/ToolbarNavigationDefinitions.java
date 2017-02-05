package ui_tests.definitions;

import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

/**
 * Created by Iryna_Minchekova on 2/3/2017.
 */
public class ToolbarNavigationDefinitions extends HomePageDefinitionSteps {

    @When("user navigate to <category> category")
    public void clickOnCategoryInToolbar(@Named("category")String category){
        user.toolbar.clickOnCategory(category);
    }

    @Then("user is redirected to <category> page")
    public void verifyOnCategoryPage(@Named("category")String category){
        user.toolbar.verifyCategoryTitleOnPage(category);
    }
}
