package fr.esipe.thanuchiya.cc.l3pcontrole1;

import java.util.HashSet;
import java.util.Set;

public class Employee {
    private String name;
    private Enum<Category> category;

    private Set<Employee> employees = new HashSet<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Enum<Category> getCategory() {
        return category;
    }

    public void setCategory(Enum<Category> category) {
        this.category = category;
    }

    public Set<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(Set<Employee> employees) {
        this.employees = employees;
    }

    @Override
    public String toString() {
        return name +" ("+ category+")";
    }



    public static void main(String[] args) {
        Employee e = new Employee();
        e.setName("Yvette");


        Employee e1 = new Employee();
        e1.setName("Jean-Patrick");


        Employee e2 = new Employee();
        e2.setName("Jean-Christophe");


        Employee e3 = new Employee();
        e3.setName("Jean-Yves");



        System.out.println(e);
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);
    }

}











