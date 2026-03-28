class JoysticRunner{

	public static void main(String[] args){
		Joystic instance1=new Joystic();
		Joystic instance2=new Joystic();
		Joystic instance3=new Joystic();
		Joystic instance4=new Joystic();
		Joystic instance5=new Joystic();
		
        System.out.println("\nDefault Values");

        System.out.println("\nInstance1");
        System.out.println("xAxis: " + instance1.xAxis);
        System.out.println("yAxis: " + instance1.yAxis);
        System.out.println("ButtonPressed: " + instance1.buttonPressed);
        System.out.println("isConnected: " + instance1.isConnected);
        System.out.println("Sensitivity: " + instance1.sensitivity);

        System.out.println("\nInstance2");
        System.out.println("xAxis: " + instance2.xAxis);
        System.out.println("yAxis: " + instance2.yAxis);
        System.out.println("ButtonPressed: " + instance2.buttonPressed);
        System.out.println("isConnected: " + instance2.isConnected);
        System.out.println("Sensitivity: " + instance2.sensitivity);

        System.out.println("\nInstance3");
        System.out.println("xAxis: " + instance3.xAxis);
        System.out.println("yAxis: " + instance3.yAxis);
        System.out.println("ButtonPressed: " + instance3.buttonPressed);
        System.out.println("isConnected: " + instance3.isConnected);
        System.out.println("Sensitivity: " + instance3.sensitivity);

        System.out.println("\nInstance4");
        System.out.println("xAxis: " + instance4.xAxis);
        System.out.println("yAxis: " + instance4.yAxis);
        System.out.println("ButtonPressed: " + instance4.buttonPressed);
        System.out.println("isConnected: " + instance4.isConnected);
        System.out.println("Sensitivity: " + instance4.sensitivity);

        System.out.println("\nInstance5");
        System.out.println("xAxis: " + instance5.xAxis);
        System.out.println("yAxis: " + instance5.yAxis);
        System.out.println("ButtonPressed: " + instance5.buttonPressed);
        System.out.println("isConnected: " + instance5.isConnected);
        System.out.println("Sensitivity: " + instance5.sensitivity);

        instance1.xAxis = 120;
        instance1.yAxis = 75;
        instance1.buttonPressed = true;
        instance1.isConnected = true;
        instance1.sensitivity = 1.5;

        instance2.xAxis = 90;
        instance2.yAxis = 60;
        instance2.buttonPressed = false;
        instance2.isConnected = true;
        instance2.sensitivity = 1.2;

        instance3.xAxis = 140;
        instance3.yAxis = 80;
        instance3.buttonPressed = true;
        instance3.isConnected = false;
        instance3.sensitivity = 1.8;

        instance4.xAxis = 110;
        instance4.yAxis = 70;
        instance4.buttonPressed = false;
        instance4.isConnected = true;
        instance4.sensitivity = 1.3;

        instance5.xAxis = 130;
        instance5.yAxis = 85;
        instance5.buttonPressed = true;
        instance5.isConnected = false;
        instance5.sensitivity = 2.0;

        System.out.println("\nUpdated Values");

        System.out.println("\nInstance1");
        System.out.println("xAxis: " + instance1.xAxis);
        System.out.println("yAxis: " + instance1.yAxis);
        System.out.println("ButtonPressed: " + instance1.buttonPressed);
        System.out.println("isConnected: " + instance1.isConnected);
        System.out.println("Sensitivity: " + instance1.sensitivity);

        System.out.println("\nInstance2");
        System.out.println("xAxis: " + instance2.xAxis);
        System.out.println("yAxis: " + instance2.yAxis);
        System.out.println("ButtonPressed: " + instance2.buttonPressed);
        System.out.println("isConnected: " + instance2.isConnected);
        System.out.println("Sensitivity: " + instance2.sensitivity);

        System.out.println("\nInstance3");
        System.out.println("xAxis: " + instance3.xAxis);
        System.out.println("yAxis: " + instance3.yAxis);
        System.out.println("ButtonPressed: " + instance3.buttonPressed);
        System.out.println("isConnected: " + instance3.isConnected);
        System.out.println("Sensitivity: " + instance3.sensitivity);

        System.out.println("\nInstance4");
        System.out.println("xAxis: " + instance4.xAxis);
        System.out.println("yAxis: " + instance4.yAxis);
        System.out.println("ButtonPressed: " + instance4.buttonPressed);
        System.out.println("isConnected: " + instance4.isConnected);
        System.out.println("Sensitivity: " + instance4.sensitivity);

        System.out.println("\nInstance5");
        System.out.println("xAxis: " + instance5.xAxis);
        System.out.println("yAxis: " + instance5.yAxis);
        System.out.println("ButtonPressed: " + instance5.buttonPressed);
        System.out.println("isConnected: " + instance5.isConnected);
        System.out.println("Sensitivity: " + instance5.sensitivity);
    }
}