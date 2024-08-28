package test;

import io.github.bonigarcia.wdm.WebDriverManager;
import com.epam.training.tanyamilchova.driver.DriverSingleton;
import com.epam.training.tanyamilchova.page.BasePage;
import com.epam.training.tanyamilchova.page.ComputeEnginePage;
import org.junit.Before;
import org.junit.After;
import org.openqa.selenium.WebDriver;

public class CommonConditions {
    protected WebDriver driver;
    protected WebDriverManager manager;
    protected BasePage basePage;
    protected ComputeEnginePage computeEnginePage;

    private static final String RESAURCES_PATH="src/main/resources/";

    @Before
    public void setup() {
        driver=   DriverSingleton.getDriver();
        basePage=new BasePage(driver);
        computeEnginePage=new ComputeEnginePage(driver);
        driver.get("https://cloud.google.com/products/calculator?hl=en");
    }
    @After
    public void teardown() {
        DriverSingleton.closeDriver();
    }
}
