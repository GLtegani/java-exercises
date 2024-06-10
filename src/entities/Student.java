package entities;

public class Student {
   public String name;
   public double gradeOne;
   public double gradeTwo;
   public double gradeThree;

   public String toString() {
      double finalGrade = gradeOne + gradeTwo + gradeThree;
      if(finalGrade < 60) {
         double missingGrade = 60 - finalGrade;
         return "FINAL GRADE = " + String.format("%.2f %n", finalGrade) + String.format("FAILED %nMISSING %.2f ", missingGrade) + "POINTS";
      } else {
         return "FINAL GRADE = " + String.format("%.2f %n", finalGrade) + "PASS";
      }
   }
}
