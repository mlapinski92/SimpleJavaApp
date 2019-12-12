package simpleJavaApp.dataBase;

public class Doctor extends Employee {
    private static final String CODE = "DC";
    private int salary;
    private String school;

    public Doctor(int id, String name, String address, int yearsOfExperience, int salary, String school) {
        super(id, name, address, yearsOfExperience);
        this.salary = salary;
        this.school = school;
    }

    public static String getCODE() {
        return CODE;
    }

    public int getSalary() {
        return salary;
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
