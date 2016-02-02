//11013130239, Anisa Nur Arifah, IF-38-01
public class AppStore{
	private int totalApp;
	private Application[] appList = new Application[100];
	
	public void createNewApp(String appName, int appSize){
		Application App = new Application(appName, appSize);
		appList[totalApp] = App;
		totalApp++;
	}
	public Application getApp(int id){
		return appList[id];
	}
	public String toString(){
		return (" There are "+totalApp+ "applications ready to install");
	}
}
