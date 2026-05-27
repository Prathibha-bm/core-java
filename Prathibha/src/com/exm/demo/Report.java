package com.exm.demo;

public class Report {
    private String name;
    private int noOfPages;
    private String type;
    private boolean isHardBinded;
    private String color;

    public Report() {

    }

    public Report(String name, int noOfPages, String type, boolean isHardBinded, String color) {
        this.name = name;
        this.noOfPages = noOfPages;
        this.type = type;
        this.isHardBinded = isHardBinded;
        this.color = color;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNoOfPages() {
        return noOfPages;
    }

    public void setNoOfPages(int noOfPages) {
        this.noOfPages = noOfPages;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isHardBinded() {
        return isHardBinded;
    }

    public void setHardBinded(boolean hardBinded) {
        isHardBinded = hardBinded;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object obj) {

        if (obj != null) {
            Report report1 = this;

            if (obj instanceof Report) {
                Report report2 = (Report) obj;

                if (report1.name.equals(report2.name) && report1.noOfPages == (report2.noOfPages)) {

                    return true;
                }
            }
        }
        return false;


    }
}
