package oopsConcepts.encapsulation;

/*
Encapsulation in java is a mechanism of wrapping the data(variables) and code acting on the data (method) together
as a single unit.
steps to achieve encapsulation
1. Daclare variable of class as private
2.provide public setter and getter method to modify and view the data

note we can access and modified this private values outside the class using getter and setter method.
 */

class PrivateData {

    private int salary;  // it is called data hiding if we use private as access modifier other classes can't acess this data
    private String relation;
    private int age;

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getRelation() {
        return relation;
    }

    public void setRelation(String relation) {
        this.relation = relation;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class EncapsulationExa1 {

    public static void main(String[] args) {
        PrivateData data = new PrivateData();
        data.setAge(90);// set the value using setter method
        System.out.println("age is : " + data.getAge());// get the value using

    }


}




