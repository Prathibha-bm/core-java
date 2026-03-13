class Trophy{

static void award(int height, int width, String material, double weight){
    System.out.println("Height: " + height);
    System.out.println("Width: " + width);
    System.out.println("Material: " + material);
    System.out.println("Weight: " + weight);
    goldTrophy();
 }

static void goldTrophy(){
    float height = 12.5f;
    int width = 4;
    String material = "Gold";
    double weight = 3.0;
    String color = "Golden";
    int price = 1500;
    String brand = "Winner";
    boolean shiny = true;

    System.out.println("height");
    System.out.println("width");
    System.out.println("material");
    System.out.println("weight");
    System.out.println("color");
    System.out.println("price");
    System.out.println("brand");
    System.out.println("shiny");
 }
}