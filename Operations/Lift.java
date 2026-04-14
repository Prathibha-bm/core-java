class Lift {

    String[] names = new String[5];
    int index = 0;

    void saveLiftName(String name) {

        if (name != null) {

            if (this.index < this.names.length) {
                System.out.println("\nLift name is not null we can save");

                this.names[this.index] = name;
                System.out.println("Lift name " + name + " is saved in index: " + this.index);
                this.index++;
            } else {
                System.out.println("\nArray sizes is full ");
            }

        } else {
            System.out.println("\nLift name is null we cannot save");
        }
    }

    void searchLift(String name) {
        boolean found = false;

        if (name != null) {

            for (String temp : this.names) {
                if (name == temp) {
                    System.out.println("\nLift name is founds");
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("\nLift name is not found");
            }

        } else {
            System.out.println("\nLift name is null");
        }
    }
}