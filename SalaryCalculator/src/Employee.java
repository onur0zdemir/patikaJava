public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax() {
        if (this.salary < 1000) {
            return 0;
        } else {
            double tax = salary * 0.03;
            return tax;
        }
    }

    public int bonus() {
        if (this.workHours < 40) {
            return 0;
        } else {
            int bonus = (workHours - 40) * 30;
            return bonus;
        }
    }

    public double raiseSalary() {
        double raise;
        int workedYear = 2021 - hireYear;

        if (workedYear < 10) {
            raise = salary * 0.05;
            return raise;
        } else if (workedYear > 9 && workedYear < 20) {
            raise = salary * 0.1;
            return raise;
        } else {
            raise = salary * 0.15;
            return raise;
        }

    }

    public void print() {
        double salaryTaxBonus = salary - tax() + bonus();
        double totalSalary = salary + raiseSalary();
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Work Hours: " + workHours);
        System.out.println("Hire Year: " + hireYear);
        System.out.println("Tax: " + tax());
        System.out.println("Bonus: " + bonus());
        System.out.println("Salary Raise: " + raiseSalary());
        System.out.println("Salary with Tax and Bonus: " + salaryTaxBonus);
        System.out.println("Total Salary without Tax and Bonus: " + totalSalary);
    }
}
