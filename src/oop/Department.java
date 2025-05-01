package oop;

public class Department {

    private String name;
    private Employee[] employees;
    private int count = 0;
    int totalEmployee = 0;

    public Department(int size) {
        employees = new Employee[size];
    }

    public double getAverageSalary() {

        return this.getTotalSalary()/totalEmployee;
    }

    public double getTotalSalary() {
        double totalSalary = 0d;
        try{
            for (Employee employee: employees) {
                totalSalary += employee.getSalary();
                totalEmployee++;
            }
        } catch (NullPointerException e) {
            System.out.println("No Matching Employee found");
        }
        return totalSalary;
    }

    public Employee getEmployee(int id) {
        try{
            for (Employee employee: employees) {
                if (employee.getId() == id) {
//                    System.out.println(employee.toString());
                    return employee;
                }
            }
        } catch (NullPointerException e) {
            System.out.println("No Matching Employee found");
        }
        return null;
    }

    public void addEmployees(Employee employee) {
        //System.out.println("count" + count + "emp length" + employees.length);
        if (count < employees.length) {
            this.employees[count] = employee;
            count++;
        } else {
            System.out.println("Exceeded capacity");
        }
    }

    public Employee[] getEmployees() {
        int actualSize = 0;
        for (Employee e : employees ) {
            if(e!=null) actualSize++;
        }
        Employee[] result = new Employee[actualSize];
        int index = 0;
        for (Employee employee: employees) {
            if (employee != null){
                result[index] = employee;
                index++;
            }
        }
        return result;
    }

    public int getEmployeesCount() {
        return this.getEmployees().length;
    }

    public Department(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Department " + name;
    }
}
