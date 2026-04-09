class Duster {

    String brand;
    String color;
    boolean isSoft;
    int price;      
    Material material;   //enum

    Duster(String brand, String color, boolean isSoft) {
        this.brand = brand;
        this.color = color;
        this.isSoft = isSoft;
    }

    void info() {
        System.out.println("\nRunning info in Duster");
        System.out.println("Brand: " +this.brand);
        System.out.println("Color: " +this.color);
        System.out.println("Soft: " +this.isSoft);
        System.out.println("Price: " +this.price);
        System.out.println("Material: " +this.material);
    }
}
