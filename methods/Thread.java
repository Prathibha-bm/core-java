class Thread{

    static void cotton(int length, int thickness, String material, double weight){
        System.out.println("Thread Length: " + length);
        System.out.println("Thread Thickness: " + thickness);
        System.out.println("Thread Material: " + material);
        System.out.println("Thread Weight: " + weight);
        silkThread();
    }

    static void silkThread(){
        float length = 12.5f;
        int thickness = 1;
        String material = "Silk";
        double weight = 1.8;
        String color = "Red";
        int price = 200;
        String brand = "Coats";
        boolean flexible = true;

        System.out.println("length");
        System.out.println("thickness");
        System.out.println("material");
        System.out.println("weight");
        System.out.println("color");
        System.out.println("price");
        System.out.println("brand");
        System.out.println("flexible");
    }

}