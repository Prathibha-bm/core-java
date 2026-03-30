class EthernetRunner{
	
	public static void main(String[] args){
		
		 Ethernet instance1=new  Ethernet();
		 Ethernet instance2=new  Ethernet();
		 Ethernet instance3=new  Ethernet();
		 Ethernet instance4=new  Ethernet();
		 Ethernet instance5=new  Ethernet();
		 Ethernet instance6=new  Ethernet();
		 Ethernet instance7=new  Ethernet();
		 Ethernet instance8=new  Ethernet();
		 Ethernet instance9=new  Ethernet();
		 Ethernet instance10=new  Ethernet();
		
		System.out.println("\nInstance1 values");
        System.out.println("connectorType:" + instance1.connectorType);
        System.out.println("isShielded: " + instance1.isShielded);
        System.out.println("maxFrequency: " + instance1.maxFrequency);
        System.out.println("temperatureRange: " + instance1.temperatureRange);
        System.out.println("price: " + instance1.price);

        System.out.println("\nInstance2 values");
        System.out.println("connectorType:"+ instance2.connectorType);
        System.out.println("isShielded: " + instance2.isShielded);
        System.out.println("maxFrequency: " + instance2.maxFrequency);
        System.out.println("temperatureRange: " + instance2.temperatureRange);
        System.out.println("price: " + instance2.price);

        System.out.println("\nInstance3 values");
        System.out.println("connectorType: " + instance3.connectorType);
        System.out.println("isShielded: " + instance3.isShielded);
        System.out.println("maxFrequency: " + instance3.maxFrequency);
        System.out.println("temperatureRange: " + instance3.temperatureRange);
        System.out.println("price: " + instance3.price);

        System.out.println("\nInstance4 values");
        System.out.println("connectorType: " + instance4.connectorType);
        System.out.println("isShielded: " + instance4.isShielded);
        System.out.println("maxFrequency: " + instance4.maxFrequency);
        System.out.println("temperatureRange: " + instance4.temperatureRange);
        System.out.println("price: " + instance4.price);

        System.out.println("\nInstance5 values");
        System.out.println("connectorType: " + instance5.connectorType);
        System.out.println("isShielded: " + instance5.isShielded);
        System.out.println("maxFrequency: " + instance5.maxFrequency);
        System.out.println("temperatureRange: " + instance5.temperatureRange);
        System.out.println("price: " + instance5.price);
		
		System.out.println("\nInstance6 values");
        System.out.println("connectorType: " + instance1.connectorType);
        System.out.println("isShielded: " + instance1.isShielded);
        System.out.println("maxFrequency: " + instance1.maxFrequency);
        System.out.println("temperatureRange: " + instance1.temperatureRange);
        System.out.println("price: " + instance1.price);

        System.out.println("\nInstance7 values");
        System.out.println("connectorType: " + instance2.connectorType);
        System.out.println("isShielded: " + instance2.isShielded);
        System.out.println("maxFrequency: " + instance2.maxFrequency);
        System.out.println("temperatureRange: " + instance2.temperatureRange);
        System.out.println("price: " + instance2.price);

        System.out.println("\nInstance8 values");
        System.out.println("connectorType: " + instance3.connectorType);
        System.out.println("isShielded: " + instance3.isShielded);
        System.out.println("maxFrequency: " + instance3.maxFrequency);
        System.out.println("temperatureRange: " + instance3.temperatureRange);
        System.out.println("price: " + instance3.price);

        System.out.println("\nInstance9 values");
        System.out.println("connectorType: " + instance4.connectorType);
        System.out.println("isShielded: " + instance4.isShielded);
        System.out.println("maxFrequency: " + instance4.maxFrequency);
        System.out.println("temperatureRange: " + instance4.temperatureRange);
        System.out.println("price: " + instance4.price);

        System.out.println("\nInstance10 values");
        System.out.println("connectorType: " + instance5.connectorType);
        System.out.println("isShielded: " + instance5.isShielded);
        System.out.println("maxFrequency: " + instance5.maxFrequency);
        System.out.println("temperatureRange: " + instance5.temperatureRange);
        System.out.println("price: " + instance5.price);
		
	
		instance1.speed = 1000;
		instance1.cableLength = 5.0f;
		instance1.weight = 0.2;
		instance1.numberOfPorts = 1;
		instance1.isConnected = true;
		instance1.supportsPoE = false;
		instance1.grade = 'A';
		instance1.manufactureYear = 2023;
		instance1.bandwidth = 100;
		instance1.type = "Cat6";

		System.out.println("\nInstance1 values");
		System.out.println("speed: " + instance1.speed);
		System.out.println("cableLength: " + instance1.cableLength);
		System.out.println("weight: " + instance1.weight);
		System.out.println("numberOfPorts: " + instance1.numberOfPorts);
		System.out.println("isConnected: " + instance1.isConnected);
		System.out.println("supportsPoE: " + instance1.supportsPoE);
		System.out.println("grade: " + instance1.grade);
		System.out.println("manufactureYear: " + instance1.manufactureYear);
		System.out.println("bandwidth: " + instance1.bandwidth);
		System.out.println("type: " + instance1.type);


		instance2.speed = 100;
		instance2.cableLength = 3.0f;
		instance2.weight = 0.15;
		instance2.numberOfPorts = 1;
		instance2.isConnected = false;
		instance2.supportsPoE = false;
		instance2.grade = 'B';
		instance2.manufactureYear = 2022;
		instance2.bandwidth = 50;
		instance2.type = "Cat5";

		System.out.println("\nInstance2 values");
		System.out.println("speed: " + instance2.speed);
		System.out.println("cableLength: " + instance2.cableLength);
		System.out.println("weight: " + instance2.weight);
		System.out.println("numberOfPorts: " + instance2.numberOfPorts);
		System.out.println("isConnected: " + instance2.isConnected);
		System.out.println("supportsPoE: " + instance2.supportsPoE);
		System.out.println("grade: " + instance2.grade);
		System.out.println("manufactureYear: " + instance2.manufactureYear);
		System.out.println("bandwidth: " + instance2.bandwidth);
		System.out.println("type: " + instance2.type);


		instance3.speed = 10000;
		instance3.cableLength = 10.0f;
		instance3.weight = 0.3;
		instance3.numberOfPorts = 2;
		instance3.isConnected = true;
		instance3.supportsPoE = true;
		instance3.grade = 'A';
		instance3.manufactureYear = 2024;
		instance3.bandwidth = 500;
		instance3.type = "Cat7";

		System.out.println("\nInstance3 values");
		System.out.println("speed: " + instance3.speed);
		System.out.println("cableLength: " + instance3.cableLength);
		System.out.println("weight: " + instance3.weight);
		System.out.println("numberOfPorts: " + instance3.numberOfPorts);
		System.out.println("isConnected: " + instance3.isConnected);
		System.out.println("supportsPoE: " + instance3.supportsPoE);
		System.out.println("grade: " + instance3.grade);
		System.out.println("manufactureYear: " + instance3.manufactureYear);
		System.out.println("bandwidth: " + instance3.bandwidth);
		System.out.println("type: " + instance3.type);


		instance4.speed = 100;
		instance4.cableLength = 2.0f;
		instance4.weight = 0.1;
		instance4.numberOfPorts = 1;
		instance4.isConnected = false;
		instance4.supportsPoE = false;
		instance4.grade = 'C';
		instance4.manufactureYear = 2021;
		instance4.bandwidth = 20;
		instance4.type = "Cat5";

		System.out.println("\nInstance4 values");
		System.out.println("speed: " + instance4.speed);
		System.out.println("cableLength: " + instance4.cableLength);
		System.out.println("weight: " + instance4.weight);
		System.out.println("numberOfPorts: " + instance4.numberOfPorts);
		System.out.println("isConnected: " + instance4.isConnected);
		System.out.println("supportsPoE: " + instance4.supportsPoE);
		System.out.println("grade: " + instance4.grade);
		System.out.println("manufactureYear: " + instance4.manufactureYear);
		System.out.println("bandwidth: " + instance4.bandwidth);
		System.out.println("type: " + instance4.type);


		instance5.speed = 1000;
		instance5.cableLength = 15.0f;
		instance5.weight = 0.4;
		instance5.numberOfPorts = 2;
		instance5.isConnected = true;
		instance5.supportsPoE = true;
		instance5.grade = 'A';
		instance5.manufactureYear = 2025;
		instance5.bandwidth = 200;
		instance5.type = "Cat6";

		System.out.println("\nInstance5 values");
		System.out.println("speed: " + instance5.speed);
		System.out.println("cableLength: " + instance5.cableLength);
		System.out.println("weight: " + instance5.weight);
		System.out.println("numberOfPorts: " + instance5.numberOfPorts);
		System.out.println("isConnected: " + instance5.isConnected);
		System.out.println("supportsPoE: " + instance5.supportsPoE);
		System.out.println("grade: " + instance5.grade);
		System.out.println("manufactureYear: " + instance5.manufactureYear);
		System.out.println("bandwidth: " + instance5.bandwidth);
		System.out.println("type: " + instance5.type);


		instance6.speed = 100;
		instance6.cableLength = 4.0f;
		instance6.weight = 0.18;
		instance6.numberOfPorts = 1;
		instance6.isConnected = true;
		instance6.supportsPoE = false;
		instance6.grade = 'B';
		instance6.manufactureYear = 2020;
		instance6.bandwidth = 40;
		instance6.type = "Cat5";

		System.out.println("\nInstance6 values");
		System.out.println("speed: " + instance6.speed);
		System.out.println("cableLength: " + instance6.cableLength);
		System.out.println("weight: " + instance6.weight);
		System.out.println("numberOfPorts: " + instance6.numberOfPorts);
		System.out.println("isConnected: " + instance6.isConnected);
		System.out.println("supportsPoE: " + instance6.supportsPoE);
		System.out.println("grade: " + instance6.grade);
		System.out.println("manufactureYear: " + instance6.manufactureYear);
		System.out.println("bandwidth: " + instance6.bandwidth);
		System.out.println("type: " + instance6.type);


		instance7.speed = 2500;
		instance7.cableLength = 8.0f;
		instance7.weight = 0.25;
		instance7.numberOfPorts = 2;
		instance7.isConnected = true;
		instance7.supportsPoE = true;
		instance7.grade = 'A';
		instance7.manufactureYear = 2023;
		instance7.bandwidth = 300;
		instance7.type = "Cat6";

		System.out.println("\nInstance7 values");
		System.out.println("speed: " + instance7.speed);
		System.out.println("cableLength: " + instance7.cableLength);
		System.out.println("weight: " + instance7.weight);
		System.out.println("numberOfPorts: " + instance7.numberOfPorts);
		System.out.println("isConnected: " + instance7.isConnected);
		System.out.println("supportsPoE: " + instance7.supportsPoE);
		System.out.println("grade: " + instance7.grade);
		System.out.println("manufactureYear: " + instance7.manufactureYear);
		System.out.println("bandwidth: " + instance7.bandwidth);
		System.out.println("type: " + instance7.type);


		instance8.speed = 1000;
		instance8.cableLength = 6.0f;
		instance8.weight = 0.22;
		instance8.numberOfPorts = 1;
		instance8.isConnected = false;
		instance8.supportsPoE = false;
		instance8.grade = 'B';
		instance8.manufactureYear = 2022;
		instance8.bandwidth = 120;
		instance8.type = "Cat6";

		System.out.println("\nInstance8 values");
		System.out.println("speed: " + instance8.speed);
		System.out.println("cableLength: " + instance8.cableLength);
		System.out.println("weight: " + instance8.weight);
		System.out.println("numberOfPorts: " + instance8.numberOfPorts);
		System.out.println("isConnected: " + instance8.isConnected);
		System.out.println("supportsPoE: " + instance8.supportsPoE);
		System.out.println("grade: " + instance8.grade);
		System.out.println("manufactureYear: " + instance8.manufactureYear);
		System.out.println("bandwidth: " + instance8.bandwidth);
		System.out.println("type: " + instance8.type);


		instance9.speed = 10000;
		instance9.cableLength = 20.0f;
		instance9.weight = 0.5;
		instance9.numberOfPorts = 4;
		instance9.isConnected = true;
		instance9.supportsPoE = true;
		instance9.grade = 'A';
		instance9.manufactureYear = 2024;
		instance9.bandwidth = 800;
		instance9.type = "Cat8";

		System.out.println("\nInstance9 values");
		System.out.println("speed: " + instance9.speed);
		System.out.println("cableLength: " + instance9.cableLength);
		System.out.println("weight: " + instance9.weight);
		System.out.println("numberOfPorts: " + instance9.numberOfPorts);
		System.out.println("isConnected: " + instance9.isConnected);
		System.out.println("supportsPoE: " + instance9.supportsPoE);
		System.out.println("grade: " + instance9.grade);
		System.out.println("manufactureYear: " + instance9.manufactureYear);
		System.out.println("bandwidth: " + instance9.bandwidth);
		System.out.println("type: " + instance9.type);


		instance10.speed = 10;
		instance10.cableLength = 1.5f;
		instance10.weight = 0.08;
		instance10.numberOfPorts = 1;
		instance10.isConnected = false;
		instance10.supportsPoE = false;
		instance10.grade = 'C';
		instance10.manufactureYear = 2019;
		instance10.bandwidth = 10;
		instance10.type = "Cat3";

		System.out.println("\nInstance10 values");
		System.out.println("speed: " + instance10.speed);
		System.out.println("cableLength: " + instance10.cableLength);
		System.out.println("weight: " + instance10.weight);
		System.out.println("numberOfPorts: " + instance10.numberOfPorts);
		System.out.println("isConnected: " + instance10.isConnected);
		System.out.println("supportsPoE: " + instance10.supportsPoE);
		System.out.println("grade: " + instance10.grade);
		System.out.println("manufactureYear: " + instance10.manufactureYear);
		System.out.println("bandwidth: " + instance10.bandwidth);
		System.out.println("type: " + instance10.type);
}
}