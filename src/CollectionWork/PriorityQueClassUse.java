package CollectionWork;

import java.util.*;

class Employee {
    String name;
    int Salary;

    public Employee(String name, int salary) {
        this.name = name;
        Salary = salary;
    }

    @Override
    public String toString() {
        return "Employee Name=" + name + "   Employee Salary: " + Salary;
    }
}

class EmplyeeComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee e1, Employee e2) {
        return e2.Salary - e1.Salary;
    }
}

public class PriorityQueClassUse {
    public static void main(String[] args) {
        //  priorityQueueUse();
       // priorityQueueWithComparitor();
        retriveElementInSortedOrder();
    }

    public static void priorityQueueUse() {
        PriorityQueue pe = new PriorityQueue<>();
        pe.add(900);
        pe.add(90);
        pe.add(1200);
        pe.add(10);
        pe.add(10);
        pe.add(130);
        System.out.println("front of the queue :" + pe.poll());// it always be a lowest element in queue because it maintain ascending order
        System.out.println("front of the queue :" + pe.peek());
        System.out.println(pe);
        Iterator it = pe.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    public static void priorityQueueWithComparitor() {
        EmplyeeComparator emplyeeComparator = new EmplyeeComparator();
        PriorityQueue<Employee> pe = new PriorityQueue<Employee>(emplyeeComparator);
        pe.add(new Employee("bharat", 20000));
        pe.add(new Employee("Rakesh", 2000));
        pe.add(new Employee("samrat", 1000));

        System.out.println(pe.poll());
    }

    public static void retriveElementInSortedOrder(){

        ArrayList a1=new ArrayList<>();
        PriorityQueue pe=new PriorityQueue<>();
        pe.add(900);
        pe.add(-90);
        pe.add(1200);
        pe.add(10);
        pe.add(130);

        System.out.println(pe.size());

      Iterator it= pe.iterator();
      while(it.hasNext()){
          a1.add(pe.poll());
      }
        System.out.println(a1);
    }

}

