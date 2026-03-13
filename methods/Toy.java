class Toy{

 static void car(int size, int wheels, String material, double weight){
    System.out.println("Toy Size: " + size);
    System.out.println("Wheels: " + wheels);
    System.out.println("Material: " + material);
    System.out.println("Weight: " + weight);
    doll();
 }

 static void doll(){
	String material = "Plastic";
    float size = 8.5f;
    int wheels = 0;
    double weight = 2.1;
    String color = "Pink";
    int price = 300;
    String brand = "Funskool";
    boolean safe = true;
	
    System.out.println("material");
    System.out.println("size");
    System.out.println("wheels");
    System.out.println("weight");
    System.out.println("color");
    System.out.println("price");
    System.out.println("brand");
    System.out.println("safe");
 }
}