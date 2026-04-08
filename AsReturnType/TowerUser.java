class TowerUser{
	
	public Tower towerInfo(){
		
		System.out.println("Running a method with class as return type");
		
		Tower refTower=new Tower();
		
		refTower.name="Sky Tower";
		refTower.height=300;
		refTower.hasLift=true;
	
		return refTower;
		
		}
}


