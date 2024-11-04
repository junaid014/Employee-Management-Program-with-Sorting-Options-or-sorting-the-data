import java.util.Comparator;
public class NameDecending implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        String e1=o1.name;
        String e2=o2.name;
        return e2.compareTo(e1);
    }
}