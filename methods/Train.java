class Train{
	
	static void start(){
		System.out.println("Train Start");
		
	}
	static void apllyBreak(){
		System.out.println("Train stop");
		moving();
	}
	
	
	static void moving(){
		System.out.println("moving");
		
	}
	static void signal(){
		System.out.println("waiting");
	}
  static void stop(){
	  System.out.println("Stoped");
  }	
}