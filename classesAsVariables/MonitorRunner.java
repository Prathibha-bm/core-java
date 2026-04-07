class MonitorRunner{
	
	public static void main(String... args){
	
	Monitor monitor=new Monitor();
		monitor.type="Laptop";
		monitor.brand=Brand.HP;
		
	LaptopMonitor laptopMonitor=new LaptopMonitor("HP",76000);
		laptopMonitor.rating=8.7;
		laptopMonitor.monitor=monitor;
	
	laptopMonitor.classAsVariable(monitor);
	
	
	
	}
}