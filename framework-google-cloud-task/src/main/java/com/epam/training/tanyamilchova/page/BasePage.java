package com.epam.training.tanyamilchova.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage extends AbstractPage{
    protected WebDriverWait wait;

    @FindBy(xpath = "//span[text()='Add to estimate']")
    protected WebElement addToEstimateButton;

    @FindBy(xpath = "//div[@tabindex='0'][@class='d5NbRd-EScbFb-JIbuQc PtwYlf'][@data-idx='0'][@role='button']")
    protected WebElement computeEngineOption;


    public BasePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver,this);
        wait=new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    public void clickAddToEstimateButton() {
        WebElement addToEstimate=wait.until(ExpectedConditions.elementToBeClickable(addToEstimateButton));
        addToEstimate.click();

    }
    public void selectComputeEngine() {
        WebElement computeEng=wait.until(ExpectedConditions.elementToBeClickable(computeEngineOption));
        computeEng.click();
    }
}
