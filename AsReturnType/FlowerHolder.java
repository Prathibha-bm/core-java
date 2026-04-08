class FlowerHolder{
	
	public Flower flowerInfo(){
		
		System.out.println("Running a method with class as return type");
		
		Flower refFlower=new Flower();
		
		refFlower.name="Rose";
		refFlower.color="Red";
		refFlower.hasFragrance=true;
	
		return refFlower;
		
		}
}
