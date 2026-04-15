class GloveRun {

	public static void main(String[] args){

		Glove glove1 = new Glove("Leather","M",25.5,300,true,"Sports",8,"Black",true,"Nike");
		Glove glove2 = new Glove("Rubber","L",27.0,250,true,"Medical",9,"Blue",true,"3M");
		Glove glove3 = new Glove("Cotton","S",22.5,150,false,"Household",6,"White",true,"Local");
		Glove glove4 = new Glove("Leather","L",28.0,320,true,"Sports",9,"Brown",true,"Adidas");
		Glove glove5 = new Glove("Rubber","M",26.0,270,true,"Industrial",8,"Black",true,"Honeywell");
		Glove glove6 = new Glove("Cotton","M",24.0,180,false,"Cleaning",5,"White",true,"Local");
		Glove glove7 = new Glove("Leather","S",23.5,200,true,"Sports",7,"Black",true,"Puma");
		Glove glove8 = new Glove("Rubber","XL",29.0,350,true,"Medical",10,"Blue",true,"3M");
		Glove glove9 = new Glove("Cotton","L",25.0,160,false,"Household",6,"White",true,"Local");
		Glove glove10 = new Glove("Leather","M",26.5,310,true,"Sports",8,"Black",true,"Nike");

		GloveStore gloveStore = new GloveStore();

		gloveStore.save(null);
		gloveStore.save(glove1);
		gloveStore.save(glove2);
		gloveStore.save(glove3);
		gloveStore.save(glove4);
		gloveStore.save(glove5);
		gloveStore.save(glove6);
		gloveStore.save(glove7);
		gloveStore.save(glove8);
		gloveStore.save(glove9);
		gloveStore.save(glove10);

		gloveStore.display();
	}
}