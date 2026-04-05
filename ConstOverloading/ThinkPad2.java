class ThinkPad{
	
    String modelName;
    String brand;
    double screenSize;
    double weight;
    double price;
    boolean isTouchScreen;
    int ram;
    int storage;
    String processor;
    boolean hasBacklitKeyboard;
	
	
	public ThinkPad() {
      System.out.println("no arguments");
	}
	

    public ThinkPad(String modelName) {
        this.modelName = modelName;
	}
	
	public ThinkPad(String modelName,String brand,double screenSize) {
       this.modelName = modelName;
	   this.brand = brand;
       this.screenSize = screenSize;
	}
	public ThinkPad(double weight,double price,boolean isTouchScreen) {
        this.weight = weight;
        this.price = price;
        this.isTouchScreen = isTouchScreen;
	}
	public ThinkPad(int ram,int storage) {
        this.ram = ram;
        this.storage = storage;
	}
	

    void showMethod() {
        System.out.println("modelName: " + modelName);
        System.out.println("brand: " + brand);
        System.out.println("screenSize: " + screenSize + " inch");
        System.out.println("weight: " + weight + " kg");
        System.out.println("price: $" + price);
        System.out.println("isTouchScreen: " + isTouchScreen);
        System.out.println("ram: " + ram + " GB");
        System.out.println("storage: " + storage + " GB");
        System.out.println("processor: " + processor);
        System.out.println("hasBacklitKeyboard: " + hasBacklitKeyboard);
        System.out.println("..................");
    }
}
