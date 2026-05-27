package com.exm.demo;

public class Weather {
    private String place;
    private boolean isCold;
    private boolean isHot;
    private boolean isRainy;
    private boolean isMedium;


    public Weather() {
    }

    public Weather(String place, boolean isCold, boolean isHot, boolean isRainy, boolean isMedium) {
        this.place = place;
        this.isCold = isCold;
        this.isHot = isHot;
        this.isRainy = isRainy;
        this.isMedium = isMedium;
    }

    @Override
    public boolean equals(Object obj) {

        if (obj != null) {
            Weather weather1 = this;

            if (obj instanceof Weather) {
                Weather weather2 = (Weather) obj;

                if (weather1.place.equals(weather2.place) && weather1.isMedium==(weather2.isMedium)) {
                    return true;
                }
            }
        }
         return false;
    }

}
