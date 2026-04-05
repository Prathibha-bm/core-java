class StampRunner{
    public static void main(String[] args) {
        Stamp s1 = new Stamp();
        Stamp s2 = new Stamp("Dollar");
        Stamp s3 = new Stamp("Rubber", "Red");
		Stamp s4 = new Stamp( 6, 3.5, 35);
		Stamp s5 = new Stamp(true, "Oval", true, 0.12);

        s1.showMethod();
        s2.showMethod();
        s3.showMethod();
		s4.showMethod();
		s5.showMethod();
    }
}