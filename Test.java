import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("enter the size of arr: ");
        int ip=input.nextInt();
        Employee []a=new Employee[ip];
        for (int i = 0; i < a.length; i++) {
            System.out.printf("enter %d the name ",i+1);
            String s=input.next();
            System.out.printf("enter %d the salary ",i+1);
            double d=input.nextDouble();
            a[i]=new Employee(s,i+1,d);
        }
        System.out.print("enter the number \n" +
                " 1.sort on Names in Ascending order \n " +
                "2.sort on Names as descending order \n" +
                " 3.sort on id Ascending order\n" +
                " 4.sort on id descending order\n" +
                " 5.sort on Salary Ascending order\n" +
                " 6.sort on Salary descending order\n");
        int q= input.nextInt();
        if(q==1){
            Arrays.sort(a,new NameAccending());
        }
        else if(q==2){
            Arrays.sort(a,new NameDecending());
        }
        else if(q==3){
            Arrays.sort(a,new iddecending());

        }
        else if(q==4){
            Arrays.sort(a);
        } else if (q==5) {
            Arrays.sort(a,new salaryAccending());
        }
        else {
            Arrays.sort(a,new salaryDecending());
        }
        for(Employee e:a){
            System.out.println(e);
        }
    }
}
