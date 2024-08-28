package test;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BasePageTest extends CommonConditions{
    @Test
    public void testPage(){

        basePage.clickAddToEstimateButton();
        basePage.selectComputeEngine();
        String expectedUrl = "https://cloud.google.com/products/calculator?hl=en";
        String currentUrl = driver.getCurrentUrl();

       assertEquals("The URL is not as expected!", expectedUrl, currentUrl);

    }
}
