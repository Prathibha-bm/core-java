class Human {

    public static void main(String[] args){

        int age = 25;
        double height = 5.9;
        float weight = 70.5f;
        char gender = 'M';
        boolean employed = true;

        System.out.println("age: " + age);
        System.out.println("height: " + height);
        System.out.println("weight: " + weight);
        System.out.println("gender: " + gender);
        System.out.println("employed: " + employed);

        age = 30;
        height = 6.1;
        weight = 75.0f;
        gender = 'F';
        employed = false;

        System.out.println("\n\nAfter Update");
        System.out.println("age: " + age);
        System.out.println("height: " + height);
        System.out.println("weight: " + weight);
        System.out.println("gender: " + gender);
        System.out.println("employed: " + employed);
    }
}