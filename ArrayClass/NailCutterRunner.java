class NailCutterRunner{
	
	public static void main(String... values){

		NailCutter nailCutter1=new NailCutter("Trim",true,"stainlessSteel");
		nailCutter1.size=Size.MEDIUM;
		nailCutter1.hasFile=true;
		
		NailCutter nailCutter2=new NailCutter("NailWala",false,"stainlessSteel");
		nailCutter2.size=Size.LARGE;
		nailCutter2.hasFile=true;
		
		NailCutter nailCutter3=new NailCutter("Trim2",true,"stainlessSteel");
		nailCutter3.size=Size.SMALL;
		nailCutter3.hasFile=false;
		
		NailCutter[] refNailCutters={nailCutter1,nailCutter2,nailCutter3};
		
		Shop shop=new Shop("Nail master","Bengalore",refNailCutters);
		shop.display();
		}
	}