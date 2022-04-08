package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainModules {
    public MainModules() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@aria-label='Dashboard']")
    public WebElement dashboard;
    @FindBy(xpath = "//a[@aria-label='Files']")
    public WebElement files;
    @FindBy(xpath = "//a[@aria-label='Photos']")
    public WebElement photos;
    @FindBy(xpath = "//a[@aria-label='Activity']")
    public WebElement activity;
    @FindBy(xpath = "//a[@aria-label='Talk']")
    public WebElement talk;
    @FindBy(xpath = "//a[@aria-label='Mail']")
    public WebElement mail;
    @FindBy(xpath = "//a[@aria-label='Contacts']")
    public WebElement contacts;
    @FindBy(xpath = "//a[@aria-label='Circles']")
    public WebElement circles;
    @FindBy(xpath = "//a[@aria-label='Calendar']")
    public WebElement calendar;
    @FindBy(xpath = "//a[@aria-label='Deck']")
    public WebElement deck;
//_______________________________________________________

    @FindBy(xpath = "//div[@class='icon-contacts menutoggle']")
    public WebElement contactsMenuIcon;

    @FindBy(xpath = "//div[@class='full-name']")
    public List<WebElement> contacsList;


    public void listOfModule() {
        List<WebElement> list = new ArrayList<>();
        list.addAll(Arrays.asList(dashboard, files, activity, photos, activity,
                talk, mail, contacts, circles, calendar, deck));
    }
}
