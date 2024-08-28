package com.epam.training.tanyamilchova.service;

import com.epam.training.tanyamilchova.model.Form;

public class FormCreator {

    public static final String FORM_NUM_INSTANCES="testdata.form.numberOfInstances";
    public static final String FORM_OPERATING_SYSTEM="testdata.form.operatingSystemSoftware";
    public static final String FORM_PROVISIONING_MODEL="testdata.form.provisioningModel";
    public static final String FORM_MACHINE_FAMILY="testdata.form.machineFamily";
    public static final String FORM_SERIES="testdata.form.series";
    public static final String FORM_MACHINE_TYPE="testdata.form.machineType";
    public static final String FORM_ADD_GPUS="testdata.form.addGPUs";
    public static final String FORM_GPU_TYPE="testdata.form.gpuType";
    public static final String FORM_NUM_GPUs="testdata.form.numberOfGPUs";
    public static final String FORM_LOCAL_SSD="testdata.form.localSSD";
    public static final String FORM_REGION="testdata.form.region";


    public static Form withCredentialFromProperty(){
        String numInstances = TestDataReader.getTestData(FORM_NUM_INSTANCES);
        String osSoftware = TestDataReader.getTestData(FORM_OPERATING_SYSTEM);
        String provisioningModel = TestDataReader.getTestData(FORM_PROVISIONING_MODEL);
        String machineFamily = TestDataReader.getTestData(FORM_MACHINE_FAMILY);
        String series = TestDataReader.getTestData(FORM_SERIES);
        String machineType = TestDataReader.getTestData(FORM_MACHINE_TYPE);
        String addGPUs=TestDataReader.getTestData(FORM_ADD_GPUS);
        String gpuType = TestDataReader.getTestData(FORM_GPU_TYPE);
        String numGPUs = TestDataReader.getTestData(FORM_NUM_GPUs);
        String localSSD = TestDataReader.getTestData(FORM_LOCAL_SSD);
        String region = TestDataReader.getTestData(FORM_REGION);

        return new Form(numInstances, osSoftware, provisioningModel, machineFamily, series, machineType,
          addGPUs,gpuType, numGPUs, localSSD, region);
    }
}



