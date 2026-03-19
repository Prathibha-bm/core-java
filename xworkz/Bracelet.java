class Bracelet {

    public static void main(String[] args){

        int size = 18;
        double price = 250.99;
        float weight = 15.5f;
        char material = 'G';
        boolean adjustable = true;

        System.out.println("size: " + size);
        System.out.println("price: " + price);
        System.out.println("weight: " + weight);
        System.out.println("material: " + material);
        System.out.println("adjustable: " + adjustable);

        size = 20;
        price = 300.50;
        weight = 18.0f;
        material = 'S';
        adjustable = false;

        System.out.println("\n\nAfter Update");
        System.out.println("size: " + size);
        System.out.println("price: " + price);
        System.out.println("weight: " + weight);
        System.out.println("material: " + material);
        System.out.println("adjustable: " + adjustable);
    }
}