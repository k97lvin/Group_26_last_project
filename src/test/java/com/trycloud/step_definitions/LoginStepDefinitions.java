package com.trycloud.step_definitions;

import com.trycloud.pages.LoginPage;
import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDefinitions {
    LoginPage login = new LoginPage();


    @Given("user on the login page")
    public void userOnTheLoginPage() {
        String browser = ConfigurationReader.getProperty("webtableUrl");
        Driver.getDriver().get(browser);
    }

    @When("user use username {string}")
    public void userUseUsername(String arg0) {
        login.userName.sendKeys(arg0);

    }

    @Then("user should add {string}")
    public void userShouldAdd(String arg0) {
        login.password.sendKeys(arg0);
    }

    @And("user click the login button")
    public void userClickTheLoginButton() {
        login.loginBtn.click();
    }

    @Then("verify the user should be at the dashboard page")
    public void verifyTheUserShouldBeAtTheDashboardPage() {
        String actualDashboardTitle = Driver.getDriver().getTitle();
        String exceptedDashboardTitle = "Dashboard";
        Assert.assertTrue(actualDashboardTitle.contains(exceptedDashboardTitle));
    }


    @Then("verify {string} message should be displayed")
    public void verifyMessageShouldBeDisplayed(String arg0) {
        boolean warningMessage = login.warningMesage.isDisplayed();
    }
}



