package ai.dv.model;
public class Manager extends Employee {
	private String hra;
	public Manager() {
		super();
	}

	public Manager(int empId, String name, String hra) {
		super(empId, name);
		this.hra=hra;
	}
	
	public void setHra(String hra) {
		this.hra=hra;
	}
	public String getHra() {
		return hra;
	}

}
