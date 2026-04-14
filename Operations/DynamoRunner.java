class DynamoRunner {

    public static void main(String... args) {

        Dynamo dynamo = new Dynamo();

        dynamo.saveDynamoName("Cycle Dynamo");
        dynamo.saveDynamoName("Car Dynamo");
        dynamo.saveDynamoName("Generator");
        dynamo.saveDynamoName("Mini Dynamo");
        dynamo.saveDynamoName("Power Dynamo");

        dynamo.saveDynamoName("Extra Dynamo");

        dynamo.saveDynamoName(null);

        dynamo.searchDynamo("Generator");
        dynamo.searchDynamo("Turbo Dynamo");
    }
}