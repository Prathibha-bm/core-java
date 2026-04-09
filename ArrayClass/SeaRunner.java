class SeaRunner {
    public static void main(String[] args) {

        LightHouse l1 = new LightHouse("LH1", 100, true);
        l1.location =Location.COAST1;
        l1.yearBuilt = 1990;

        LightHouse l2 = new LightHouse("LH2", 120, false);
        l2.location =Location.COAST2;
        l2.yearBuilt = 1980;

        LightHouse l3 = new LightHouse("LH3", 90, true);
        l3.location =Location.COAST3;
        l3.yearBuilt = 2000;

        LightHouse[] lightHouses = {l1, l2, l3};

        SeaShore sea = new SeaShore("Goa Beach", "India", lightHouses);
        sea.display();
    }
}


