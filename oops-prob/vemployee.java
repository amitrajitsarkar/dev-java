import java.util.*;

class Employee {
    int emp_id;
    String name, designation;
    double salary;

    Employee(int id, String name, String desig, double sal) {
        this.emp_id = id;
        this.name = name;
        this.designation = desig;
        this.salary = sal;
    }

    void display() {
        System.out.println(emp_id + " " + name + " " + designation + " " + salary);
    }
}

public class vemployee {
    public static void main(String[] args) {
        Vector<Employee> empList = new Vector<>();

        // insert at least one per category
        empList.add(new Employee(1, "A", "Manager", 50000));
        empList.add(new Employee(2, "B", "Secretary", 30000));
        empList.add(new Employee(3, "C", "Clerk", 20000));

        // search
        int searchId = 2;
        for (Employee e : empList) {
            if (e.emp_id == searchId) {
                System.out.println("Found:");
                e.display();
            }
        }

        // add at position
        empList.add(1, new Employee(4, "D", "Clerk", 25000));

        // delete
        empList.remove(0);

        // display all
        System.out.println("All Employees:");
        for (Employee e : empList) {
            e.display();
        }
    }
}