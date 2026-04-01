class VRBox{

    String brand;
    String model;
    String material;
    double weight;
    double fieldOfView;
    boolean hasHeadTracking;
    boolean hasController;
    boolean isWireless;
    int vrBoxId;
    double price;
    String compatibility;

    public VRBox(String brand, String model, String material, double weight, double fieldOfView,
                 boolean hasHeadTracking, boolean hasController, boolean isWireless,
                 int vrBoxId, double price, String compatibility) {

        this.brand=brand;
        this.model=model;
        this.material=material;
        this.weight=weight;
        this.fieldOfView=fieldOfView;
        this.hasHeadTracking=hasHeadTracking;
        this.hasController=hasController;
        this.isWireless=isWireless;
        this.vrBoxId=vrBoxId;
        this.price=price;
        this.compatibility=compatibility;
    }
}