class Dynamo {

    String[] names = new String[5];
    int index = 0;

    void saveDynamoName(String name) {

        if (name != null) {

            if (this.index < this.names.length) {
                System.out.println("\nDynamo name is not null we can save");

                this.names[this.index] = name;
                System.out.println("Dynamo name " + name + " is saved in index: " + this.index);
                this.index++;
            } else {
                System.out.println("\nArray sizes is full ");
            }

        } else {
            System.out.println("\nDynamo name is null we cannot save");
        }
    }

    void searchDynamo(String name) {
        boolean found = false;

        if (name != null) {

            for (String temp : this.names) {
                if (name == temp) {
                    System.out.println("\nDynamo name is found"n);
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("\nDynamo name is not found");
            }

        } else {
            System.out.println("\nDynamo name is null");
        }
    }
}