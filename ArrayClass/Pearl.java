class Pearl {

    String color;
    double price;
    boolean isNatural;

    String shape;   
    PearlSize size;    

    Pearl(String color, double price, boolean isNatural) {
        this.color = color;
        this.price = price;
        this.isNatural = isNatural;
    }

    void info() {
        System.out.println("\nRunning info in Pearl");
        System.out.println("Color: " + this.color);
        System.out.println("Price: " + this.price);
        System.out.println("Natural: " + this.isNatural);
        System.out.println("Shape: " + this.shape);
        System.out.println("Size: " + this.size);
    }
}

