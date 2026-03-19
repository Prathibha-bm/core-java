class Hairband {

    public static void main(String[] args){

        int size = 12;
        double price = 50.25;
        float thickness = 0.8f;
        char colorCode = 'P';
        boolean stretchable = true;

        System.out.println("size: " + size);
        System.out.println("price: " + price);
        System.out.println("thickness: " + thickness);
        System.out.println("colorCode: " + colorCode);
        System.out.println("stretchable: " + stretchable);

        size = 14;
        price = 65.50;
        thickness = 1.0f;
        colorCode = 'B';
        stretchable = false;

        System.out.println("\n\nAfter Update");
        System.out.println("size: " + size);
        System.out.println("price: " + price);
        System.out.println("thickness: " + thickness);
        System.out.println("colorCode: " + colorCode);
        System.out.println("stretchable: " + stretchable);
    }
}