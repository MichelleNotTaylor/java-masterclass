import model.SalariedEmployee;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        SalariedEmployee salariedEmployee = new SalariedEmployee();
        salariedEmployee.setAnnualSalary(50000);
        salariedEmployee.setEmployeeId(123456789);
        salariedEmployee.setHireDate(LocalDate.of(2020, 1, 1));
        salariedEmployee.setBirthDate(LocalDate.of(1990, 1, 1));
        salariedEmployee.setName("John Doe");

        System.out.println("Employee Age: " + salariedEmployee.getAge());
        salariedEmployee.collectPay();
        salariedEmployee.retire();
        System.out.println("Employee is Retired: " + salariedEmployee.isRetired());
        System.out.println("Employee End Date: " + salariedEmployee.getEndDate());
    }
}