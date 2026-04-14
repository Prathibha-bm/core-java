class Cup {

    String[] names = new String[5];
    int index = 0;

    void saveCupName(String name) {

        if (name != null) {

            if (this.index < this.names.length) {
                System.out.println("\nCup name is not null we can save");

                this.names[this.index] = name;
                System.out.println("Cup name " + name + " is saved in index: "+this.index);
                this.index++;
            } else {
                System.out.println("\nArray sizes is full ");
            }

        } else {
            System.out.println("\nCup name is null we cannot save");
            
        }
    }

    void searchCup(String name) {
        boolean found = false;

        if (name != null) {

            for (String temp : this.names) {
                if (name == temp) {
                    System.out.println("\nCup name is found ");
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("\nCup name is not found");
            }

        } else {
            System.out.println("\nCup name is null");
        }
    }
}