class GunModels{
	
	public static void main(String[] args){
		
		String modelName1="Glock 17";
		String modelName2="Colt M1911";
		String modelName3="Beretta 92FS";
		String modelName4="Desert Eagle";
		String modelName5="SIG Sauer P320 ";
		String modelName6="Smith & Wesson Model 29 ";
		String modelName7="Walther PPK";
		String modelName8="Luger P08";
		String modelName9="Walther PPK";
		String modelName10="Colt Python";
		String modelName11="Luger P08 –";
		String modelName12="CZ 75";
		String modelName13="AK-47";
		String modelName14="M16 ";
		String modelName15="Steyr AUG ";
		String modelName16="AR 15";
		String modelName17="Steyr AUG ";
		String modelName18="Heckler & Koch G36";
		String modelName19="FN SCAR";
		String modelName20="Tavor TAR-21";
		String modelName21="M4 Carbine";
		String modelName22="SIG MCX";
		String modelName23="MP5";
		String modelName24="Uzi";
		String modelName25="Thompson ";
		String modelName26="Barrett M82";
		String modelName27="Remington 700";
		String modelName28="Benelli M4";
		String modelName29="Mossberg 500";
		String modelName30="Remington 870";


			String[] modelsName={modelName1,modelName2,modelName3,modelName4,modelName5,modelName6,modelName7,modelName8,modelName9,modelName10,modelName11,modelName12,modelName13,modelName14,modelName15,modelName16,modelName17,modelName18,modelName19,modelName20,modelName21,modelName22,modelName23,modelName24,modelName25,modelName26,modelName27,modelName28,modelName29,modelName30};
			
			modelsName[5]="International L115A3";
			
			for(int model=0;model<=29;model++){
			System.out.println(modelsName[model]);
			}
			
			System.out.println("\n Reverse :\n");
			
			for(int model=29;model>=0;model--){
			System.out.println(modelsName[model]);
			}
			
			String item2=modelsName[36];	
			
		}
}
