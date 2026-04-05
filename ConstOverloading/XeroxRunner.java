class XeroxRunner{
    public static void main(String[] args) {
        Xerox xerRef1 = new Xerox();
        Xerox xerRef2 = new Xerox("VersaLink C405");
        Xerox xerRef3 = new Xerox("Xerox", 55);
		Xerox xerRef4 = new Xerox(1000, true, true);
		Xerox xerRef5 = new Xerox( "Ethernet", 32.0, 1200, true);


        xerRef1.showMethod();
        xerRef2.showMethod();
        xerRef3.showMethod();
		xerRef4.showMethod();
		xerRef5.showMethod();
    }
}