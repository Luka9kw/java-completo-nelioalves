package application;

import entities.Student;

import java.util.Scanner;
import java.util.Locale;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Student s = new Student();


        System.out.print("Enter your name: ");
        s.name = sc.nextLine();
        System.out.print("Enter your first grade: ");
        s.grade1 = sc.nextDouble();
        System.out.print("Enter your second grade: ");
        s.grade2 = sc.nextDouble();
        System.out.print("Enter your third grade: ");
        s.grade3 = sc.nextDouble();

        double finalGrade = s.finalGradeCalc();
        double missingPoints = s.missingPoints();

        if (finalGrade >= 60) {
            System.out.printf("FINAL GRADE =  %.2f%n", finalGrade);
            System.out.println("PASS");
        }
        else {
            System.out.printf("FINAL GRADE =  %.2f%n", finalGrade);
            System.out.println("FAILED");
            System.out.printf("MISSING  =  %.2f%n", missingPoints);
        }
        sc.close();
    }
}
