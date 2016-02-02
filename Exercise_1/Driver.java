//1103130239,Anisa Nur Arifah, IF-38-01
public class DriverSatu{
	public static void main (String [] args){
		AppStore Apps = new AppStore();
		Apps.createNewApp("App1",100);
		Apps.createNewApp("App2",200);
		Apps.createNewApp("App3",300);
		Apps.createNewApp("App4",400);
		System.out.println(Apps.toString());
		System.out.println(Apps.getApp(2).toString());
		
		Smartphone sm = new Smartphone();
		sm.setMemory(300);
		System.out.println(sm.toString());
		sm.addApplication(Apps, 1);
		
		System.out.println(sm.toString());
	}
}
