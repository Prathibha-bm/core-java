class Screen {

    String brand ;
    String type ;
    double size ;
    String resolution;
    boolean touchSupport ;
    int refreshRate ;
    String panelType ;
    double brightness ;
    boolean antiGlare ;
    String color ;
   
	public Screen(String brand,String type,double size,String resolution,boolean touchSupport,int refreshRate,String panelType,double brightness,boolean antiGlare,String color){
	
	this.brand=brand;
	this.type=type;
	this.size=size;
	this.resolution=resolution;
	this.touchSupport=touchSupport;
	this.refreshRate=refreshRate;
	this.panelType=panelType;
	this.brightness=brightness;
	this.antiGlare=antiGlare;
	this.color=color;
	
	}
	
	void info(){
		System.out.println("brand: "+this.brand);
		System.out.println("type: "+this.type);
		System.out.println("size: "+this.size);
		System.out.println("resolution: "+this.resolution);
		System.out.println("touchSupport: "+this.touchSupport);
		System.out.println("refreshRate: "+this.refreshRate);
		System.out.println("panelType: "+this.panelType);
		System.out.println("brightness: "+this.brightness);
		System.out.println("antiGlare: "+this.antiGlare);
		System.out.println("color: "+this.color);
	}
}