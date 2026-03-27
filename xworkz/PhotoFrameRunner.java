class PhotoFrameRunner{
	
	public static void main(String[] args){
		PhotoFrame instance1=new PhotoFrame();
		PhotoFrame instance2=new PhotoFrame();
		PhotoFrame instance3=new PhotoFrame();
		PhotoFrame instance4=new PhotoFrame();
		PhotoFrame instance5=new PhotoFrame();

		System.out.println("\nDeafult value\n");
		System.out.println("Length: "+instance1.length);
		System.out.println("width: "+instance2.width);
		System.out.println("width: "+instance3.color);
		System.out.println("width: "+instance4.shape);
		System.out.println("width: "+instance5.isWooden);
		
		instance1.length=18.8;
		instance2.width=8.1;
		instance3.color="Black";
		instance4.shape="square";
		instance5.isWooden=true;
		
		
		System.out.println("\nDeafult value\n");
		System.out.println("Length: "+ instance1.length);
		System.out.println("width: "+instance2.width);
		System.out.println("width: "+instance3.color);
		System.out.println("width: "+instance4.shape);
		System.out.println("width: "+instance5.isWooden);
		
	}
}