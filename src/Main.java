public class Main {
    public static void main(String[] args) {
        EmployeeBook employeeBook = new EmployeeBook();
        Employee[] employees = employeeBook.getEmployee();

        Employee people0 = new Employee("Иванов В.В.", 1, 5000000);
        Employee people1 = new Employee("Фролов А.Н.", 2, 224000);
        Employee people2 = new Employee("Панкратов С.Р.", 3, 127000);
        Employee people3 = new Employee("Пушкин А.С.", 4, 192300);
        Employee people4 = new Employee("Шаров В.В.", 5, 1000);
        Employee people5 = new Employee("Коновалов А.Н.", 1, 22300);
        Employee people6 = new Employee("Катунин С.Р.", 2, 14000);
        Employee people7 = new Employee("Сидякин С.Ф.", 3, 1357000);
        Employee people8 = new Employee("Аверин П.С.", 4, 120000);
        //Employee people9 = new Employee("Сквозьняк Е.С.", 5, 180000);

        employees[0] = people0;
        employees[1] = people1;
        employees[2] = people2;
        employees[3] = people3;
        employees[4] = people4;
        employees[5] = people5;
        employees[6] = people6;
        employees[7] = people7;
        employees[8] = people8;
        //employees[9] = people9;


        employeeBook.printFullData(employees);
        System.out.println(employeeBook.getSalarySumInMonth(employees));
        System.out.println(employeeBook.getMinSalary(employees));
        System.out.println(employeeBook.getMaxSalary(employees));
        System.out.println(employeeBook.getAverageSalary(employees));
        employeeBook.printFullNameList(employees);
        employeeBook.salaryIndexation(employees, 10);
        System.out.println(employeeBook.getMinSalaryInDepartment(employees, 3));
        System.out.println(employeeBook.getMaxSalaryInDepartment(employees, 1));
        System.out.println(employeeBook.getSumSalaryInDepartment(employees, 2));
        System.out.println(employeeBook.getAverageSalaryInDepartment(employees, 2));
        employeeBook.salaryIndexationInDepartment(employees, 1, 10);
        employeeBook.printArrayDepartment(employees, 1);
        employeeBook.findSalaryLessNum(employees, 50000);
        employeeBook.findSalaryGreaterNum(employees, 100000);
        employeeBook.addEmployee("Коротков Г.Р.", 2, 3334222, employees);
        employeeBook.deleteEmployee(11, employees);
        employeeBook.editSalaryEmployee(employees[3].getId(), 9999999, employees);
        employeeBook.editDepartmentEmployee(employees[3].getId(), 3, employees);
        employeeBook.printAllDepartments(employees);
    }

}