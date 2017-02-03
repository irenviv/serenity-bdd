package ui_tests.steps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import ui_tests.pages.ToolbarNavigationPage;

/**
 * Created by Iryna_Minchekova on 2/3/2017.
 */
public class ToolbarNavigationSteps {

    private ToolbarNavigationPage onToolbarPage;

    @Step
    public void clickOnCategory(String category){
        onToolbarPage.getCategoryInToolbar(category).click();
    }

    @Step
    public void verifyCategoryTitleOnPage(String category){
        Assert.assertEquals(category, onToolbarPage.getPageTitleDesciption());
    }
}
