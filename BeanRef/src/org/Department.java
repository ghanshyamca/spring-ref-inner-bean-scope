package org;

public class Department {
    private String name;
    private Depot depot;

    public Department(String name, Depot depot) {
        this.name = name;
        this.depot = depot;
    }

    @Override
    public String toString() {
        return "Department[name=" + name + 
                "," + depot + "]";
    }
    
}
