class ThreadRunner{
	
	public static void main(String[] args){
		
	Thread thread=new Thread(100,"Orange");
	
	System.out.println("lengthInMeter : "+thread.lengthInMeter);
	System.out.println("color : "+thread.color);
	}
}