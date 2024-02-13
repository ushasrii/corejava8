package ai.dv.ui;

import ai.dv.model.ContractEmployee;
import ai.dv.model.Employee;
import ai.dv.model.Manager;
import ai.dv.model.ManagingDirector;

public class Program29EmployeeApp {

	public static void main(String[] args) {
		Employee employee = new Employee(101,"Usha sree");
		System.out.println(employee.getEmpId()+"\t"+employee.getName());
		
		Manager manager = new Manager(102,"Syamala","HRA");
		System.out.println(manager.getEmpId()+"\t"+manager.getName()+"\t"+manager.getHra());
		
		ManagingDirector managingDirector = new ManagingDirector(103,"Durga","HRA","TA");
		System.out.println(managingDirector.getEmpId()+"\t"+managingDirector.getName()+"\t"+managingDirector.getHra()+"\t"+managingDirector.getTa());
		
		ContractEmployee contractEmployee = new ContractEmployee(104,"Kamala",20);
		System.out.println(contractEmployee.getEmpId()+"\t"+contractEmployee.getName()+"\t"+contractEmployee.getContractDuration());

	}

}
