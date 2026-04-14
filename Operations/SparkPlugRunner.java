class SparkPlugRunner {

    public static void main(String... args) {

        SparkPlug sparkPlug = new SparkPlug();

        sparkPlug.saveSparkPlugName("NGK");
        sparkPlug.saveSparkPlugName("Bosch");
        sparkPlug.saveSparkPlugName("Denso");
        sparkPlug.saveSparkPlugName("Champion");
        sparkPlug.saveSparkPlugName("ACDelco");

        sparkPlug.saveSparkPlugName("Extra Plug");

        sparkPlug.saveSparkPlugName(null);

        sparkPlug.searchSparkPlug("Bosch");
        sparkPlug.searchSparkPlug("Autolite");
    }
}