class ArtMaterial{
    String name;
    String brand;
    String type;
    String color;
    double price;
    boolean isNonToxic;
    double weight;
    double length;
    double width;
    boolean isWaterproof;

    public ArtMaterial(String name, String brand, String type, String color, double price,
                       boolean isNonToxic, double weight, double length, double width, boolean isWaterproof) {
        this.name = name;
        this.brand = brand;
        this.type = type;
        this.color = color;
        this.price = price;
        this.isNonToxic = isNonToxic;
        this.weight = weight;
        this.length = length;
        this.width = width;
        this.isWaterproof = isWaterproof;
    }

    void showMethod() {
        System.out.println("name: " + name);
        System.out.println("brand: " + brand);
        System.out.println("type: " + type);
        System.out.println("color: " + color);
        System.out.println("price: $" + price);
        System.out.println("isNonToxic: " + isNonToxic);
        System.out.println("weight: " + weight + " kg");
        System.out.println("length: " + length);
        System.out.println("width: " + width);
        System.out.println("isWaterproof: " + isWaterproof);
        System.out.println("..................");
    }
}
