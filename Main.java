interface IPayable {
    String getName();
    double getAmount();
}

abstract class Employee implements IPayable {
    protected String firstName;
    protected String lastName;

    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getName() {
        return firstName + " " + lastName;
    }

    public abstract double WeeklyPay();

    public double getAmount() {
        return WeeklyPay();
    }

    public String toString() {
        return getName();
    }
}

class Hourly extends Employee {
    private double hours;
    private double rate;

    public Hourly(String firstName, String lastName, double hours, double rate) {
        super(firstName, lastName);
        this.hours = hours;
        this.rate = rate;
    }

    public double WeeklyPay() {
        double pay = 0.0;
        if (hours <= 40.0) {
            pay = rate * hours;
        } else {
            pay = (hours - 40.0) * 1.5 * rate + 40.0 * rate;
        }
        return pay;
    }
}

class Salary extends Employee {
    private double annualSalary;

    public Salary(String firstName, String lastName, double annualSalary) {
        super(firstName, lastName);
        this.annualSalary = annualSalary;
    }

    public double WeeklyPay() {
        return annualSalary / 52.0;
    }
}

class Contract extends Employee {
    private double amount;
    private int weeks;

    public Contract(String firstName, String lastName, double amount, int weeks) {
        super(firstName, lastName);
        this.amount = amount;
        this.weeks = weeks;
    }

    public double WeeklyPay() {
        return amount / weeks;
    }
}

public class Main {
    public static void main(String[] args) {
        Hourly hourlyEmployee = new Hourly("John", "Doe", 45.0, 20.0);
        Salary salaryEmployee = new Salary("Jane", "Smith", 60000.0);
        Contract contractEmployee = new Contract("Alice", "Johnson", 3000.0, 10);

        System.out.println(hourlyEmployee);
        System.out.println("Weekly Pay: " + hourlyEmployee.WeeklyPay());

        System.out.println(salaryEmployee);
        System.out.println("Weekly Pay: " + salaryEmployee.WeeklyPay());

        System.out.println(contractEmployee);
        System.out.println("Weekly Pay: " + contractEmployee.WeeklyPay());
    }
}
