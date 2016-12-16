/**
 * Created by ricks on 16-12-2016.
 */
public class Main {
    public static void main(String args[]) {
        FacadeSalarySystem s = new FacadeSalarySystem();
        s.printAll();
        Employee e = s.search("Jaap");
        s.raiseSalary(e);
        e = s.search("Fred");
        s.raiseSalary(e);
        e = s.search("Hans");
        s.raiseSalary(e);
        s.printAll();
    }
}
