class Xerox{
    String modelName;
    String manufacturer;
    double printSpeed;
    double paperCapacity;
    boolean isColor;
    boolean isDuplex;
    String connectivity;
    double weight;
    double price;
    boolean isWireless;

    public Xerox() {}
	
	public Xerox(String modelName) {
        this.modelName = modelName;
	}
		
	public Xerox(String manufacturer, double printSpeed) {
        
		this.manufacturer = manufacturer;
        this.printSpeed = printSpeed;
	}
		
	public Xerox(double paperCapacity,boolean isColor, boolean isDuplex) {
        this.paperCapacity = paperCapacity;
        this.isColor = isColor;
        this.isDuplex = isDuplex;
	}
		
		
	public Xerox(String connectivity, double weight,double price, boolean isWireless) {
        this.connectivity = connectivity;
        this.weight = weight;
        this.price = price;
        this.isWireless = isWireless;
    }

    void showMethod() {
        System.out.println("modelName: " + modelName);
        System.out.println("manufacturer: " + manufacturer);
        System.out.println("printSpeed: " + printSpeed + " ppm");
        System.out.println("paperCapacity: " + paperCapacity + " sheets");
        System.out.println("isColor: " + isColor);
        System.out.println("isDuplex: " + isDuplex);
        System.out.println("connectivity: " + connectivity);
        System.out.println("weight: " + weight + " kg");
        System.out.println("price: $" + price);
        System.out.println("isWireless: " + isWireless);
        System.out.println("..................");
    }
}

