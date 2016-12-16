import java.util.ArrayList;

/**
 * Created by ricks on 16-12-2016.
 */
public class Colleagues {
    private ArrayList empArray = new ArrayList();

    public void addColleague(Employee c) {
        empArray.add(c);
    }

    public Employee search(String s) {
        for (int i = 0; i < empArray.size(); i++)
            if (((Employee)empArray.get(i)).getName().equals(s)) return (Employee)empArray.get(i);
        return new Employee("no employee has been found",-1);
    }

    public ArrayList getEmpArray() {
        return empArray;
    }
}
