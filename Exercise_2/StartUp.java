//1103130239, Anisa Nur Arifah, IF-38-01
public class StartUp{
	private Member[] member = new Member[50];
	private Project[] projectList = new Project[50];
	private int nMember;
	private int nProject;
	
	public void addMember(Member m){
		member[nMember] = m;
		nMember++;
	}
	
	public Member getMember (int id){
		return member[id];
	}
	public void createNewProject (String projectName){
		Project pro = new Project(projectName);
		projectList [nProject] = pro;
		nProject++;
	}
	
	public Project getProject(int id){
		return projectList[id];
	}
	public void setProjectMember(Project pro, Member m){
		int proWorked = m.getProjectWorked();
		proWorked++;
		pro.addMember(m);
		m.setProjectWorked(proWorked);
	}
	
	public void releaseProject(Project pro){
		pro.releaseApp();
	}
	
	public int getNumReleasedProject(){
		int jml=0;
		int i=0;
		
		while (projectList[i] != null){
			if (projectList[i].isReleased()){
				jml++;
			}
			i++;
		}
		return jml;
	}
}	
