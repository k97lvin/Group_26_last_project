package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "//input[@id='user']")
    public WebElement userName;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement password;

    @FindBy(xpath = "//input[@id='submit-form']")
    public WebElement loginBtn;

    @FindBy(xpath = "//p[@class='warning wrongPasswordMsg']")
    public WebElement warningMesage;

    public void login(String arg0, String arg1) {
        Driver.getDriver().get("http://qa3.trycloud.net/index.php/login?clear=1");
        userName.sendKeys(arg0);
        password.sendKeys(arg1 + Keys.ENTER);

    }
}
