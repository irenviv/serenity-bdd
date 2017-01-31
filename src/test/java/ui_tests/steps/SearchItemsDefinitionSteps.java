package ui_tests.steps;

import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import ui_tests.common.Categories;
import ui_tests.steps.serenity.UserSteps;

/**
 * Created by Iryna_Minchekova on 1/31/2017.
 */

public class SearchItemsDefinitionSteps {

    @Steps
    public UserSteps user;

    @Given("the user is on the ebay home page")
    public void givenTheUserIsOnTheHomePage(){
        user.search.isOnTheHomePage();
    }

    @When("the user looks up the '$item'")
    public void whenUserSearchForItem(String item){
        user.search.enterValue(item);
    }

    @When("select \"All categories\"")
    public void whenUserSelectAllCategories(){
        user.search.selectItemInCategoriesDropDown(Categories.ALL_CATEGORIES.getValue());
        user.search.clickSeachButton();
    }

    @Then("the user should see the list of products that include '$item' in the name and are available to buy")
    public void thenSearcheditemsAreDisplayed(String item){
        user.search.verifySearchedValues(item);
    }

}
