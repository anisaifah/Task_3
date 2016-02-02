//1103130239,Anisa Nur Arifah, IF-38-01
public class Project{
	private String projectName;
	private Member[] teamMember = new Member[5];
	private int nTeam;
	private boolean releaseStatus = false;
	
	public Project (String projectName){
		this.projectName = projectName;
	}
	public void addMember(Member m){
		if (nTeam < teamMember.length){
			teamMember[nTeam] = m;
			nTeam++;
		}
	}
	
	public boolean isReleased(){
		return releaseStatus;
	}
	public void releaseApp(){
		releaseStatus = true;
	}
	
	public String toString(){
		if (releaseStatus == true){
			return ("Project "+projectName+" status is Released with team member of "+nTeam);
		}
		else
			return ("Project "+projectName+" status is in progress with team member of "+nTeam);
		
	}	
} 
