package com.trycloud.step_definitions;

import com.trycloud.pages.FilePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;

public class FilesModule_StepDefinition {

    FilePage filePage = new FilePage();



    @When("the user clicks action-icon  from any ﬁle on the page")
    public void theUserClicksActionIconFromAnyﬁleOnThePage() {

        filePage.actionIcon.click();

    }

    @And("user choose the Add to favorites option")
    public void userChooseTheOption() {
        filePage.addToFavoritesIcon.click();
    }

    @And("user click the Favorites sub-module on the left side")
    public void userClickTheSubModuleOnTheLeftSide() {
        filePage.favoritesListIcon.click();

    }

    @Then("Verify the chosen ﬁle is listed on the table")
    public void verifyTheChosenﬁleIsListedOnTheTable() {
    }
}
