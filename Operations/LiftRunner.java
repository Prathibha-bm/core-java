class LiftRunner {

    public static void main(String... args) {

        Lift lift = new Lift();

        lift.saveLiftName("Passenger Lift");
        lift.saveLiftName("Goods Lift");
        lift.saveLiftName("Home Lift");
        lift.saveLiftName("Glass Lift");
        lift.saveLiftName("Service Lift");

        lift.saveLiftName("Extra Lift");

        lift.saveLiftName(null);

        lift.searchLift("Glass Lift");
        lift.searchLift("Hydraulic Lift");
    }
}