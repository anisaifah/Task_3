//1103130239, Anisa Nur Arifah, IF-38-01
public class Application{
	private String appName;
	private int appSize;
	
	public Application(String appName, int appSize){
		this.appName = appName;
		this.appSize = appSize;
	}
	
	public String getAppName(){
		return appName;
	}
	public int getAppSize(){
		return appSize;
	}
	public String toString(){
		return("Application Name : "+appName+", with size : "+appSize+ "MB");
	}
}
