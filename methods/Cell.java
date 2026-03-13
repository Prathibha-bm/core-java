class Cell{

 static void battery(int capacity, int voltage, String type, double weight){
    System.out.println("Capacity: " + capacity);
    System.out.println("Voltage: " + voltage);
    System.out.println("Type: " + type);
    System.out.println("Weight: " + weight);
    dryCell();
 }

 static void dryCell(){
    float capacity = 2.5f;
    int voltage = 9;
    String type = "Dry";
    double weight = 1.0;
    String color = "Black";
    int price = 50;
    String brand = "Duracell";
    boolean rechargeable = false;

    System.out.println("capacity");
    System.out.println("voltage");
    System.out.println("type");
    System.out.println("weight");
    System.out.println("color");
    System.out.println("price");
    System.out.println("brand");
    System.out.println("rechargeable");
 }
}