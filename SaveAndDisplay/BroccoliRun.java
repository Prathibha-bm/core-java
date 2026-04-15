class BroccoliRun {

	public static void main(String[] args){

		Broccoli broccoli1 = new Broccoli("Green",0.5,"Floral",40,true,"India",8,5.2,"Calabrese",true);
		Broccoli broccoli2 = new Broccoli("Dark Green",0.6,"Floral",45,true,"USA",9,5.5,"Sprouting",true);
		Broccoli broccoli3 = new Broccoli("Light Green",0.4,"Floral",35,false,"China",6,4.8,"Romanesco",true);
		Broccoli broccoli4 = new Broccoli("Green",0.7,"Floral",50,true,"Italy",10,6.0,"Calabrese",true);
		Broccoli broccoli5 = new Broccoli("Dark Green",0.55,"Floral",42,true,"Mexico",7,5.0,"Sprouting",true);
		Broccoli broccoli6 = new Broccoli("Green",0.65,"Floral",48,true,"India",9,5.6,"Romanesco",true);
		Broccoli broccoli7 = new Broccoli("Light Green",0.45,"Floral",38,false,"USA",6,4.9,"Calabrese",true);
		Broccoli broccoli8 = new Broccoli("Green",0.52,"Floral",41,true,"China",8,5.1,"Sprouting",true);
		Broccoli broccoli9 = new Broccoli("Dark Green",0.58,"Floral",44,true,"Italy",9,5.4,"Romanesco",true);
		Broccoli broccoli10 = new Broccoli("Green",0.6,"Floral",47,true,"India",10,5.8,"Calabrese",true);

		BroccoliStore broccoliStore = new BroccoliStore();

		broccoliStore.save(null);
		broccoliStore.save(broccoli1);
		broccoliStore.save(broccoli2);
		broccoliStore.save(broccoli3);
		broccoliStore.save(broccoli4);
		broccoliStore.save(broccoli5);
		broccoliStore.save(broccoli6);
		broccoliStore.save(broccoli7);
		broccoliStore.save(broccoli8);
		broccoliStore.save(broccoli9);
		broccoliStore.save(broccoli10);

		broccoliStore.display();
	}
}