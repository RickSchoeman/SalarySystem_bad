/**
 * Created by ricks on 16-12-2016.
 */
public class Salary {

    public void raiseSalary(Employee e) {
        switch (e.getLevel()) {
            case 0:
                e.setSalary(e.getPay() * 105 + 10000);
                e.setSalary(e.getPay() / 100);
                System.out.println("Log message: employee " + e.getName() + " has new salary: " + e.getPay());
                break;
            case 1:
                e.setSalary(e.getPay() * 106+ 20000);
                e.setSalary(e.getPay() / 100);
                System.out.println("Log message: employee " + e.getName() + " has new salary: " + e.getPay());
                break;
            case 2:
                e.setSalary(e.getPay() * 107);
                e.setSalary(e.getPay() / 100);
                System.out.println("Log message: employee " + e.getName() + " has new salary: " + e.getPay());
                break;
        }
    }
}
