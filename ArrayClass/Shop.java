class Shop{

String name;
String address;
NailCutter[] nailCutters;

	Shop(String name,String address,NailCutter[] nailCutters){
		this.name=name;
		this.address=address;
		this.nailCutters=nailCutters;
		
	}

	
	void display(){
		
		System.out.println("Name:"+this.name);
		System.out.println("Address:"+this.address);
		System.out.println("nailCutterss:"+this.nailCutters);
		if(nailCutters!=null){
			for(NailCutter nailCutter1:this.nailCutters){
				if (nailCutter1!=null)
				{
					nailCutter1.info();
				}
				else{
			System.out.println("null value");
		}
			}
		
		
		
	   }
}
}


