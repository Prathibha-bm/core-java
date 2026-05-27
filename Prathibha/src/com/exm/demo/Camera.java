package com.exm.demo;



public class Camera {
    private int resolutionInMp;
    private String brandName;
    private int price;
    private int rating;
    private String shopeName;

    public Camera() {
    }

    public Camera(int resolutionInMp, String brandName, int price, int rating, String shopeName) {
        this.resolutionInMp = resolutionInMp;
        this.brandName = brandName;
        this.price = price;
        this.rating = rating;
        this.shopeName = shopeName;
    }

    public int getResolutionInMp() {
        return resolutionInMp;
    }

    public void setResolutionInMp(int resolutionInMp) {
        this.resolutionInMp = resolutionInMp;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getShopeName() {
        return shopeName;
    }

    public void setShopeName(String shopeName) {
        this.shopeName = shopeName;
    }


    @Override
    public boolean equals(Object obj) {

        if (obj != null) {
            Camera camera1 = this;

            if (obj instanceof Camera) {
                Camera camera2 = (Camera) obj;

                if (camera1.brandName.equals(camera2.brandName) && camera1.price == camera2.price) {
                    return true;
                }
            }
        }
        return false;

    }
}

