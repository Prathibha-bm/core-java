class MainTyre{
    public static void main(String[] args) {
        Tyre t1 = new Tyre();
        Tyre t2 = new Tyre("Bridgestone");
        Tyre t3 = new Tyre(17, 215);
		Tyre t4 = new Tyre("Summer", 130, false);
		Tyre t5 = new Tyre( "Rubber", 16, "Car", true);

        t1.showMethod();
        t2.showMethod();
        t3.showMethod();
		t4.showMethod();
		t5.showMethod();
    }
}