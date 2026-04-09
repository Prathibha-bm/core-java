class Classroom {

    int number;
    int floorNo;
    Duster[] dusters;

    Classroom(int number, int floorNo, Duster[] dusters) {
        this.number = number;
        this.floorNo = floorNo;
        this.dusters = dusters;
    }

    void display() {
        System.out.println("Number: " + this.number);
        System.out.println("Floor: " + this.floorNo);

        if (dusters != null) {
            for (Duster duster : this.dusters) {
                if (duster != null) {
                    duster.info();
                } else {
                    System.out.println("null value");
                }
            }
			}
    }
}
