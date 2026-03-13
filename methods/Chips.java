class Chips{

 static void potato(int size, int thickness, String flavor, double weight){
    System.out.println("Chip Size: " + size);
    System.out.println("Chip Thickness: " + thickness);
    System.out.println("Chip Flavor: " + flavor);
    System.out.println("Chip Weight: " + weight);
    cornChips();
 }

 static void cornChips(){
    float size = 5.5f;
    int thickness = 2;
    String flavor = "Spicy";
    double weight = 1.2;
    String color = "Yellow";
    int price = 20;
    String brand = "Lays";
    boolean crispy = true;

    System.out.println("size");
    System.out.println("thickness");
    System.out.println("flavor");
    System.out.println("weight");
    System.out.println("color");
    System.out.println("price");
    System.out.println("brand");
    System.out.println("crispy");
 }
}