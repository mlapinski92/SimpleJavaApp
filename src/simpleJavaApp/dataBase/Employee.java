package simpleJavaApp.dataBase;

public class Employee {

    private static int id = 1000;
    private String name;
    private String address;
    private int yearsOfExperience;

    public Employee(int id, String name, String address, int yearsOfExperience) {
        Employee.id = id;
        this.name = name;
        this.address = address;
        this.yearsOfExperience = yearsOfExperience;
    }

    public static int getId() {
        return id++;
    }

    public void setId(short id) {
        Employee.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(short yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }


}
