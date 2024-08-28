package test;

import com.epam.training.tanyamilchova.model.Form;
import com.epam.training.tanyamilchova.page.EstimateSummaryPage;
import com.epam.training.tanyamilchova.service.FormCreator;
import org.junit.Test;
import static org.testng.AssertJUnit.assertEquals;

public class EstimatePageTest extends CommonConditions{
    private Form form;
    private EstimateSummaryPage estimateSummaryPage;
    @Test
    public void testPage(){
        Form testForm= FormCreator.withCredentialFromProperty();
        basePage.clickAddToEstimateButton();
        basePage.selectComputeEngine();


        computeEnginePage.fillComputeEngineForm();
        computeEnginePage.clickShare();
        computeEnginePage.clickOpenEstimateSummary();

        estimateSummaryPage=new EstimateSummaryPage(driver);

        driver.navigate().back();

        assertEquals(testForm.getNumberOfInstances(), estimateSummaryPage.numberInstValue());
        assertEquals(testForm.getOperatingSystemSoftware(),estimateSummaryPage.osValue());
        assertEquals(testForm.getProvisioningModel(),estimateSummaryPage.modelValue());
        assertEquals(testForm.getMachineFamily(),estimateSummaryPage.machineFamilyValue());
        assertEquals(testForm.getSeries(),estimateSummaryPage.seriesValue());
        assertEquals(testForm.getMachineType(),estimateSummaryPage.machTypeValue());
        assertEquals(testForm.getAddGPUs(),estimateSummaryPage.addGPUValue());
        assertEquals(testForm.getGpuType(),estimateSummaryPage.gpuTypeValue());
        assertEquals(testForm.getNumberOfGPUs(),estimateSummaryPage.numGpuValue());
        assertEquals(testForm.getLocalSSD(),estimateSummaryPage.lockalSSDValue());
        assertEquals(testForm.getRegion(),estimateSummaryPage.regionValue());
    }
}
