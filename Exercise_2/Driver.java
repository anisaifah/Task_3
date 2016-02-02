//1103130239, Anisa Nur Arifah, IF-38-01
public class DriverDua{
	public static void main(String [] args){
		
		StartUp stp = new StartUp();
		Member m = new Member ("Alex");
		stp.addMember(m);
		m = new Member("Beni");
		stp.addMember(m);
		m = new Member("Cakra");
		stp.addMember(m);
		m = new Member("Deni");
		stp.addMember(m);
		m = new Member ("Eric");
		stp.addMember(m);
		
		stp.createNewProject("project 1");
		stp.createNewProject("project 2");
		
		Project pro = stp.getProject(0);
		m = stp.getMember(0);
		stp.setProjectMember(pro,m);
		pro = stp.getProject(1);
		stp.setProjectMember(pro,m);
		
		m = stp.getMember(4);
		pro = stp.getProject(0);
		stp.setProjectMember(pro,m);
		stp.releaseProject(stp.getProject(0));
		
		System.out.println(stp.getMember(0).toString());
		System.out.println(stp.getMember(4).toString());
		System.out.println(stp.getProject(0).toString());
		System.out.println(stp.getProject(1).toString());
		System.out.println("Project has been released : "+stp.getNumReleasedProject());
	}
}
