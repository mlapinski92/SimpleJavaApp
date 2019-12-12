package simpleJavaApp.dataBase;

import java.util.List;

public class EmployeeList {

    public static List<Employee> dataBaseList;

    public EmployeeList(List<Employee> dataBaseList) {
        EmployeeList.dataBaseList = dataBaseList;
    }

    public static List<Employee> getDataBaseList() {
        return dataBaseList;
    }

    public static void setDataBaseList(List<Employee> dataBaseList) {
        EmployeeList.dataBaseList = dataBaseList;
    }
}
