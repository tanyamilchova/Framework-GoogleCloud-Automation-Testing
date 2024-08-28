package com.epam.training.tanyamilchova.page;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public abstract class AbstractPage {
    protected WebDriver driver;
    protected WebDriverWait wait;
    protected final int WAIT_TIMEOUT_SECONDS = 15;
    protected final int POLLING_TIMEOUT_SECONDS = 5;

    public AbstractPage(WebDriver driver){
        this.driver = driver;
        this.wait=new WebDriverWait(driver,Duration.ofSeconds(WAIT_TIMEOUT_SECONDS));
    }
    protected FluentWait<WebDriver> getFluentWait() {
        return new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(WAIT_TIMEOUT_SECONDS))
                .pollingEvery(Duration.ofMillis(POLLING_TIMEOUT_SECONDS))
                .ignoring(NoSuchElementException.class)
                .ignoring(ElementNotInteractableException.class);
    }

    protected WebElement waitForElement(WebElement element) {
        FluentWait<WebDriver> wait = getFluentWait();
        WebElement el = wait.until(driver -> {
            try {
                if (element.isDisplayed() && element.isEnabled()) {
                    JavascriptExecutor js = (JavascriptExecutor) driver;
                    js.executeScript("arguments[0].scrollIntoView(true);", element);
                    return element;
                }
            } catch (NoSuchElementException | ElementNotInteractableException e) {
                e.printStackTrace();
            }
            return null;
        });
        if (el != null) {
            try {
                wait.until(ExpectedConditions.elementToBeClickable(el));
            } catch (TimeoutException e) {
                e.getMessage();
            }
        }
        return el;
    }
}
