class CupRunner{

    public static void main(String... args) {

        Cup cup = new Cup();

        cup.saveCupName("Tea Cup");
        cup.saveCupName("Coffee Cup");
        cup.saveCupName("Steel Cup");
        cup.saveCupName("Glass Cup");
        cup.saveCupName("Paper Cup");

        cup.saveCupName("Extra Cup");

        cup.saveCupName(null);

        cup.searchCup("Paper Cup");
        cup.searchCup("Plastic Cup");
    }
}