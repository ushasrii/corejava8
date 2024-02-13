package ai.dv.model;

public class Employee {
	private int empId;
	private String name;
	
	
	public Employee(){
		/*default constructor*/
	}
	
	public Employee(int empId,String name) {
		this.empId=empId;
		this.name=name;
	}
	public void setEmpId(int empId) {
		this.empId=empId;
	}
	public int getEmpId() {
		return empId;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	
}
