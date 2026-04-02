class WindShield {
    String brand;
    String material;
    double length;
    double width;
    double thickness;
    double price;
    boolean isTinted;
    boolean isShatterProof;
    String vehicleType;
    double weight;

    public WindShield(String brand, String material, double length, double width, double thickness,
                      double price, boolean isTinted, boolean isShatterProof, String vehicleType, double weight) {
        this.brand = brand;
        this.material = material;
        this.length = length;
        this.width = width;
        this.thickness = thickness;
        this.price = price;
        this.isTinted = isTinted;
        this.isShatterProof = isShatterProof;
        this.vehicleType = vehicleType;
        this.weight = weight;
    }

    void showMethod() {
        System.out.println("brand: " + brand);
        System.out.println("material: " + material);
        System.out.println("length: " + length);
        System.out.println("width: " + width);
        System.out.println("thickness: " + thickness);
        System.out.println("price: $" + price);
        System.out.println("isTinted: " + isTinted);
        System.out.println("isShatterProof: " + isShatterProof);
        System.out.println("vehicleType: " + vehicleType);
        System.out.println("weight: " + weight + " kg");
        System.out.println("..................");
    }
}
