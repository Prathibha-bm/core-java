class Bat{

 static void cricket(int length, int width, String material, double weight){
    System.out.println("Length: " + length);
    System.out.println("Width: " + width);
    System.out.println("Material: " + material);
    System.out.println("Weight: " + weight);
    woodenBat();
 }

 static void woodenBat(){
    float length = 34.5f;
    int width = 10;
    String material = "Wood";
    double weight = 2.8;
    String color = "Brown";
    int price = 2000;
    String brand = "SG";
    boolean strong = true;

    System.out.println("length");
    System.out.println("width");
    System.out.println("material");
    System.out.println("weight");
    System.out.println("color");
    System.out.println("price");
    System.out.println("brand");
    System.out.println("strong");
 }
}