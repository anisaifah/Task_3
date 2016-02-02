//1103130239, Anisa Nur Arifah, IF-38-01
public class Smartphone{
	private int totalApp;
	private int memory;
	private Application[] appList = new Application[10];
	
	public void setMemory(int memory){
		this.memory = memory;
	}
	
	public int getRemainingSize(){
		int temp=0;
		for (int i=0; i<appList.length;i++){
			if(appList[i] != null){
				temp = temp + appList[i].getAppSize();
			}
		}
		return memory-temp;
	}
	public void addApplication(AppStore appStore, int appId){
		Application App = appStore.getApp(appId);
		if (App.getAppSize() <= getRemainingSize()){
			appList[totalApp] = App;
			totalApp++;
		}		
	}
	public String toString(){
		return ("Memory size "+memory+"MB, "+totalApp+" Application installed, remaining memory size : "+getRemainingSize()+ "MB");
	}
}
