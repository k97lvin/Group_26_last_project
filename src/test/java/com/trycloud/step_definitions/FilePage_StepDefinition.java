package com.trycloud.step_definitions;

import com.trycloud.pages.FilePage;
import com.trycloud.pages.LoginPage;
import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

public class FilePage_StepDefinition {

    FilePage filePage = new FilePage();
    LoginPage loginPage = new LoginPage();

    @Given("user on the dashboard page")
    public void user_on_the_dashboard_page() {
        String browser = ConfigurationReader.getProperty("webtableUrl");
        Driver.getDriver().get(browser);
        loginPage.login("User26", "Userpass123");
    }

    @When("the user clicks the Files module")
    public void theUserClicksTheFilesModule() {
        filePage.file.click();
    }

    @And("user clicks the add icon on the top")
    public void userClicksTheAddIconOnTheTop() {
        filePage.addIcon.click();
    }

    @And("user click \"new folder”")
    public void userClickNewFolder() {
        filePage.newFolder.click();
    }

    @And("user write a folder name")
    public void userWriteAFolderName() {
        filePage.folderNameInput.sendKeys("Something9" + Keys.ENTER);
    }


    @Then("Verify the folder is displayed on the page")
    public void verifyTheFolderIsDisplayedOnThePage() {
        String excepted = "Something9";
        String actual = "";
        List<String> list = new ArrayList<>();

        for (WebElement each : filePage.webTable) {
            //     WebDriverWait wait  =new WebDriverWait()

            list.add(each.getText());

            actual = each.getText();

        }
        boolean result = list.contains(excepted);

        Assert.assertTrue(result);

    }
}