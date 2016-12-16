

public class FacadeSalarySystem {

	Colleagues c = new Colleagues();
	Salary s = new Salary();

	public FacadeSalarySystem() {
		Employee j = new Employee("Jaap",0);
		Employee m = new Employee("Fred",1);
		Employee s = new Employee("Hans",2);
		j.setSalary(1700.0);
		m.setSalary(2000);
		s.setSalary(2300);
		c.addColleague(j);
		c.addColleague(m);
		c.addColleague(s);
	}

	public void raiseSalary(Employee e){
		s.raiseSalary(e);
	}

	public Employee search(String s){
		return c.search(s);
	}

	public void printAll() {
		for (Object e : c.getEmpArray()) {
			Employee e1 = (Employee)e;
			System.out.print(e1.toString() + "\n");
		}
	}
	
}


