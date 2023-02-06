public class EmployeeBook {
    private final Employee[] employee = new Employee[10];

    public Employee[] getEmployee() {
        return employee;
    }

    // Получить список всех сотрудников со всеми имеющимися по ним данными
    public void printFullData(Employee[] employees) {
        for (Employee e : employees) {
            if (e == null) {
                continue;
            }
            System.out.println("Имя: " + e.getFullName() + "|" + " Номер отдела: " + e.getDepartment() + " |" + " Зарплата: " + e.getSalary() + " |" + " ID:" + e.getId());
        }
    }

    // Посчитать сумму затрат на зарплаты в месяц.
    public double getSalarySumInMonth(Employee[] employees) {
        int result = 0;

        for (Employee e : employees) {
            if (e == null) {
                continue;
            }
            result += e.getSalary();
        }

        return result;
    }

    // Найти сотрудника с минимальной зарплатой.
    public double getMinSalary(Employee[] employees) {
        double min = employees[0].getSalary();

        for (Employee e : employees) {
            if (e == null) {
                continue;
            }
            if (min > e.getSalary()) {
                min = e.getSalary();
            }
        }

        return min;
    }

    // Найти сотрудника с максимальной зарплатой.
    public double getMaxSalary(Employee[] employees) {
        double max = 0;

        for (Employee e : employees) {
            if (e == null) {
                continue;
            }
            if (max < e.getSalary()) {
                max = e.getSalary();
            }
        }

        return max;
    }

    // Подсчитать среднее значение зарплат
    public double getAverageSalary(Employee[] employees) {
        int counter = 0;
        for (Employee e : employees) {
            if (e != null) {
                counter++;
            }
        }
        return getSalarySumInMonth(employees) / counter;
    }

    // Получить Ф.И.О. всех сотрудников
    public void printFullNameList(Employee[] employees) {

        for (Employee e : employees) {
            if (e == null) {
                continue;
            }
            System.out.println("Ф.И.О сотрудника: " + e.getFullName());
        }
    }

    // Проиндексировать зарплату
    public void salaryIndexation(Employee[] employees, double percent) {
        for (Employee e : employees) {
            if (e == null) {
                continue;
            }
            e.setSalary((e.getSalary() + (e.getSalary() * (percent / 100))));
        }
    }

    // Получить сотрудника с минимальной зарплатой в отделе
    public double getMinSalaryInDepartment(Employee[] employees, int department) {
        double min = 0;
        for (Employee e : employees) {
            if (e == null) {
                continue;
            }
            if (e.getDepartment() == department) {
                min = e.getSalary();
                break;
            }
        }

        for (Employee e : employees) {
            if (e == null) {
                continue;
            }
            if (e.getDepartment() == department) {
                if (min > e.getSalary()) {
                    min = e.getSalary();
                }
            }
        }

        return min;
    }

    // Получить сотрудника с максимальной зарплатой в отделе
    public double getMaxSalaryInDepartment(Employee[] employees, int department) {
        double max = 0;

        for (Employee e : employees) {
            if (e == null) {
                continue;
            }
            if (e.getDepartment() == department) {
                if (max < e.getSalary()) {
                    max = e.getSalary();
                }
            }
        }

        return max;
    }

    // Получить сумму затрат на зарплату по отделу
    public double getSumSalaryInDepartment(Employee[] employees, int department) {
        double sumSalary = 0;
        for (Employee e : employees) {
            if (e == null) {
                continue;
            }
            if (e.getDepartment() == department) {
                sumSalary += e.getSalary();
            }
        }

        return sumSalary;
    }

    // Получить среднюю зарплату по отделу
    public double getAverageSalaryInDepartment(Employee[] employees, int department) {
        double salary = 0;
        int count = 0;
        for (Employee e : employees) {
            if (e == null) {
                continue;
            }
            if (e.getDepartment() == department) {
                count++;
                salary += e.getSalary();
            }
        }

        return salary / count;
    }

    // Проиндексировать зарплату всех сотрудников отдела
    public void salaryIndexationInDepartment(Employee[] employees, int department, double percent) {
        for (Employee e : employees) {
            if (e == null) {
                continue;
            }
            if (e.getDepartment() == department) {
                e.setSalary((e.getSalary() + (e.getSalary() * (percent / 100))));
            }
        }
    }

    // Напечатать всех сотрудников отдела
    public void printArrayDepartment(Employee[] employees, int department) {
        for (Employee e : employees) {
            if (e == null) {
                continue;
            }
            if (e.getDepartment() == department) {
                System.out.println("Имя: " + e.getFullName() + " | Зарплата:" + e.getSalary() + " | ID:" + e.getId());
            }
        }
    }

    // Найти всех сотрудников с зарплатой меньше числа
    public void findSalaryLessNum(Employee[] employees, int num) {
        for (Employee e : employees) {
            if (e == null) {
                continue;
            }
            if (e.getSalary() < num) {
                System.out.println("ID: " + e.getId() + " | Имя: " + e.getFullName() + " | Зарплата: " + e.getSalary());
            }
        }
    }

    // Найти всех сотрудников с зарплатой больше (или равно) числа
    public void findSalaryGreaterNum(Employee[] employees, int num) {
        for (Employee e : employees) {
            if (e == null) {
                continue;
            }
            if (e.getSalary() >= num) {
                System.out.println("ID: " + e.getId() + " | Имя: " + e.getFullName() + " | Зарплата: " + e.getSalary());
            }
        }
    }

    // Добавить нового сотрудника
    public void addEmployee(String name, int department, double salary, Employee[] employees) {
        Employee people1 = new Employee(name, department, salary);

        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = people1;
                break;
            }
            if (i == employees.length - 1) {
                throw new ArrayStoreException("Нет места для нового сотрудника");
            }
        }
    }

    // Удалить сотрудника
    public void deleteEmployee(int id, Employee[] employees) {

        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getId() == id) {
                employees[i] = null;
            }
        }
    }

    // Изменить зарплату
    public void editSalaryEmployee(int id, int salary, Employee[] employees) {

        for (Employee e : employees) {
            if (e == null) {
                continue;
            }

            if (e.getId() == id) {
                e.setSalary(salary);
            }
        }
    }

    // Изменить отдел
    public void editDepartmentEmployee(int id, int department, Employee[] employees) {
        if (department < 1 || department > 5) {
            System.out.println("Неверный номер отдела.");
            return;
        }

        for (Employee e : employees) {
            if (e == null) {
                continue;
            }

            if (e.getId() == id) {
                e.setDepartment(department);
            }
        }
    }

    // Получить Ф. И. О. всех сотрудников по отделам
    public void printAllDepartments(Employee[] employees) {

        for (int department = 1; department < 6; department++) {
            for (Employee e : employees) {
                if (e == null) {
                    continue;
                }
                if (e.getDepartment() == department) {
                    System.out.println("Отдел: " + department + " | Имя: " + e.getFullName());
                }
            }
        }
    }
}
