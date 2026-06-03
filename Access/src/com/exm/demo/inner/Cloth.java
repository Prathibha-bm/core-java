package com.exm.demo.inner;

public abstract class Cloth {
    private String type;
    private int length;
    private double rating;
    private boolean isDurable;

    public Cloth(String type, int length, double rating, boolean isDurable) {
        this.type = type;
        this.length = length;
        this.rating = rating;
        this.isDurable = isDurable;
    }

    public void clothsInfo(){
         System.out.println("type :"+type);
         System.out.println("length :"+length);
         System.out.println("rating :"+rating);
         System.out.println("isDurable :"+isDurable);

}

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public boolean isDurable() {
        return isDurable;
    }

    public void setDurable(boolean durable) {
        isDurable = durable;
    }
}


