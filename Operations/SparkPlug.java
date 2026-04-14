class SparkPlug {

    String[] names = new String[5];
    int index = 0;

    void saveSparkPlugName(String name) {

        if (name != null) {

            if (this.index < this.names.length) {
                System.out.println("\nSparkPlug name is not null we can save");

                this.names[this.index] = name;
                System.out.println("SparkPlug name " + name + " is saved in index: " + this.index);
                this.index++;
            } else {
                System.out.println("\nArray sizes is full ");
            }

        } else {
            System.out.println("\nSparkPlug name is null we cannot save");
            System.out.println("\nSparkPlug name is null we cannot save");
        }
    }

    void searchSparkPlug(String name) {
        boolean found = false;

        if (name != null) {

            for (String temp : this.names) {
                if (name == temp) {
                    System.out.println("\nSparkPlug name is found: at index " + this.index);
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("\nSparkPlug name is not found");
            }

        } else {
            System.out.println("\nSparkPlug name is null");
        }
    }
}