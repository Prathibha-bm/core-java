class ProjectorRunner{
public static void main (String[] args){
	
	    Projector instance1=new Projector();
		Projector instance2=new Projector();
		Projector instance3=new Projector();
		Projector instance4=new Projector();
		Projector instance5=new Projector();
		Projector instance6=new Projector();
		Projector instance7=new Projector();
		Projector instance8=new Projector();
		Projector instance9=new Projector();
		Projector instance10=new Projector();
		
		System.out.println("\nInstance1 values");
        System.out.println("lampLife:" + instance1.lampLife);
        System.out.println("throwDistance: " + instance1.throwDistance);
        System.out.println("hasHDMI: " + instance1.hasHDMI);
        System.out.println("brand: " + instance1.brand);
        System.out.println("price: " + instance1.price);

        System.out.println("\nInstance2 values");
        System.out.println("lampLife:"+ instance2.lampLife);
        System.out.println("throwDistance: " + instance2.throwDistance);
        System.out.println("hasHDMI: " + instance2.hasHDMI);
        System.out.println("brand: " + instance2.brand);
        System.out.println("price: " + instance2.price);

        System.out.println("\nInstance3 values");
        System.out.println("lampLife: " + instance3.lampLife);
        System.out.println("throwDistance: " + instance3.throwDistance);
        System.out.println("hasHDMI: " + instance3.hasHDMI);
        System.out.println("brand: " + instance3.brand);
        System.out.println("price: " + instance3.price);

        System.out.println("\nInstance4 values");
        System.out.println("lampLife: " + instance4.lampLife);
        System.out.println("throwDistance: " + instance4.throwDistance);
        System.out.println("hasHDMI: " + instance4.hasHDMI);
        System.out.println("brand: " + instance4.brand);
        System.out.println("price: " + instance4.price);

        System.out.println("\nInstance5 values");
        System.out.println("lampLife: " + instance5.lampLife);
        System.out.println("throwDistance: " + instance5.throwDistance);
        System.out.println("hasHDMI: " + instance5.hasHDMI);
        System.out.println("brand: " + instance5.brand);
        System.out.println("price: " + instance5.price);
		
		System.out.println("\nInstance6 values");
        System.out.println("lampLife: " + instance1.lampLife);
        System.out.println("throwDistance: " + instance1.throwDistance);
        System.out.println("hasHDMI: " + instance1.hasHDMI);
        System.out.println("brand: " + instance1.brand);
        System.out.println("price: " + instance1.price);

        System.out.println("\nInstance7 values");
        System.out.println("lampLife: " + instance2.lampLife);
        System.out.println("throwDistance: " + instance2.throwDistance);
        System.out.println("hasHDMI: " + instance2.hasHDMI);
        System.out.println("brand: " + instance2.brand);
        System.out.println("price: " + instance2.price);

        System.out.println("\nInstance8 values");
        System.out.println("lampLife: " + instance3.lampLife);
        System.out.println("throwDistance: " + instance3.throwDistance);
        System.out.println("hasHDMI: " + instance3.hasHDMI);
        System.out.println("brand: " + instance3.brand);
        System.out.println("price: " + instance3.price);

        System.out.println("\nInstance9 values");
        System.out.println("lampLife: " + instance4.lampLife);
        System.out.println("throwDistance: " + instance4.throwDistance);
        System.out.println("hasHDMI: " + instance4.hasHDMI);
        System.out.println("brand: " + instance4.brand);
        System.out.println("price: " + instance4.price);

        System.out.println("\nInstance10 values");
        System.out.println("lampLife: " + instance5.lampLife);
        System.out.println("throwDistance: " + instance5.throwDistance);
        System.out.println("hasHDMI: " + instance5.hasHDMI);
        System.out.println("brand: " + instance5.brand);
        System.out.println("price: " + instance5.price);
		
				
		instance1.brightness = 3000;
		instance1.resolution = "1080p";
		instance1.weight = 2.5;
		instance1.numberOfPorts = 2;
		instance1.isWireless = true;
		instance1.supports4K = false;
		instance1.grade = 'A';
		instance1.manufactureYear = 2023;
		instance1.contrastRatio = 15000;
		instance1.type = "Home";

		System.out.println("\nInstance1 values");
		System.out.println("brightness: " + instance1.brightness);
		System.out.println("resolution: " + instance1.resolution);
		System.out.println("weight: " + instance1.weight);
		System.out.println("numberOfPorts: " + instance1.numberOfPorts);
		System.out.println("isWireless: " + instance1.isWireless);
		System.out.println("supports4K: " + instance1.supports4K);
		System.out.println("grade: " + instance1.grade);
		System.out.println("manufactureYear: " + instance1.manufactureYear);
		System.out.println("contrastRatio: " + instance1.contrastRatio);
		System.out.println("type: " + instance1.type);


		instance2.brightness = 3500;
		instance2.resolution = "4K";
		instance2.weight = 3.0;
		instance2.numberOfPorts = 3;
		instance2.isWireless = true;
		instance2.supports4K = true;
		instance2.grade = 'A';
		instance2.manufactureYear = 2024;
		instance2.contrastRatio = 20000;
		instance2.type = "Office";

		System.out.println("\nInstance2 values");
		System.out.println("brightness: " + instance2.brightness);
		System.out.println("resolution: " + instance2.resolution);
		System.out.println("weight: " + instance2.weight);
		System.out.println("numberOfPorts: " + instance2.numberOfPorts);
		System.out.println("isWireless: " + instance2.isWireless);
		System.out.println("supports4K: " + instance2.supports4K);
		System.out.println("grade: " + instance2.grade);
		System.out.println("manufactureYear: " + instance2.manufactureYear);
		System.out.println("contrastRatio: " + instance2.contrastRatio);
		System.out.println("type: " + instance2.type);


		instance3.brightness = 2500;
		instance3.resolution = "720p";
		instance3.weight = 2.0;
		instance3.numberOfPorts = 1;
		instance3.isWireless = false;
		instance3.supports4K = false;
		instance3.grade = 'B';
		instance3.manufactureYear = 2022;
		instance3.contrastRatio = 10000;
		instance3.type = "Portable";

		System.out.println("\nInstance3 values");
		System.out.println("brightness: " + instance3.brightness);
		System.out.println("resolution: " + instance3.resolution);
		System.out.println("weight: " + instance3.weight);
		System.out.println("numberOfPorts: " + instance3.numberOfPorts);
		System.out.println("isWireless: " + instance3.isWireless);
		System.out.println("supports4K: " + instance3.supports4K);
		System.out.println("grade: " + instance3.grade);
		System.out.println("manufactureYear: " + instance3.manufactureYear);
		System.out.println("contrastRatio: " + instance3.contrastRatio);
		System.out.println("type: " + instance3.type);


		instance4.brightness = 4000;
		instance4.resolution = "4K";
		instance4.weight = 3.5;
		instance4.numberOfPorts = 4;
		instance4.isWireless = true;
		instance4.supports4K = true;
		instance4.grade = 'A';
		instance4.manufactureYear = 2025;
		instance4.contrastRatio = 25000;
		instance4.type = "Home Theater";

		System.out.println("\nInstance4 values");
		System.out.println("brightness: " + instance4.brightness);
		System.out.println("resolution: " + instance4.resolution);
		System.out.println("weight: " + instance4.weight);
		System.out.println("numberOfPorts: " + instance4.numberOfPorts);
		System.out.println("isWireless: " + instance4.isWireless);
		System.out.println("supports4K: " + instance4.supports4K);
		System.out.println("grade: " + instance4.grade);
		System.out.println("manufactureYear: " + instance4.manufactureYear);
		System.out.println("contrastRatio: " + instance4.contrastRatio);
		System.out.println("type: " + instance4.type);


		instance5.brightness = 2800;
		instance5.resolution = "1080p";
		instance5.weight = 2.3;
		instance5.numberOfPorts = 2;
		instance5.isWireless = false;
		instance5.supports4K = false;
		instance5.grade = 'B';
		instance5.manufactureYear = 2021;
		instance5.contrastRatio = 12000;
		instance5.type = "Office";

		System.out.println("\nInstance5 values");
		System.out.println("brightness: " + instance5.brightness);
		System.out.println("resolution: " + instance5.resolution);
		System.out.println("weight: " + instance5.weight);
		System.out.println("numberOfPorts: " + instance5.numberOfPorts);
		System.out.println("isWireless: " + instance5.isWireless);
		System.out.println("supports4K: " + instance5.supports4K);
		System.out.println("grade: " + instance5.grade);
		System.out.println("manufactureYear: " + instance5.manufactureYear);
		System.out.println("contrastRatio: " + instance5.contrastRatio);
		System.out.println("type: " + instance5.type);


		instance6.brightness = 2200;
		instance6.resolution = "720p";
		instance6.weight = 1.8;
		instance6.numberOfPorts = 1;
		instance6.isWireless = true;
		instance6.supports4K = false;
		instance6.grade = 'C';
		instance6.manufactureYear = 2020;
		instance6.contrastRatio = 9000;
		instance6.type = "Portable";

		System.out.println("\nInstance6 values");
		System.out.println("brightness: " + instance6.brightness);
		System.out.println("resolution: " + instance6.resolution);
		System.out.println("weight: " + instance6.weight);
		System.out.println("numberOfPorts: " + instance6.numberOfPorts);
		System.out.println("isWireless: " + instance6.isWireless);
		System.out.println("supports4K: " + instance6.supports4K);
		System.out.println("grade: " + instance6.grade);
		System.out.println("manufactureYear: " + instance6.manufactureYear);
		System.out.println("contrastRatio: " + instance6.contrastRatio);
		System.out.println("type: " + instance6.type);


		instance7.brightness = 3600;
		instance7.resolution = "1080p";
		instance7.weight = 2.7;
		instance7.numberOfPorts = 3;
		instance7.isWireless = true;
		instance7.supports4K = false;
		instance7.grade = 'A';
		instance7.manufactureYear = 2023;
		instance7.contrastRatio = 18000;
		instance7.type = "Home";

		System.out.println("\nInstance7 values");
		System.out.println("brightness: " + instance7.brightness);
		System.out.println("resolution: " + instance7.resolution);
		System.out.println("weight: " + instance7.weight);
		System.out.println("numberOfPorts: " + instance7.numberOfPorts);
		System.out.println("isWireless: " + instance7.isWireless);
		System.out.println("supports4K: " + instance7.supports4K);
		System.out.println("grade: " + instance7.grade);
		System.out.println("manufactureYear: " + instance7.manufactureYear);
		System.out.println("contrastRatio: " + instance7.contrastRatio);
		System.out.println("type: " + instance7.type);


		instance8.brightness = 3000;
		instance8.resolution = "1080p";
		instance8.weight = 2.4;
		instance8.numberOfPorts = 2;
		instance8.isWireless = false;
		instance8.supports4K = false;
		instance8.grade = 'B';
		instance8.manufactureYear = 2022;
		instance8.contrastRatio = 14000;
		instance8.type = "Office";

		System.out.println("\nInstance8 values");
		System.out.println("brightness: " + instance8.brightness);
		System.out.println("resolution: " + instance8.resolution);
		System.out.println("weight: " + instance8.weight);
		System.out.println("numberOfPorts: " + instance8.numberOfPorts);
		System.out.println("isWireless: " + instance8.isWireless);
		System.out.println("supports4K: " + instance8.supports4K);
		System.out.println("grade: " + instance8.grade);
		System.out.println("manufactureYear: " + instance8.manufactureYear);
		System.out.println("contrastRatio: " + instance8.contrastRatio);
		System.out.println("type: " + instance8.type);


		instance9.brightness = 4200;
		instance9.resolution = "4K";
		instance9.weight = 3.8;
		instance9.numberOfPorts = 4;
		instance9.isWireless = true;
		instance9.supports4K = true;
		instance9.grade = 'A';
		instance9.manufactureYear = 2025;
		instance9.contrastRatio = 30000;
		instance9.type = "Home Theater";

		System.out.println("\nInstance9 values");
		System.out.println("brightness: " + instance9.brightness);
		System.out.println("resolution: " + instance9.resolution);
		System.out.println("weight: " + instance9.weight);
		System.out.println("numberOfPorts: " + instance9.numberOfPorts);
		System.out.println("isWireless: " + instance9.isWireless);
		System.out.println("supports4K: " + instance9.supports4K);
		System.out.println("grade: " + instance9.grade);
		System.out.println("manufactureYear: " + instance9.manufactureYear);
		System.out.println("contrastRatio: " + instance9.contrastRatio);
		System.out.println("type: " + instance9.type);


		instance10.brightness = 2000;
		instance10.resolution = "720p";
		instance10.weight = 1.5;
		instance10.numberOfPorts = 1;
		instance10.isWireless = false;
		instance10.supports4K = false;
		instance10.grade = 'C';
		instance10.manufactureYear = 2019;
		instance10.contrastRatio = 8000;
		instance10.type = "Portable";

		System.out.println("\nInstance10 values");
		System.out.println("brightness: " + instance10.brightness);
		System.out.println("resolution: " + instance10.resolution);
		System.out.println("weight: " + instance10.weight);
		System.out.println("numberOfPorts: " + instance10.numberOfPorts);
		System.out.println("isWireless: " + instance10.isWireless);
		System.out.println("supports4K: " + instance10.supports4K);
		System.out.println("grade: " + instance10.grade);
		System.out.println("manufactureYear: " + instance10.manufactureYear);
		System.out.println("contrastRatio: " + instance10.contrastRatio);
		System.out.println("type: " + instance10.type);
}
}
