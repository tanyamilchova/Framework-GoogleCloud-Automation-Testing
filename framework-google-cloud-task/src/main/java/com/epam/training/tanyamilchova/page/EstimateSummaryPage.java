package com.epam.training.tanyamilchova.page;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class EstimateSummaryPage extends ComputeEnginePage{

    public EstimateSummaryPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }

    public String numberInstValue(){
        return instancesInput.getAttribute("value");
    }
    public String osValue(){
        return osDropdown.getText();
    }
    public String modelValue(){
        return regularOption.getText();
    }
    public String machineFamilyValue(){
        return machineFamilyDropdown.getText();
    }
    public String seriesValue(){
        return seriesDropdown.getText();
    }
    public String addGPUValue(){
        return addGPUsCheckbox.getAttribute("aria-checked");
    }
    public String gpuTypeValue(){
        return getElementByAncestor(gpuModelSpanBy).getText();
    }
    public String numGpuValue(){
        return getElementByAncestor(gpuNumberSpanBy).getText();
    }
    public String machTypeValue(){
        return machineTypeDropdown.getText();
    }
    public String lockalSSDValue(){
        return localSSDDropdown.getText();
    }
    public String regionValue(){
        return reglandsDwopdown.getAttribute("data-value");
    }
}
