class SeaShore {

    String name;
    String countryName;
    LightHouse[] lightHouses;

    SeaShore(String name, String countryName, LightHouse[] lightHouses) {
        this.name = name;
        this.countryName = countryName;
        this.lightHouses = lightHouses;
    }

    void display() {
        System.out.println("Name: " + this.name);
        System.out.println("Country: " + this.countryName);

        if (lightHouses != null) {
            for (LightHouse lightHouse : this.lightHouses) {
                if (lightHouse != null) {
                    lightHouse.info();
                } else {
                    System.out.println("null value");
                }
            }
        }
    }
}

