package design;

public class FortuneEmployee {

	/**
	 * FortuneEmployee class has a main methods where you will be able to create Object from
	 * EmployeeInfo class to use fields and attributes.Demonstrate as many methods as possible 
	 * to use with proper business work flow.Think as a Software Architect, Product Designer and 
	 * as a Software Developer.(employee.info.system) package is given as an outline,you need to elaborate
	 * more to design an application that will meet for fortune 500 Employee Information
	 * Services.
	 *
	 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
	 *
	 **/
	public static void main(String[] args) {

		EmployeeInfo emp01 = new EmployeeInfo(01);
		EmployeeInfo emp02 = new EmployeeInfo(02, "Steven");
		EmployeeInfo emp03 = new EmployeeInfo(03, "James", 33, "Marketing", 80000,3);

		emp01.setEmployeeName("Julie");
		emp01.setPerformance(2);
		emp01.setDepartment("IT");
		emp01.setEmployeeAge(23);
		emp01.setSalary(90000);


		emp02.setEmployeeAge(34);
		emp02.setSalary(89000);
		emp02.setPerformance(1.0);
		emp02.setDepartment("R&D");

		System.out.println("Emp02: "+ emp02.getSalary() + emp02.getPerformance());
		EmployeeInfo.calculateEmployeeBonus(emp02.getPerformance(), emp02.getSalary());

	}

}
