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

    public Stamp() {
	}
					 
	public Stamp(String brand) {
        this.brand = brand;
	}
		
	public Stamp(String material,String color) {
        this.material = material;
        this.color = color;	
	}
	public Stamp(double length, double width,double price) {
        this.length = length;
        this.width = width;
        this.price = price;
	}
		
	public Stamp( boolean isSelfInk, String shape, boolean isCustomizable, double weight) {
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