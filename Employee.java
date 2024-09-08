public class Employee implements Comparable<Employee> {
    String name;
    int id;
    double salary;
    Employee(String name,int id,double salary){
        this.name=name;
        this.id=id;
        this.salary=salary;
    }
    public String toString(){
        return "\tname ="+name+"\t id "+id+"\t salary "+salary;
    }

    @Override
    public int compareTo(Employee o) {
        return o.id-this.id;
    }
}
