class AlloyRunner {

    public static void main(String... args) {

        Alloy alloy = new Alloy();

        alloy.saveAlloyName("Steel");
        alloy.saveAlloyName("Bronze");
        alloy.saveAlloyName("Brass");
        alloy.saveAlloyName("Titanium");
        alloy.saveAlloyName("Aluminum");

        alloy.saveAlloyName("Extra Alloy");

        alloy.saveAlloyName(null);

        alloy.searchAlloy("Steel");
        alloy.searchAlloy("Copper");
    }
}