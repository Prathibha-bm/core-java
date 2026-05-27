package com.exm.demo;

public class Application {
    private String name;
    private String applicationType;
    private int storageInGb;
    private boolean isEasyToUse;
    private int coast;

    public Application() {
    }

    public Application(String name, String applicationType, int storageInGb, boolean isEasyToUse, int coast) {
        this.name = name;
        this.applicationType = applicationType;
        this.storageInGb = storageInGb;
        this.isEasyToUse = isEasyToUse;
        this.coast = coast;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getApplicationType() {
        return applicationType;
    }

    public void setApplicationType(String applicationType) {
        this.applicationType = applicationType;
    }

    public int getStorageInGb() {
        return storageInGb;
    }

    public void setStorageInGb(int storageInGb) {
        this.storageInGb = storageInGb;
    }

    public boolean isEasyToUse() {
        return isEasyToUse;
    }

    public void setEasyToUse(boolean easyToUse) {
        isEasyToUse = easyToUse;
    }

    public int getCoast() {
        return coast;
    }

    public void setCoast(int coast) {
        this.coast = coast;
    }

    @Override
    public boolean equals(Object obj) {

        if (obj != null) {
            Application app1 = this;

            if (obj instanceof Application) {
                Application app2 = (Application) obj;

                if (app1.name.equals(app2.name) && app1.storageInGb==(app2.storageInGb)){
                    return true;
                }
            }
        }
        return false;
    }
}

