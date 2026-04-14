class JuiceRunner {

    public static void main(String... args) {

        Juice juice = new Juice();

        juice.saveJuiceName("Apple");
        juice.saveJuiceName("Orange");
        juice.saveJuiceName("Mango");
        juice.saveJuiceName("Grape");
        juice.saveJuiceName("Pineapple");

        juice.saveJuiceName("Extra Juice");

        juice.saveJuiceName(null);

        juice.searchJuice("Mango");
        juice.searchJuice("Watermelon");
    }
}