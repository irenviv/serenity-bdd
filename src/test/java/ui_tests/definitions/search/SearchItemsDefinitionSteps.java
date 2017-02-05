package ui_tests.definitions.search;

import org.jbehave.core.annotations.*;
import ui_tests.definitions.HomePageDefinitionSteps;

/**
 * Created by Iryna_Minchekova on 1/31/2017.
 */

public class SearchItemsDefinitionSteps extends HomePageDefinitionSteps {

    // step uses for parametrized tests
    @When("the user looks up the <searchValue>")
    @Alias("the user looks up the '$searchValue'")
    public void searchForItems(String searchValue){
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

    @Then("the user should see error message '$errorMassage")
    public void verifyErrorMessage(String errorMassage){
        user.search.verifyErrorMessage(errorMassage);
    }



}
