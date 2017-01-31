package ui_tests.pages;

import ch.lambdaj.function.convert.Converter;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebElement;
import java.util.List;
import static ch.lambdaj.Lambda.extract;
import static ch.lambdaj.Lambda.on;

/**
 * Created by Iryna_Minchekova on 1/31/2017.
 */

@DefaultUrl("http://www.ebay.com/")
public class SearchPage extends PageObject {

    @FindBy(id = "gh-ac")
    public WebElement searchField;

    @FindBy(id = "gh-cat")
    public WebElement selectCategoryDropDown;

    @FindBy(id = "gh-btn")
    public WebElement searchButton;

    public List<String> getTitlesOfSearchedValues() {
        List<WebElementFacade> titles = findAll("//h3[@class='lvtitle']/a");
        return extract(titles, on(WebElement.class).getText());
    }
}
