class Tyre2 {
    String brand;
    double diameter;
    double width;
    String type;
    double price;
    boolean isTubeless;
    String material;
    double weight;
    String vehicleType;
    boolean isAllSeason;

    public Tyre2(String brand, double diameter, double width, String type, double price,
                boolean isTubeless, String material, double weight, String vehicleType, boolean isAllSeason) {
        this.brand = brand;
        this.diameter = diameter;
        this.width = width;
        this.type = type;
        this.price = price;
        this.isTubeless = isTubeless;
        this.material = material;
        this.weight = weight;
        this.vehicleType = vehicleType;
        this.isAllSeason = isAllSeason;
    }

    void showMethod() {
        System.out.println("brand: " + brand);
        System.out.println("diameter: " + diameter);
        System.out.println("width: " + width);
        System.out.println("type: " + type);
        System.out.println("price: $" + price);
        System.out.println("isTubeless: " + isTubeless);
        System.out.println("material: " + material);
        System.out.println("weight: " + weight + " kg");
        System.out.println("vehicleType: " + vehicleType);
        System.out.println("isAllSeason: " + isAllSeason);
        System.out.println("..................");
    }
}
