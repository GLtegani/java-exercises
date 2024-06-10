package entities;

public class Employee {
   public String name;
   public double grossSalary;
   public double tax;

   public double netSalary() {
      return grossSalary - tax;
   }

   public void increaseSalary(double percentage) {
      double percentageOfGrossSalary = percentage * grossSalary / 100;
      grossSalary += percentageOfGrossSalary;
   }

   public String toString() {
      return "Employee: " + name + ", Salary: $ " + String.format("%.2f", netSalary());
   }
}
