class Person {
private String name;
private int age;
public Person(String name, int age) {
this.name = name;
this.age = age;
}
public void displayPersonDetails() {
System.out.println("Name: " + name);
System.out.println("Age: " + age);
}
}
class Employee extends Person {
protected String employeeId;
public Employee(String name, int age, String employeeId) {
super(name, age);
this.employeeId = employeeId;
}
public static double calculateIncomeTax(double income) {
if (income <= 300000) return 0;
else if (income <= 600000) return (income - 300000) * 0.05;
else if (income <= 900000) return (300000 * 0.05) + (income - 600000) *
0.10;
else if (income <= 1200000) return (300000 * 0.05) + (300000 * 0.10) +
(income - 900000) * 0.15;
else return (300000 * 0.05) + (300000 * 0.10) + (300000 * 0.15) +
(income - 1200000) * 0.20;
}

public void displayEmployeeDetails() {
displayPersonDetails();
System.out.println("Employee ID: " + employeeId);
}
}
class PermanentEmployee extends Employee {
private double basicSalary;
public PermanentEmployee(String name, int age, String employeeId, double
basicSalary) {
super(name, age, employeeId);
this.basicSalary = basicSalary;
}
public double calculateTotalSalary() {
double da = 0.35 * basicSalary;
double hra = 10000;
double gross = basicSalary + da + hra;
double tax = calculateIncomeTax(gross);
return gross - tax;
}
public void displaySalary() {
displayEmployeeDetails();
System.out.println("Total Salary (Permanent): Rs" +
calculateTotalSalary());
}
}
class PartTimeEmployee extends Employee {
private double hourlyPayRate;
public PartTimeEmployee(String name, int age, String employeeId, double
hourlyPayRate) {
super(name, age, employeeId);
this.hourlyPayRate = hourlyPayRate;
}
public double calculateTotalSalary(int noOfHours) {
double gross = hourlyPayRate * noOfHours;
double tax = calculateIncomeTax(gross);
return gross - tax;
}
public void displaySalary(int hours) {

displayEmployeeDetails();
System.out.println("Total Salary (Part-Time for " + hours + " hrs): Rs"
+ calculateTotalSalary(hours));
}
}
public class HRMApp {
public static void main(String[] args) {
PermanentEmployee pe = new PermanentEmployee("Anita", 30, "EMP001",
750000);
pe.displaySalary();
System.out.println();
PartTimeEmployee pt = new PartTimeEmployee("Ravi", 22, "EMP002", 500);
pt.displaySalary(80);
}
}
