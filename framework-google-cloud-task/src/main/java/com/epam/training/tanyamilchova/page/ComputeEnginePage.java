package com.epam.training.tanyamilchova.page;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ComputeEnginePage extends AbstractPage{
    private  String instances="4";
    @FindBy(xpath = "//input[@value='1']")
    protected WebElement instancesInput;

    @FindBy(xpath = "//div[@role='combobox' and .//span[@class='VfPpkd-NSFCdd-Ra9xwd' and .//span[text()='Operating System / Software']]]")
    protected WebElement osDropdown;

    @FindBy(css = "label.zT2df[for='107regular']")

    protected WebElement regularOption;

    @FindBy(xpath = "//div[@role='combobox' and .//span[@class='VfPpkd-NSFCdd-Ra9xwd' and .//span[text()='Machine Family']]]")
    protected WebElement machineFamilyDropdown;

    @FindBy(xpath = "//div[@role='combobox' and .//span[@class='VfPpkd-NSFCdd-Ra9xwd' and .//span[text()='Series']]]")
    protected WebElement seriesDropdown;

    @FindBy(xpath = "//div[@role='combobox' and .//span[@class='VfPpkd-NSFCdd-Ra9xwd' and .//span[text()='Machine type']]]")
    protected WebElement machineTypeDropdown;

    @FindBy(css = "button[aria-label='Add GPUs']")
    protected WebElement addGPUsCheckbox;

    By gpuModelSpanBy=By.xpath("//span[contains(text(), 'GPU Model')]");
    By gpuNumberSpanBy=By.xpath("//span[contains(text(), 'Number of GPUs')]");

    @FindBy(xpath = "//div[@data-field-type = '180']")
    protected WebElement localSSDDropdown;

    @FindBy(xpath = "//div[@role='combobox' and contains(@class, 'VfPpkd-TkwUic') and .//span[@jsname='V67aGc' and text()='Region']]")
    protected WebElement regionLocationDropdown;

    @FindBy(xpath = "//button[span[text()='Share']]")
    protected WebElement shareButton;

    @FindBy(xpath = "//li[@data-value='free-debian-centos-coreos-ubuntu-or-byol-bring-your-own-license']")
    protected WebElement osDropdownOption;

    @FindBy(xpath = "//li[@data-value='general-purpose']")
    protected WebElement generalPurposeOption;

    @FindBy(xpath = "//li[@data-value='n1']")
    protected WebElement n1SeriesOption;

    @FindBy(xpath = "//li[@data-value='n1-standard-8']")
    protected WebElement n1Standard8Option;


    @FindBy(xpath = "//li[@data-value='nvidia-tesla-v100' and .//span[contains(text(), 'NVIDIA V100')]]")
    protected WebElement nvidiaOption;
    @FindBy(xpath = "//li[@data-value='1' and .//span[contains(text(), '1')]]")
    protected WebElement numGPUsOption;

    @FindBy(xpath = "//li[@data-value='2' and .//span[contains(text(), '2x375 GB')]]")
    protected WebElement ssd2x375Option;

    @FindBy(xpath = "//li[@data-value='europe-west4']")
    protected WebElement reglandsDwopdown;

    @FindBy(xpath = "//a[@track-name='open estimate summary']")
    protected WebElement openEstimateSummary;


    public ComputeEnginePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }


    public void closeCookies(){
        try {
            WebElement cookieNotification = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("glue-cookie-notification-bar-1")));
            WebElement closeButton = cookieNotification.findElement(By.cssSelector("button"));
            closeButton.click();
            wait.until(ExpectedConditions.invisibilityOf(cookieNotification));
            System.out.println("Cookie notification closed.");
        } catch (Exception e) {
            System.out.println("Cookie notification not found or could not be closed.");
        }
    }
    public void addGPUButton(WebElement addGpuButton){
        String ariaChecked = addGpuButton.getAttribute("aria-checked");
        if ("false".equals(ariaChecked)) {
            addGpuButton.click();
            System.out.println("Button pressed.");
        } else if ("true".equals(ariaChecked)) {
            addGpuButton.click();
            System.out.println("Button unpressed.");
        }
    }

    public void fillComputeEngineForm() {
        waitForElement(instancesInput).clear();
        instancesInput.sendKeys(instances);
        closeCookies();
        osDropdown.click();
        osDropdownOption.click();

        regularOption.click();

        machineFamilyDropdown.click();
        generalPurposeOption.click();

        seriesDropdown.click();
        n1SeriesOption.click();

        machineTypeDropdown.click();
        n1Standard8Option.click();

        addGPUButton(addGPUsCheckbox);

        WebElement gpuModel=getElementByAncestor(gpuModelSpanBy);
        gpuModel.click();
        nvidiaOption.click();

        WebElement gpuNumber=getElementByAncestor(gpuNumberSpanBy);
        gpuNumber.click();
        numGPUsOption.click();

        localSSDDropdown.click();
        ssd2x375Option.click();

        regionLocationDropdown.click();
        reglandsDwopdown.click();
    }
    public WebElement getElementByAncestor(By span){
        WebElement spanElement = wait.until(ExpectedConditions.visibilityOfElementLocated(span));
        WebElement combobox = spanElement.findElement(By.xpath("./ancestor::div[@role='combobox']"));

        return combobox;
    }
    public void clickShare() {
        try {
            WebElement button = wait.until(ExpectedConditions.elementToBeClickable(shareButton));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", button);
            try {
                button.click();
            } catch (ElementClickInterceptedException e) {
                WebElement obstructingElement = driver.findElement(By.id("kO001e"));
                ((JavascriptExecutor) driver).executeScript("arguments[0].style.display='none';", obstructingElement);
                button.click();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void clickOpenEstimateSummary() {
        openEstimateSummary.click();
    }
}
