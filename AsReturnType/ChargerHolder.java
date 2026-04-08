class ChargerHolder{
	
	public Charger chargerInfo(){
		
		System.out.println("Running a method with class as return type");
		
		Charger refCharger=new Charger();
		
		refCharger.brand="Samsung";
		refCharger.wattage=25;
		refCharger.isFastCharging=true;
	
		return refCharger;
		
		}
}