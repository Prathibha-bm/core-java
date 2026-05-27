package com.exm.demo;

public class TransportMode {
    private String type;            // ಸಾರಿಗೆ ಪ್ರಕಾರ (ಉದಾ: "Bus", "Train", "Flight")
    private String providerName;    // ಸಂಸ್ಥೆಯ ಹೆಸರು (ಉದಾ: "KSRTC", "Namma Metro")
    private int ticketPrice;        // ಟಿಕೆಟ್ ದರ/ಬೆಲೆ
    private double speedInKmph;     // ಗರಿಷ್ಠ ವೇಗ (ಉದಾ: 60.5, 120.0)
    private boolean isPublic;

    public TransportMode() {
    }

    public TransportMode(String type, String providerName, int ticketPrice, double speedInKmph, boolean isPublic) {
        this.type = type;
        this.providerName = providerName;
        this.ticketPrice = ticketPrice;
        this.speedInKmph = speedInKmph;
        this.isPublic = isPublic;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getProviderName() {
        return providerName;
    }

    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

    public int getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(int ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public double getSpeedInKmph() {
        return speedInKmph;
    }

    public void setSpeedInKmph(double speedInKmph) {
        this.speedInKmph = speedInKmph;
    }

    public boolean isPublic() {
        return isPublic;
    }

    public void setPublic(boolean aPublic) {
        isPublic = aPublic;
    }

    @Override
    public boolean equals(Object obj) {

        if (obj != null) {
            TransportMode ice1 = this;

            if (obj instanceof TransportMode) {
                TransportMode ice2 = (TransportMode) obj;

                if (ice1.type.equals(ice2.type) && ice1.ticketPrice == (ice2.ticketPrice)) {
                    return true;
                }
            }
        }
        return false;
    }
}
