class SolarRunner{
	
 public static void main(String... args){
	 
	 Solar solar=new Solar();
	 solar.material="Silicon";
	 solar.solarPowerLevel=SolarPowerLevel.MEDIUM;
	 
	 SolarPower solarPower = new SolarPower("Rayzon Solar",25);
	 
	 solarPower.type="Water Heater";
	 solarPower.solar=solar;
	 
	 solarPower.info();
	 
	 
 }
}

	 
 