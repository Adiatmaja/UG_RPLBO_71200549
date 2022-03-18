package com.ug6.soal1;

public class Phones {
    private String phoneName;
    private String phoneCode;
    private String companyCode;
    private String androidCode;
    private int ramCapacity;
    private int romCapacity;
    private int cameraResolution;
    private float screenSize;

    public Phones(final String phoneName, final String phoneCode, final String companyCode, final String androidCode) {
        this.ramCapacity = 0;
        this.romCapacity = 0;
        this.cameraResolution = 0;
        this.phoneName = phoneName;
        this.phoneCode = phoneCode;
        this.companyCode = companyCode;
        this.androidCode = androidCode;
    }

    public Phones(final String phoneName, final String phoneCode, final String companyCode, final String androidCode, final int ramCapacity, final int romCapacity, final int cameraResolution, final float screenSize) {
        this.phoneName = phoneName;
        this.phoneCode = phoneCode;
        this.companyCode = companyCode;
        this.androidCode = androidCode;
        this.ramCapacity = ramCapacity;
        this.romCapacity = romCapacity;
        this.cameraResolution = cameraResolution;
        this.screenSize = screenSize;
    }

    public String getPhoneName() {
        return this.phoneName;
    }

    public String getCompanyCode() {
        return this.companyCode;
    }

    public String getAndroidCode() {
        return this.androidCode;
    }

    public int getRamCapacity() {
        return this.ramCapacity;
    }

    public int getRomCapacity() {
        return this.romCapacity;
    }

    public int getCameraResolution() {
        return this.cameraResolution;
    }

    public float getScreenSize() {
        return this.screenSize;
    }

    public String getPhoneCode() {
        return this.phoneCode;
    }
}