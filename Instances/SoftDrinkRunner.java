class SoftDrinkRunner{
    public static void main(String[] args) {
        SoftDrink s1 = new SoftDrink("Coca-Cola", "Cola", 0.5, 1.5, true, false, "Bottle", 5.0, 210, true);
        SoftDrink s2 = new SoftDrink("Pepsi", "Cola", 1.0, 2.5, true, false, "Can", 6.0, 250, true);
        SoftDrink s3 = new SoftDrink("Sprite", "Lemon-Lime", 0.75, 1.8, true, true, "Bottle", 4.0, 180, false);

        s1.showMethod();
        s2.showMethod();
        s3.showMethod();
    }
}