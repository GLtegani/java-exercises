//import entities.Rectangle;

//import entities.Employee;
import entities.CurrencyConverter;
import entities.Student;

import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

//      EX 1
//      Rectangle rectangle = new Rectangle();
//      System.out.println("Enter rectangle width and height:");
//      rectangle.width = sc.nextDouble();
//      rectangle.height = sc.nextDouble();
//
//      System.out.printf("AREA: %.2f %n", rectangle.area());
//      System.out.printf("PERIMETER: %.2f %n", rectangle.perimeter());
//      System.out.printf("DIAGONAL: %.2f %n", rectangle.diagonal());

//      EX 2

//      Employee employer = new Employee();
//      System.out.printf("Type employer data: %n Name: ");
//      employer.name = sc.nextLine();
//      System.out.print("Gross salary: ");
//      employer.grossSalary = sc.nextDouble();
//      System.out.print("Tax: ");
//      employer.tax = sc.nextDouble();
//
//      System.out.println(employer);
//
//      System.out.print("Which percentage to increase salary? ");
//      double userPercentage = sc.nextDouble();
//      employer.increaseSalary(userPercentage);
//
//      System.out.printf("Updated data: %s, Salary: $ %.2f", employer.name, employer.netSalary());

//      EX 3

//      Student student = new Student();
//      System.out.print("Student name: ");
//      student.name = sc.nextLine();
//      System.out.print("Grade One: ");
//      student.gradeOne = sc.nextDouble();
//      System.out.print("Grade Two: ");
//      student.gradeTwo = sc.nextDouble();
//      System.out.print("Grade Three: ");
//      student.gradeThree = sc.nextDouble();
//
//      System.out.print(student);

//      EX 4

      CurrencyConverter money = new CurrencyConverter();

      System.out.print("What is the dollar price? ");
      money.dollarPrice = sc.nextDouble();
      System.out.print("How many dollars will be bought? ");
      money.dollarsToBuy = sc.nextDouble();
      System.out.printf("Amount to be paid in reais = %.2f", money.convertMoney());


      sc.close();
   }
}
