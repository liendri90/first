package ru.itis.inf403.lab09;

public class GermanShepherd extends Dog{
    private String workingRole;

    public GermanShepherd(String name, int age) {
        super(name, age, "German Shepherd");
        this.workingRole = "Police or Guard Dog"; // Служебная роль по умолчанию
    }

    public String getWorkingRole() {
        return workingRole;
    }

    public void setWorkingRole(String workingRole) {
        this.workingRole = workingRole;
    }

    public void makeSound() {
        System.out.println("German Shepherd barks loudly!");
    }

    public String getInfo() {
        return super.getInfo() + ", Working Role: " + workingRole;
    }
}


