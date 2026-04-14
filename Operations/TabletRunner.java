class TabletRunner{

    public static void main(String... args) {

        Tablet tablet = new Tablet();

        tablet.saveTabletName("Paracetamol");
        tablet.saveTabletName("Dolo");
        tablet.saveTabletName("Aspirin");
        tablet.saveTabletName("Crocin");
        tablet.saveTabletName("Vitamin C");

        tablet.saveTabletName("Extra Tablet");

        tablet.saveTabletName(null);

        tablet.searchTablet("Crocin");
        tablet.searchTablet("Ibuprofen");
    }
}