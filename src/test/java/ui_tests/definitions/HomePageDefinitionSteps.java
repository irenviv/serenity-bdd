package ui_tests.definitions;

import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.BeforeStories;
import org.jbehave.core.annotations.Given;
import ui_tests.steps.UserSteps;

/**
 * Created by Iryna_Minchekova on 2/3/2017.
 */
public class HomePageDefinitionSteps {

    @Steps
    protected UserSteps user;

    @BeforeStories
    public void beforeStories() {
        System.out.println("Before stories runner");

    }

    @Given("the user is on the ebay home page")
    public void givenTheUserIsOnTheHomePage(){
        user.search.openHomePage();
        user.search.verifyOnHomePage();
    }

}
