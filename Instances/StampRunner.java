class StampRunner{
    public static void main(String[] args) {
        Stamp s1 = new Stamp("Camlin", "Wood", "Black", 5, 3, 30, true, "Rectangle", true, 0.1);
        Stamp s2 = new Stamp("Dollar", "Plastic", "Blue", 4, 2.5, 25, false, "Square", false, 0.08);
        Stamp s3 = new Stamp("Faber-Castell", "Rubber", "Red", 6, 3.5, 35, true, "Oval", true, 0.12);

        s1.showMethod();
        s2.showMethod();
        s3.showMethod();
    }
}