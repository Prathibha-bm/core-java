class Stick{

 static void bamboo(int length, int thickness, String material, double weight){
    System.out.println("Length: " + length);
    System.out.println("Thickness: " + thickness);
    System.out.println("Material: " + material);
    System.out.println("Weight: " + weight);
    walkingStick();
 }

 static void walkingStick(){
    float length = 40.5f;
    int thickness = 3;
    String material = "Bamboo";
    double weight = 1.5;
    String color = "Brown";
    int price = 150;
    String brand = "Local";
    boolean strong = true;

    System.out.println("length");
    System.out.println(" thickness");
    System.out.println("material");
    System.out.println("weight ");
    System.out.println("color");
    System.out.println(" price");
    System.out.println("brand");
    System.out.println("strong");
 }
}