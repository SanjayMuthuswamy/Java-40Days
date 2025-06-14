package Day5OOPS.Inheritance.MultilevelInheritance;

public class Project extends Employee {
    private String projectName = "P1 Development";

    public void getProject() {
        System.out.println("Project Name: " + projectName);
    }
}
