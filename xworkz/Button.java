class Button {

    public static void main(String[] args){

        int size = 2;
        double price = 5.50;
        float thickness = 0.3f;
        char colorCode = 'R';
        boolean isRound = true;

        System.out.println("size: " + size);
        System.out.println("price: " + price);
        System.out.println("thickness: " + thickness);
        System.out.println("colorCode: " + colorCode);
        System.out.println("isRound: " + isRound);

        size = 3;
        price = 6.75;
        thickness = 0.5f;
        colorCode = 'B';
        isRound = false;

        System.out.println("\n\nAfter Update");
        System.out.println("size: " + size);
        System.out.println("price: " + price);
        System.out.println("thickness: " + thickness);
        System.out.println("colorCode: " + colorCode);
        System.out.println("isRound: " + isRound);
    }
}