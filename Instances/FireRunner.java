class FireRunner{

public static void main(String[] args){

		Fire instance1=new Fire();
		Fire instance2=new Fire();
		Fire instance3=new Fire();
		Fire instance4=new Fire();
		Fire instance5=new Fire();
		Fire instance6=new Fire();
		Fire instance7=new Fire();
		Fire instance8=new Fire();
		Fire instance9=new Fire();
		Fire instance10=new Fire();
		
		System.out.println("\nInstance1 values");
        System.out.println("location:" + instance1.location);
        System.out.println("isNatural: " + instance1.isNatural);
        System.out.println("numberOfFirefighters: " + instance1.numberOfFirefighters);
        System.out.println("fuelConsumed: " + instance1.fuelConsumed);
        System.out.println("windSpeed: " + instance1.windSpeed);

        System.out.println("\nInstance2 values");
        System.out.println("location:"+ instance2.location);
        System.out.println("isNatural: " + instance2.isNatural);
        System.out.println("numberOfFirefighters: " + instance2.numberOfFirefighters);
        System.out.println("fuelConsumed: " + instance2.fuelConsumed);
        System.out.println("windSpeed: " + instance2.windSpeed);

        System.out.println("\nInstance3 values");
        System.out.println("location: " + instance3.location);
        System.out.println("isNatural: " + instance3.isNatural);
        System.out.println("numberOfFirefighters: " + instance3.numberOfFirefighters);
        System.out.println("fuelConsumed: " + instance3.fuelConsumed);
        System.out.println("windSpeed: " + instance3.windSpeed);

        System.out.println("\nInstance4 values");
        System.out.println("location: " + instance4.location);
        System.out.println("isNatural: " + instance4.isNatural);
        System.out.println("numberOfFirefighters: " + instance4.numberOfFirefighters);
        System.out.println("fuelConsumed: " + instance4.fuelConsumed);
        System.out.println("windSpeed: " + instance4.windSpeed);

        System.out.println("\nInstance5 values");
        System.out.println("location: " + instance5.location);
        System.out.println("isNatural: " + instance5.isNatural);
        System.out.println("numberOfFirefighters: " + instance5.numberOfFirefighters);
        System.out.println("fuelConsumed: " + instance5.fuelConsumed);
        System.out.println("windSpeed: " + instance5.windSpeed);
		
		System.out.println("\nInstance6 values");
        System.out.println("location: " + instance1.location);
        System.out.println("isNatural: " + instance1.isNatural);
        System.out.println("numberOfFirefighters: " + instance1.numberOfFirefighters);
        System.out.println("fuelConsumed: " + instance1.fuelConsumed);
        System.out.println("windSpeed: " + instance1.windSpeed);

        System.out.println("\nInstance7 values");
        System.out.println("location: " + instance2.location);
        System.out.println("isNatural: " + instance2.isNatural);
        System.out.println("numberOfFirefighters: " + instance2.numberOfFirefighters);
        System.out.println("fuelConsumed: " + instance2.fuelConsumed);
        System.out.println("windSpeed: " + instance2.windSpeed);

        System.out.println("\nInstance8 values");
        System.out.println("location: " + instance3.location);
        System.out.println("isNatural: " + instance3.isNatural);
        System.out.println("numberOfFirefighters: " + instance3.numberOfFirefighters);
        System.out.println("fuelConsumed: " + instance3.fuelConsumed);
        System.out.println("windSpeed: " + instance3.windSpeed);

        System.out.println("\nInstance9 values");
        System.out.println("location: " + instance4.location);
        System.out.println("isNatural: " + instance4.isNatural);
        System.out.println("numberOfFirefighters: " + instance4.numberOfFirefighters);
        System.out.println("fuelConsumed: " + instance4.fuelConsumed);
        System.out.println("windSpeed: " + instance4.windSpeed);

        System.out.println("\nInstance10 values");
        System.out.println("location: " + instance5.location);
        System.out.println("isNatural: " + instance5.isNatural);
        System.out.println("numberOfFirefighters: " + instance5.numberOfFirefighters);
        System.out.println("fuelConsumed: " + instance5.fuelConsumed);
        System.out.println("windSpeed: " + instance5.windSpeed);
		
				
		instance1.temperature = 800.5;
		instance1.intensity = 5;
		instance1.duration = 30;
		instance1.spreadRate = 1.2f;
		instance1.isControlled = true;
		instance1.hasSmoke = true;
		instance1.grade = 'A';
		instance1.yearOccurred = 2023;
		instance1.damageArea = 50.5;
		instance1.type = "Campfire";

		System.out.println("\nInstance1 values");
		System.out.println("temperature: " + instance1.temperature);
		System.out.println("intensity: " + instance1.intensity);
		System.out.println("duration: " + instance1.duration);
		System.out.println("spreadRate: " + instance1.spreadRate);
		System.out.println("isControlled: " + instance1.isControlled);
		System.out.println("hasSmoke: " + instance1.hasSmoke);
		System.out.println("grade: " + instance1.grade);
		System.out.println("yearOccurred: " + instance1.yearOccurred);
		System.out.println("damageArea: " + instance1.damageArea);
		System.out.println("type: " + instance1.type);


		
		instance2.temperature = 900.0;
		instance2.intensity = 6;
		instance2.duration = 45;
		instance2.spreadRate = 1.5f;
		instance2.isControlled = false;
		instance2.hasSmoke = true;
		instance2.grade = 'B';
		instance2.yearOccurred = 2022;
		instance2.damageArea = 70.2;
		instance2.type = "Forest Fire";

		System.out.println("\nInstance2 values");
		System.out.println("temperature: " + instance2.temperature);
		System.out.println("intensity: " + instance2.intensity);
		System.out.println("duration: " + instance2.duration);
		System.out.println("spreadRate: " + instance2.spreadRate);
		System.out.println("isControlled: " + instance2.isControlled);
		System.out.println("hasSmoke: " + instance2.hasSmoke);
		System.out.println("grade: " + instance2.grade);
		System.out.println("yearOccurred: " + instance2.yearOccurred);
		System.out.println("damageArea: " + instance2.damageArea);
		System.out.println("type: " + instance2.type);


		
		instance3.temperature = 750.3;
		instance3.intensity = 4;
		instance3.duration = 20;
		instance3.spreadRate = 1.0f;
		instance3.isControlled = true;
		instance3.hasSmoke = false;
		instance3.grade = 'A';
		instance3.yearOccurred = 2024;
		instance3.damageArea = 30.0;
		instance3.type = "Gas Fire";

		System.out.println("\nInstance3 values");
		System.out.println("temperature: " + instance3.temperature);
		System.out.println("intensity: " + instance3.intensity);
		System.out.println("duration: " + instance3.duration);
		System.out.println("spreadRate: " + instance3.spreadRate);
		System.out.println("isControlled: " + instance3.isControlled);
		System.out.println("hasSmoke: " + instance3.hasSmoke);
		System.out.println("grade: " + instance3.grade);
		System.out.println("yearOccurred: " + instance3.yearOccurred);
		System.out.println("damageArea: " + instance3.damageArea);
		System.out.println("type: " + instance3.type);


		instance4.temperature = 1000.0;
		instance4.intensity = 8;
		instance4.duration = 60;
		instance4.spreadRate = 2.0f;
		instance4.isControlled = false;
		instance4.hasSmoke = true;
		instance4.grade = 'C';
		instance4.yearOccurred = 2021;
		instance4.damageArea = 120.5;
		instance4.type = "Industrial Fire";

		System.out.println("\nInstance4 values");
		System.out.println("temperature: " + instance4.temperature);
		System.out.println("intensity: " + instance4.intensity);
		System.out.println("duration: " + instance4.duration);
		System.out.println("spreadRate: " + instance4.spreadRate);
		System.out.println("isControlled: " + instance4.isControlled);
		System.out.println("hasSmoke: " + instance4.hasSmoke);
		System.out.println("grade: " + instance4.grade);
		System.out.println("yearOccurred: " + instance4.yearOccurred);
		System.out.println("damageArea: " + instance4.damageArea);
		System.out.println("type: " + instance4.type);


		instance5.temperature = 850.7;
		instance5.intensity = 6;
		instance5.duration = 40;
		instance5.spreadRate = 1.6f;
		instance5.isControlled = true;
		instance5.hasSmoke = true;
		instance5.grade = 'A';
		instance5.yearOccurred = 2025;
		instance5.damageArea = 65.0;
		instance5.type = "Campfire";

		System.out.println("\nInstance5 values");
		System.out.println("temperature: " + instance5.temperature);
		System.out.println("intensity: " + instance5.intensity);
		System.out.println("duration: " + instance5.duration);
		System.out.println("spreadRate: " + instance5.spreadRate);
		System.out.println("isControlled: " + instance5.isControlled);
		System.out.println("hasSmoke: " + instance5.hasSmoke);
		System.out.println("grade: " + instance5.grade);
		System.out.println("yearOccurred: " + instance5.yearOccurred);
		System.out.println("damageArea: " + instance5.damageArea);
		System.out.println("type: " + instance5.type);


		instance6.temperature = 700.2;
		instance6.intensity = 3;
		instance6.duration = 15;
		instance6.spreadRate = 0.8f;
		instance6.isControlled = true;
		instance6.hasSmoke = false;
		instance6.grade = 'B';
		instance6.yearOccurred = 2020;
		instance6.damageArea = 20.5;
		instance6.type = "Stove Fire";

		System.out.println("\nInstance6 values");
		System.out.println("temperature: " + instance6.temperature);
		System.out.println("intensity: " + instance6.intensity);
		System.out.println("duration: " + instance6.duration);
		System.out.println("spreadRate: " + instance6.spreadRate);
		System.out.println("isControlled: " + instance6.isControlled);
		System.out.println("hasSmoke: " + instance6.hasSmoke);
		System.out.println("grade: " + instance6.grade);
		System.out.println("yearOccurred: " + instance6.yearOccurred);
		System.out.println("damageArea: " + instance6.damageArea);
		System.out.println("type: " + instance6.type);


		instance7.temperature = 920.4;
		instance7.intensity = 7;
		instance7.duration = 50;
		instance7.spreadRate = 1.8f;
		instance7.isControlled = false;
		instance7.hasSmoke = true;
		instance7.grade = 'A';
		instance7.yearOccurred = 2023;
		instance7.damageArea = 90.3;
		instance7.type = "Forest Fire";

		System.out.println("\nInstance7 values");
		System.out.println("temperature: " + instance7.temperature);
		System.out.println("intensity: " + instance7.intensity);
		System.out.println("duration: " + instance7.duration);
		System.out.println("spreadRate: " + instance7.spreadRate);
		System.out.println("isControlled: " + instance7.isControlled);
		System.out.println("hasSmoke: " + instance7.hasSmoke);
		System.out.println("grade: " + instance7.grade);
		System.out.println("yearOccurred: " + instance7.yearOccurred);
		System.out.println("damageArea: " + instance7.damageArea);
		System.out.println("type: " + instance7.type);


		instance8.temperature = 780.0;
		instance8.intensity = 4;
		instance8.duration = 25;
		instance8.spreadRate = 1.1f;
		instance8.isControlled = true;
		instance8.hasSmoke = false;
		instance8.grade = 'B';
		instance8.yearOccurred = 2022;
		instance8.damageArea = 40.0;
		instance8.type = "Gas Fire";

		System.out.println("\nInstance8 values");
		System.out.println("temperature: " + instance8.temperature);
		System.out.println("intensity: " + instance8.intensity);
		System.out.println("duration: " + instance8.duration);
		System.out.println("spreadRate: " + instance8.spreadRate);
		System.out.println("isControlled: " + instance8.isControlled);
		System.out.println("hasSmoke: " + instance8.hasSmoke);
		System.out.println("grade: " + instance8.grade);
		System.out.println("yearOccurred: " + instance8.yearOccurred);
		System.out.println("damageArea: " + instance8.damageArea);
		System.out.println("type: " + instance8.type);


		instance9.temperature = 1100.0;
		instance9.intensity = 9;
		instance9.duration = 70;
		instance9.spreadRate = 2.5f;
		instance9.isControlled = false;
		instance9.hasSmoke = true;
		instance9.grade = 'A';
		instance9.yearOccurred = 2024;
		instance9.damageArea = 150.0;
		instance9.type = "Industrial Fire";

		System.out.println("\nInstance9 values");
		System.out.println("temperature: " + instance9.temperature);
		System.out.println("intensity: " + instance9.intensity);
		System.out.println("duration: " + instance9.duration);
		System.out.println("spreadRate: " + instance9.spreadRate);
		System.out.println("isControlled: " + instance9.isControlled);
		System.out.println("hasSmoke: " + instance9.hasSmoke);
		System.out.println("grade: " + instance9.grade);
		System.out.println("yearOccurred: " + instance9.yearOccurred);
		System.out.println("damageArea: " + instance9.damageArea);
		System.out.println("type: " + instance9.type);


		instance10.temperature = 650.5;
		instance10.intensity = 2;
		instance10.duration = 10;
		instance10.spreadRate = 0.5f;
		instance10.isControlled = true;
		instance10.hasSmoke = false;
		instance10.grade = 'C';
		instance10.yearOccurred = 2019;
		instance10.damageArea = 10.0;
		instance10.type = "Candle Fire";

		System.out.println("\nInstance10 values");
		System.out.println("temperature: " + instance10.temperature);
		System.out.println("intensity: " + instance10.intensity);
		System.out.println("duration: " + instance10.duration);
		System.out.println("spreadRate: " + instance10.spreadRate);
		System.out.println("isControlled: " + instance10.isControlled);
		System.out.println("hasSmoke: " + instance10.hasSmoke);
		System.out.println("grade: " + instance10.grade);
		System.out.println("yearOccurred: " + instance10.yearOccurred);
		System.out.println("damageArea: " + instance10.damageArea);
		System.out.println("type: " + instance10.type);
				
}
}
		