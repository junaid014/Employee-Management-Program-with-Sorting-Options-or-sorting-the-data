import java.util.Comparator;

public class iddecending implements Comparator<Employee> {
    public int compare(Employee m,Employee q){
        if(m.id-q.id==0){
            return 0;
        }else if(m.id-q.id<0){
            return 1;
        }
        return m.id-q.id;


    }
}

