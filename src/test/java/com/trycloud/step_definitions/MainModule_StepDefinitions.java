package com.trycloud.step_definitions;

import com.trycloud.pages.MainModules;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainModule_StepDefinitions {


    @Then("Verify the user see the following :")
    public void verifyTheUserSeeTheFollowing(List<String> expectedModules) {
        MainModules mainModule = new MainModules();

        String dashboardAttribute = mainModule.dashboard.getAttribute("aria-label");
        String filesAttribute = mainModule.files.getAttribute("aria-label");
        String photosAttribute = mainModule.photos.getAttribute("aria-label");
        String activityAttribute = mainModule.activity.getAttribute("aria-label");
        String talkAttribute = mainModule.talk.getAttribute("aria-label");
        String mailAttribute = mainModule.mail.getAttribute("aria-label");
        String contactsAttribute = mainModule.contacts.getAttribute("aria-label");
        String circlesAttribute = mainModule.circles.getAttribute("aria-label");
        String calendarAttribute = mainModule.calendar.getAttribute("aria-label");
        String deckAttribute = mainModule.deck.getAttribute("aria-label");

        List<String> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(dashboardAttribute, filesAttribute, photosAttribute, activityAttribute, talkAttribute, mailAttribute,
                contactsAttribute, circlesAttribute, calendarAttribute, deckAttribute));
        Assert.assertEquals(expectedModules, list1);
    }
}
