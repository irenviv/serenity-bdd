package ui_tests.steps.search;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import ui_tests.pages.SearchPage;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasItem;

/**
 * Created by Iryna_Minchekova on 1/31/2017.
 */
public class SearchSteps {

     SearchPage onSearchPage;

    @Step
    public void openHomePage() {
        onSearchPage.open();
    }

    @Step
    public void verifyOnHomePage(){
        Assert.assertTrue("User is not on home page, but should",onSearchPage.searchField.isDisplayed());
    }

    @Step
    public void enterValue(String value){
        onSearchPage.typeInto(onSearchPage.searchField, value);
    }

    @Step
    public void clickSeachButton(){
        onSearchPage.searchButton.click();
    }

    @Step
    public void selectItemInCategoriesDropDown(String item){
        onSearchPage.selectFromDropdown(onSearchPage.selectCategoryDropDown, item);
    }

    @Step
    public void verifySearchedValues(String value){
        List<String> actualTitles = onSearchPage.getTitlesOfSearchedValues();
        assertThat(actualTitles, hasItem(containsString(value)));
    }

    @Step
    public void verifyErrorMessage(String errorMessage){
        Assert.assertEquals(errorMessage, onSearchPage.getErrorMessage());
    }
}
