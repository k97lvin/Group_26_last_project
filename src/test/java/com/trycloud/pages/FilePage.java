package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class FilePage {
    public FilePage() {
        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "(//a[@aria-label='Files'])[1]")
    public WebElement file;

    @FindBy(css = ".new")
    public WebElement addIcon;


    @FindBy(xpath = "(//a[@class='menuitem'])[1]")
    public WebElement newFolder;

    @FindBy(xpath = "//input[@id='view13-input-folder']")
    public WebElement folderNameInput;

    @FindBy(xpath = "//tr[@data-type='dir']//td[@class='filename ui-draggable ui-draggable-handle']//span[@class='innernametext']")
    public List<WebElement> webTable;
//    @FindBy(xpath = "//span[.='Something9']/span")
//    public List<WebElement> webTable;



}
