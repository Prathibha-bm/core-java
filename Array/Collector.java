class Collector{

	String name;
	int batchNo;
	
	Collector(String name,int batchNo){
		this.name=name;
		this.batchNo=batchNo;
		
	}
	
	void info(){
		
		System.out.println("\nRunning in Collector:");

		System.out.println("Name:"+name);
		System.out.println("batchNo:"+batchNo);
		
			
		}
	}
