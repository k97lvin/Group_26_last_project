package com.trycloud.step_definitions;

import com.trycloud.pages.MainModules;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class ContactMenu_StepDefinitions {
    MainModules mainModules = new MainModules();

    @When("the user clicks the contacts module")
    public void the_user_clicks_the_contacts_module() {
        mainModules.contactsMenuIcon.click();
    }

    @Then("verify the contact names are in the list")
    public void verify_the_contact_names_are_in_the_list() {
        for (WebElement eachWebElement : mainModules.contacsList) {
            boolean displayed = eachWebElement.isDisplayed();
            Assert.assertTrue(displayed);
            //  Assert.assertTrue(eachWebElement.isDisplayed());
        }
    }
}
