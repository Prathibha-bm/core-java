class SoftDrinkRunner{
    public static void main(String[] args) {
        SoftDrink s1 = new SoftDrink();
        SoftDrink s2 = new SoftDrink("Pepsi");
        SoftDrink s3 = new SoftDrink("Lemon-Lime", 0.75);
		SoftDrink s4 = new SoftDrink(0.75,true, true);
		SoftDrink s5 = new SoftDrink("Bottle", 4.0, 180, false);
		
		

        s1.showMethod();
        s2.showMethod();
        s3.showMethod();
		s4.showMethod();
		s5.showMethod();
    }
}