package ai.dv.model;

public class ManagingDirector extends Manager {
	private String ta;
	public ManagingDirector() {
		super();
	}

	public ManagingDirector(int empId, String name, String hra,String ta) {
		super(empId, name, hra);
		this.ta=ta;
	}
	
	public void setTa(String ta) {
		this.ta=ta;
	}
	
	public String getTa() {
		return ta;
	}
}
