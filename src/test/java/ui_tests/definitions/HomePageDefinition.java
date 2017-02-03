package ui_tests.definitions;

import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import ui_tests.steps.UserSteps;

/**
 * Created by Iryna_Minchekova on 2/3/2017.
 */
public class HomePageDefinition {

    @Steps
    protected UserSteps user;

    @Given("the user is on the ebay home page")
    public void givenTheUserIsOnTheHomePage(){
        user.search.openHomePage();
        user.search.verifyOnHomePage();
    }

}
