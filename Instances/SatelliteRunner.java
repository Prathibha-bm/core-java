class SatelliteRunner{
	public static void main(String[] args){
		
		Satellite instance1=new Satellite();
		Satellite instance2=new Satellite();
		Satellite instance3=new Satellite();
		Satellite instance4=new Satellite();
		Satellite instance5=new Satellite();
		Satellite instance6=new Satellite();
		Satellite instance7=new Satellite();
		Satellite instance8=new Satellite();
		Satellite instance9=new Satellite();
		Satellite instance10=new Satellite();
		
		System.out.println("\nInstance1 values");
        System.out.println("country:" + instance1.country);
        System.out.println("hasSolarPanels: " + instance1.hasSolarPanels);
        System.out.println("numberOfTransponders: " + instance1.numberOfTransponders);
        System.out.println("fuelCapacity: " + instance1.fuelCapacity);
        System.out.println("lifespan: " + instance1.lifespan);

        System.out.println("\nInstance2 values");
        System.out.println("country:"+ instance2.country);
        System.out.println("hasSolarPanels: " + instance2.hasSolarPanels);
        System.out.println("numberOfTransponders: " + instance2.numberOfTransponders);
        System.out.println("fuelCapacity: " + instance2.fuelCapacity);
        System.out.println("lifespan: " + instance2.lifespan);

        System.out.println("\nInstance3 values");
        System.out.println("country: " + instance3.country);
        System.out.println("hasSolarPanels: " + instance3.hasSolarPanels);
        System.out.println("numberOfTransponders: " + instance3.numberOfTransponders);
        System.out.println("fuelCapacity: " + instance3.fuelCapacity);
        System.out.println("lifespan: " + instance3.lifespan);

        System.out.println("\nInstance4 values");
        System.out.println("country: " + instance4.country);
        System.out.println("hasSolarPanels: " + instance4.hasSolarPanels);
        System.out.println("numberOfTransponders: " + instance4.numberOfTransponders);
        System.out.println("fuelCapacity: " + instance4.fuelCapacity);
        System.out.println("lifespan: " + instance4.lifespan);

        System.out.println("\nInstance5 values");
        System.out.println("country: " + instance5.country);
        System.out.println("hasSolarPanels: " + instance5.hasSolarPanels);
        System.out.println("numberOfTransponders: " + instance5.numberOfTransponders);
        System.out.println("fuelCapacity: " + instance5.fuelCapacity);
        System.out.println("lifespan: " + instance5.lifespan);
		
		System.out.println("\nInstance6 values");
        System.out.println("country: " + instance1.country);
        System.out.println("hasSolarPanels: " + instance1.hasSolarPanels);
        System.out.println("numberOfTransponders: " + instance1.numberOfTransponders);
        System.out.println("fuelCapacity: " + instance1.fuelCapacity);
        System.out.println("lifespan: " + instance1.lifespan);

        System.out.println("\nInstance7 values");
        System.out.println("country: " + instance2.country);
        System.out.println("hasSolarPanels: " + instance2.hasSolarPanels);
        System.out.println("numberOfTransponders: " + instance2.numberOfTransponders);
        System.out.println("fuelCapacity: " + instance2.fuelCapacity);
        System.out.println("lifespan: " + instance2.lifespan);

        System.out.println("\nInstance8 values");
        System.out.println("country: " + instance3.country);
        System.out.println("hasSolarPanels: " + instance3.hasSolarPanels);
        System.out.println("numberOfTransponders: " + instance3.numberOfTransponders);
        System.out.println("fuelCapacity: " + instance3.fuelCapacity);
        System.out.println("lifespan: " + instance3.lifespan);

        System.out.println("\nInstance9 values");
        System.out.println("country: " + instance4.country);
        System.out.println("hasSolarPanels: " + instance4.hasSolarPanels);
        System.out.println("numberOfTransponders: " + instance4.numberOfTransponders);
        System.out.println("fuelCapacity: " + instance4.fuelCapacity);
        System.out.println("lifespan: " + instance4.lifespan);

        System.out.println("\nInstance10 values");
        System.out.println("country: " + instance5.country);
        System.out.println("hasSolarPanels: " + instance5.hasSolarPanels);
        System.out.println("numberOfTransponders: " + instance5.numberOfTransponders);
        System.out.println("fuelCapacity: " + instance5.fuelCapacity);
        System.out.println("lifespan: " + instance5.lifespan);
		
		
				
			// Instance 1
	instance1.name = "SatOne";
	instance1.weight = 1200.5;
	instance1.orbitHeight = 500.0f;
	instance1.isOperational = true;
	instance1.signalStrength = 75;
	instance1.hasCamera = true;
	instance1.grade = 'A';
	instance1.launchYear = 2023;
	instance1.speed = 7.8f;
	instance1.type = "Communication";

	System.out.println("\nInstance1 values");
	System.out.println("name: " + instance1.name);
	System.out.println("weight: " + instance1.weight);
	System.out.println("orbitHeight: " + instance1.orbitHeight);
	System.out.println("isOperational: " + instance1.isOperational);
	System.out.println("signalStrength: " + instance1.signalStrength);
	System.out.println("hasCamera: " + instance1.hasCamera);
	System.out.println("grade: " + instance1.grade);
	System.out.println("launchYear: " + instance1.launchYear);
	System.out.println("speed: " + instance1.speed);
	System.out.println("type: " + instance1.type);


	// Instance 2
	instance2.name = "GeoSat";
	instance2.weight = 1500.0;
	instance2.orbitHeight = 36000.0f;
	instance2.isOperational = true;
	instance2.signalStrength = 85;
	instance2.hasCamera = false;
	instance2.grade = 'A';
	instance2.launchYear = 2022;
	instance2.speed = 3.1f;
	instance2.type = "Weather";

	System.out.println("\nInstance2 values");
	System.out.println("name: " + instance2.name);
	System.out.println("weight: " + instance2.weight);
	System.out.println("orbitHeight: " + instance2.orbitHeight);
	System.out.println("isOperational: " + instance2.isOperational);
	System.out.println("signalStrength: " + instance2.signalStrength);
	System.out.println("hasCamera: " + instance2.hasCamera);
	System.out.println("grade: " + instance2.grade);
	System.out.println("launchYear: " + instance2.launchYear);
	System.out.println("speed: " + instance2.speed);
	System.out.println("type: " + instance2.type);


	// Instance 3
	instance3.name = "NavStar";
	instance3.weight = 1000.0;
	instance3.orbitHeight = 20000.0f;
	instance3.isOperational = true;
	instance3.signalStrength = 90;
	instance3.hasCamera = false;
	instance3.grade = 'A';
	instance3.launchYear = 2024;
	instance3.speed = 3.9f;
	instance3.type = "Navigation";

	System.out.println("\nInstance3 values");
	System.out.println("name: " + instance3.name);
	System.out.println("weight: " + instance3.weight);
	System.out.println("orbitHeight: " + instance3.orbitHeight);
	System.out.println("isOperational: " + instance3.isOperational);
	System.out.println("signalStrength: " + instance3.signalStrength);
	System.out.println("hasCamera: " + instance3.hasCamera);
	System.out.println("grade: " + instance3.grade);
	System.out.println("launchYear: " + instance3.launchYear);
	System.out.println("speed: " + instance3.speed);
	System.out.println("type: " + instance3.type);


	// Instance 4
	instance4.name = "SpyEye";
	instance4.weight = 900.0;
	instance4.orbitHeight = 600.0f;
	instance4.isOperational = false;
	instance4.signalStrength = 60;
	instance4.hasCamera = true;
	instance4.grade = 'B';
	instance4.launchYear = 2021;
	instance4.speed = 7.5f;
	instance4.type = "Military";

	System.out.println("\nInstance4 values");
	System.out.println("name: " + instance4.name);
	System.out.println("weight: " + instance4.weight);
	System.out.println("orbitHeight: " + instance4.orbitHeight);
	System.out.println("isOperational: " + instance4.isOperational);
	System.out.println("signalStrength: " + instance4.signalStrength);
	System.out.println("hasCamera: " + instance4.hasCamera);
	System.out.println("grade: " + instance4.grade);
	System.out.println("launchYear: " + instance4.launchYear);
	System.out.println("speed: " + instance4.speed);
	System.out.println("type: " + instance4.type);


	// Instance 5
	instance5.name = "DeepSpace1";
	instance5.weight = 2000.0;
	instance5.orbitHeight = 50000.0f;
	instance5.isOperational = true;
	instance5.signalStrength = 70;
	instance5.hasCamera = true;
	instance5.grade = 'A';
	instance5.launchYear = 2025;
	instance5.speed = 10.2f;
	instance5.type = "Research";

	System.out.println("\nInstance5 values");
	System.out.println("name: " + instance5.name);
	System.out.println("weight: " + instance5.weight);
	System.out.println("orbitHeight: " + instance5.orbitHeight);
	System.out.println("isOperational: " + instance5.isOperational);
	System.out.println("signalStrength: " + instance5.signalStrength);
	System.out.println("hasCamera: " + instance5.hasCamera);
	System.out.println("grade: " + instance5.grade);
	System.out.println("launchYear: " + instance5.launchYear);
	System.out.println("speed: " + instance5.speed);
	System.out.println("type: " + instance5.type);


	// Instance 6
	instance6.name = "MiniSat";
	instance6.weight = 500.0;
	instance6.orbitHeight = 400.0f;
	instance6.isOperational = true;
	instance6.signalStrength = 65;
	instance6.hasCamera = false;
	instance6.grade = 'B';
	instance6.launchYear = 2020;
	instance6.speed = 7.6f;
	instance6.type = "Communication";

	System.out.println("\nInstance6 values");
	System.out.println("name: " + instance6.name);
	System.out.println("weight: " + instance6.weight);
	System.out.println("orbitHeight: " + instance6.orbitHeight);
	System.out.println("isOperational: " + instance6.isOperational);
	System.out.println("signalStrength: " + instance6.signalStrength);
	System.out.println("hasCamera: " + instance6.hasCamera);
	System.out.println("grade: " + instance6.grade);
	System.out.println("launchYear: " + instance6.launchYear);
	System.out.println("speed: " + instance6.speed);
	System.out.println("type: " + instance6.type);


	// Instance 7
	instance7.name = "SkyNet";
	instance7.weight = 1300.0;
	instance7.orbitHeight = 800.0f;
	instance7.isOperational = true;
	instance7.signalStrength = 88;
	instance7.hasCamera = true;
	instance7.grade = 'A';
	instance7.launchYear = 2023;
	instance7.speed = 7.7f;
	instance7.type = "Communication";

	System.out.println("\nInstance7 values");
	System.out.println("name: " + instance7.name);
	System.out.println("weight: " + instance7.weight);
	System.out.println("orbitHeight: " + instance7.orbitHeight);
	System.out.println("isOperational: " + instance7.isOperational);
	System.out.println("signalStrength: " + instance7.signalStrength);
	System.out.println("hasCamera: " + instance7.hasCamera);
	System.out.println("grade: " + instance7.grade);
	System.out.println("launchYear: " + instance7.launchYear);
	System.out.println("speed: " + instance7.speed);
	System.out.println("type: " + instance7.type);


	// Instance 8
	instance8.name = "WeatherPro";
	instance8.weight = 1100.0;
	instance8.orbitHeight = 35000.0f;
	instance8.isOperational = true;
	instance8.signalStrength = 82;
	instance8.hasCamera = true;
	instance8.grade = 'A';
	instance8.launchYear = 2022;
	instance8.speed = 3.0f;
	instance8.type = "Weather";

	System.out.println("\nInstance8 values");
	System.out.println("name: " + instance8.name);
	System.out.println("weight: " + instance8.weight);
	System.out.println("orbitHeight: " + instance8.orbitHeight);
	System.out.println("isOperational: " + instance8.isOperational);
	System.out.println("signalStrength: " + instance8.signalStrength);
	System.out.println("hasCamera: " + instance8.hasCamera);
	System.out.println("grade: " + instance8.grade);
	System.out.println("launchYear: " + instance8.launchYear);
	System.out.println("speed: " + instance8.speed);
	System.out.println("type: " + instance8.type);


	// Instance 9
	instance9.name = "SecureSat";
	instance9.weight = 1400.0;
	instance9.orbitHeight = 900.0f;
	instance9.isOperational = true;
	instance9.signalStrength = 78;
	instance9.hasCamera = true;
	instance9.grade = 'B';
	instance9.launchYear = 2024;
	instance9.speed = 7.9f;
	instance9.type = "Military";

	System.out.println("\nInstance9 values");
	System.out.println("name: " + instance9.name);
	System.out.println("weight: " + instance9.weight);
	System.out.println("orbitHeight: " + instance9.orbitHeight);
	System.out.println("isOperational: " + instance9.isOperational);
	System.out.println("signalStrength: " + instance9.signalStrength);
	System.out.println("hasCamera: " + instance9.hasCamera);
	System.out.println("grade: " + instance9.grade);
	System.out.println("launchYear: " + instance9.launchYear);
	System.out.println("speed: " + instance9.speed);
	System.out.println("type: " + instance9.type);


	// Instance 10
	instance10.name = "OldSat";
	instance10.weight = 800.0;
	instance10.orbitHeight = 700.0f;
	instance10.isOperational = false;
	instance10.signalStrength = 50;
	instance10.hasCamera = false;
	instance10.grade = 'C';
	instance10.launchYear = 2018;
	instance10.speed = 7.4f;
	instance10.type = "Communication";

	System.out.println("\nInstance10 values");
	System.out.println("name: " + instance10.name);
	System.out.println("weight: " + instance10.weight);
	System.out.println("orbitHeight: " + instance10.orbitHeight);
	System.out.println("isOperational: " + instance10.isOperational);
	System.out.println("signalStrength: " + instance10.signalStrength);
	System.out.println("hasCamera: " + instance10.hasCamera);
	System.out.println("grade: " + instance10.grade);
	System.out.println("launchYear: " + instance10.launchYear);
	System.out.println("speed: " + instance10.speed);
	System.out.println("type: " + instance10.type);
		
	}
	
}