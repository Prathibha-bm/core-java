class Screw{

 static void metal(int length, int diameter, String material, double weight){
    System.out.println("Length: " + length);
    System.out.println("Diameter: " + diameter);
    System.out.println("Material: " + material);
    System.out.println("Weight: " + weight);
    woodScrew();
 }

 static void woodScrew(){
    float length = 4.5f;
    int diameter = 1;
    String material = "Iron";
    double weight = 0.5;
    String color = "Silver";
    int price = 5;
    String brand = "Bosch";
    boolean strong = true;

    System.out.println("length");
    System.out.println("diameter");
    System.out.println("material");
    System.out.println("weight");
    System.out.println("color");
    System.out.println("price");
    System.out.println("brand");
    System.out.println("strong");
 }
}