package simpleJavaApp.dataBase;

public class SoftwareEngineer extends Employee {
    private static final String CODE = "SE";
    private int salary;
    private String school;

    public SoftwareEngineer(int id, String name, String address, int yearsOfExperience, int salary, String school) {
        super(id, name, address, yearsOfExperience);
        this.salary = salary;
        this.school = school;
    }

    public static String getCODE() {
        return CODE;
    }

    public int getSalary() {
        return getYearsOfExperience() * 2000;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }
}
