class Days{
	
	public Day dayInfo(){
		
		System.out.println("Running a method with class as return type");
		
		Day refDay=new Day();
		
		refDay.name="Monday";
		refDay.hours=24;
		refDay.isHoliday=false;
	
		return refDay;
		
		}
}

