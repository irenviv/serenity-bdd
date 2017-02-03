package ui_tests.definitions.search;

import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import ui_tests.definitions.HomePageDefinition;

/**
 * Created by Iryna_Minchekova on 1/31/2017.
 */

public class SearchItemsDefinitionSteps extends HomePageDefinition {

    // step uses for parametrized tests
    @When("the user looks up the <searchValue>")
    public void searchForItems(@Named("searchValue")String searchValue){
        user.search.enterValue(searchValue);
    }

    @When("select <category>")
    public void whenUserSelectAllCategories(@Named("category") String category){
        user.search.selectItemInCategoriesDropDown(category);
    }

    @When("click search button")
    public void clickSearchButton(){
        user.search.clickSeachButton();
    }

    @Then("the user should see the list of products that include <searchValue> in the product title")
    public void thenSearcheditemsAreDisplayed(String searchValue){
        user.search.verifySearchedValues(searchValue);
    }

    //step uses fot single search
    @When("the user search for item '$item'")
    public void searchForItem(String item){
        user.search.enterValue(item);
    }

    @Then("the user should see error message '$errorMassage")
    public void verifyErrorMessage(String errorMassage){
        user.search.verifyErrorMessage(errorMassage);
    }



}
