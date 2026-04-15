class TissueRun {

	public static void main(String[] args){

		Tissue tissue1 = new Tissue("SoftCare",100,"Facial",true,50,0.2,"Rose",false,"White","Paper");
		Tissue tissue2 = new Tissue("CleanX",150,"Napkin",true,70,0.3,"Lemon",false,"White","Paper");
		Tissue tissue3 = new Tissue("FreshTouch",80,"Wet",true,90,0.4,"Aloe",true,"Blue","Cotton");
		Tissue tissue4 = new Tissue("Puff",200,"Facial",true,60,0.25,"Mint",false,"White","Paper");
		Tissue tissue5 = new Tissue("DrySoft",120,"Napkin",true,55,0.22,"None",false,"White","Paper");
		Tissue tissue6 = new Tissue("CarePlus",110,"Wet",true,95,0.35,"Rose",true,"Blue","Cotton");
		Tissue tissue7 = new Tissue("Elite",130,"Facial",true,65,0.28,"Lavender",false,"White","Paper");
		Tissue tissue8 = new Tissue("PureSoft",140,"Napkin",true,75,0.3,"Lemon",false,"White","Paper");
		Tissue tissue9 = new Tissue("Softy",160,"Wet",true,100,0.4,"Aloe",true,"Blue","Cotton");
		Tissue tissue10 = new Tissue("FreshCare",90,"Facial",true,58,0.2,"Mint",false,"White","Paper");

		TissueStore tissueStore = new TissueStore();

		tissueStore.save(null);
		tissueStore.save(tissue1);
		tissueStore.save(tissue2);
		tissueStore.save(tissue3);
		tissueStore.save(tissue4);
		tissueStore.save(tissue5);
		tissueStore.save(tissue6);
		tissueStore.save(tissue7);
		tissueStore.save(tissue8);
		tissueStore.save(tissue9);
		tissueStore.save(tissue10);

		tissueStore.display();
	}
}