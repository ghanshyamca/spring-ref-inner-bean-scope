package org;

public class Employee {
    private String name;
    private Depot depot;

    public Employee(String name, Depot depot) {
        this.name = name;
        this.depot = depot;
    }

    @Override
    public String toString() {
        return "Employee[name=" + name + 
                "," + depot + "]";
    }
    
}
