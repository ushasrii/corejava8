package ai.dv.model;

public class ContractEmployee extends Employee {
	private int contractDuration;
	public ContractEmployee() {
		super();
	}

	public ContractEmployee(int empId, String name,int contractDuration) {
		super(empId, name);
		this.contractDuration=contractDuration;
	}
	public void setContractDuration(int contractDuration) {
		this.contractDuration=contractDuration;
	}
	public int getContractDuration() {
		return contractDuration;
	}

}
