class InkPad{
    String brand;
    String color;
    double length;
    double width;
    double price;
    boolean isReusable;
    String material;
    boolean isNonToxic;
    String shape;
    double weight;

    public InkPad(String brand, String color, double length, double width, double price,
                  boolean isReusable, String material, boolean isNonToxic, String shape, double weight) {
        this.brand = brand;
        this.color = color;
        this.length = length;
        this.width = width;
        this.price = price;
        this.isReusable = isReusable;
        this.material = material;
        this.isNonToxic = isNonToxic;
        this.shape = shape;
        this.weight = weight;
    }

    void showMethod() {
        System.out.println("brand: " + brand);
        System.out.println("color: " + color);
        System.out.println("length: " + length);
        System.out.println("width: " + width);
        System.out.println("price: $" + price);
        System.out.println("isReusable: " + isReusable);
        System.out.println("material: " + material);
        System.out.println("isNonToxic: " + isNonToxic);
        System.out.println("shape: " + shape);
        System.out.println("weight: " + weight + " kg");
        System.out.println("..................");
    }
}