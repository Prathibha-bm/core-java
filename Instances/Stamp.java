class Stamp{
    String brand;
    String material;
    String color;
    double length;
    double width;
    double price;
    boolean isSelfInk;
    String shape;
    boolean isCustomizable;
    double weight;

    public Stamp(String brand, String material, String color, double length, double width,
                 double price, boolean isSelfInk, String shape, boolean isCustomizable, double weight) {
        this.brand = brand;
        this.material = material;
        this.color = color;
        this.length = length;
        this.width = width;
        this.price = price;
        this.isSelfInk = isSelfInk;
        this.shape = shape;
        this.isCustomizable = isCustomizable;
        this.weight = weight;
    }

    void showMethod() {
        System.out.println("brand: " + brand);
        System.out.println("material: " + material);
        System.out.println("color: " + color);
        System.out.println("length: " + length);
        System.out.println("width: " + width);
        System.out.println("price: $" + price);
        System.out.println("isSelfInk: " + isSelfInk);
        System.out.println("shape: " + shape);
        System.out.println("isCustomizable: " + isCustomizable);
        System.out.println("weight: " + weight + " kg");
        System.out.println("..................");
    }
}