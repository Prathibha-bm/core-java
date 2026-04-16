class NewsPaper{
	
	Language lang;
	char paperQuality;
	int price;
	int noOfPages;
	String name;
	double heightInCm;
	double weightInGrams;
	String headerText;
	String footerText;
	int fontSize;
	int noOfImages;
	String headEditor;
	String printHouseAddress;
	Color inkColor;
	int noOfContents;
	
	NewsPaper(Language lang,char paperQuality,int price,int noOfPages,String name,double heightInCm,double weightInGrams,String headerText,String footerText,int fontSize,int noOfImages,String headEditor,String printHouseAddress,Color inkColor,int noOfContents){
		
		this.lang=lang;
		this.paperQuality=paperQuality;
		this.price=price;
		this.noOfPages=noOfPages;
		this.name=name;
		this.heightInCm=heightInCm;
		this.weightInGrams=weightInGrams;
		this.headerText=headerText;
		this.footerText=footerText;
		this.fontSize=fontSize;
		this.noOfImages=noOfImages;
		this.headEditor=headEditor;
		this.printHouseAddress=printHouseAddress;
		this.inkColor=inkColor;
		this.noOfContents=noOfContents;
	}
	
	void info(){
		System.out.println("Running info in Newspaper");

		System.out.println("lang: "+this.lang);
		System.out.println("paperQuality: "+this.paperQuality);
		System.out.println("price: "+this.price);
		System.out.println("noOfPages: "+this.noOfPages);
		System.out.println("name: "+this.name);
		System.out.println("heightInCm: "+this.heightInCm);
		System.out.println("weightInGrams: "+this.weightInGrams);
		System.out.println("headerText: "+this.headerText);
		System.out.println("footerText: "+this.footerText);
		System.out.println("fontSize: "+this.fontSize);
		System.out.println("noOfImages: "+this.noOfImages);
		System.out.println("headEditor: "+this.headEditor);
		System.out.println("printHouseAddress: "+this.printHouseAddress);
		System.out.println("inkColor: "+this.inkColor);
	
		System.out.println("noOfContents: "+this.noOfContents);
		System.out.println("\n\n");
		
		
	}
}