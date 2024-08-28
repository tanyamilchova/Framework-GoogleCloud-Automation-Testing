package com.epam.training.tanyamilchova.model;

import java.util.Objects;

public class Form {
    private String numberOfInstances;
    private String operatingSystemSoftware;
    private String provisioningModel;
    private String machineFamily;
    private String series;
    private String machineType;
    private String addGPUs;

    private String gpuType;
    private String numberOfGPUs;
    private String localSSD;
    private String region;

    public Form(String numberOfInstances, String operatingSystemSoftware, String provisioningModel, String machineFamily,
                String series, String machineType,String addGPUs, String gpuType, String numberOfGPUs, String localSSD, String region) {
        this.numberOfInstances = numberOfInstances;
        this.operatingSystemSoftware = operatingSystemSoftware;
        this.provisioningModel = provisioningModel;
        this.machineFamily = machineFamily;
        this.series = series;
        this.machineType = machineType;
        this.addGPUs=addGPUs;
        this.gpuType = gpuType;
        this.numberOfGPUs = numberOfGPUs;
        this.localSSD = localSSD;
        this.region = region;
    }

    public String getNumberOfInstances() {
        return numberOfInstances;
    }

    public String getOperatingSystemSoftware() {
        return operatingSystemSoftware;
    }

    public String getProvisioningModel() {
        return provisioningModel;
    }

    public String getMachineFamily() {
        return machineFamily;
    }

    public String getSeries() {
        return series;
    }

    public String getMachineType() {
        return machineType;
    }

    public String getAddGPUs() {
        return addGPUs;
    }

    public String getGpuType() {
        return gpuType;
    }

    public String getNumberOfGPUs() {
        return numberOfGPUs;
    }

    public String getLocalSSD() {
        return localSSD;
    }

    public String getRegion() {
        return region;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof Form form)) return false;
        return Objects.equals(numberOfInstances, form.numberOfInstances) && Objects.equals(operatingSystemSoftware, form.operatingSystemSoftware) && Objects.equals(provisioningModel, form.provisioningModel) && Objects.equals(machineFamily, form.machineFamily) && Objects.equals(series, form.series) && Objects.equals(machineType, form.machineType) && Objects.equals(gpuType, form.gpuType) && Objects.equals(numberOfGPUs, form.numberOfGPUs) && Objects.equals(localSSD, form.localSSD) && Objects.equals(region, form.region);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberOfInstances, operatingSystemSoftware, provisioningModel, machineFamily, series, machineType, gpuType, numberOfGPUs, localSSD, region);
    }

    @Override
    public String toString() {
        return "Form{" +
                "numberOfInstances='" + numberOfInstances + '\'' +
                ", operatingSystemSoftware='" + operatingSystemSoftware + '\'' +
                ", provisioningModel='" + provisioningModel + '\'' +
                ", machineFamily='" + machineFamily + '\'' +
                ", series='" + series + '\'' +
                ", machineType='" + machineType + '\'' +
                ", gpuType='" + gpuType + '\'' +
                ", numberOfGPUs='" + numberOfGPUs + '\'' +
                ", localSSD='" + localSSD + '\'' +
                ", region='" + region + '\'' +
                '}';
    }
}
