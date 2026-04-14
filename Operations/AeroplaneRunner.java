class AeroplaneRunner {

    public static void main(String... args) {

        Aeroplane aeroplane = new Aeroplane();

        aeroplane.saveAeroplaneName("Boeing");
        aeroplane.saveAeroplaneName("Airbus");
        aeroplane.saveAeroplaneName("Cessna");
        aeroplane.saveAeroplaneName("Emirates");
        aeroplane.saveAeroplaneName("Indigo");

        aeroplane.saveAeroplaneName("Extra Plane");

        aeroplane.saveAeroplaneName(null);

        aeroplane.searchAeroplane("Indigo");
        aeroplane.searchAeroplane("SpiceJet");
    }
}