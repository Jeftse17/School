/*
 * Author: Chris Kelly
 * Date: Spring 2015
 * Location: UMass Boston
 * 
 * Container for static methods, used for CS/IT 114 
 */

 import java.util.Scanner;

 public class MethodHolder {
     
     // How much each credit costs
     private static final double COST_PER_CREDIT = 345.59;
     
     // The minimum number of credits necessary to qualify
     // as a senior
     private static final int SENIOR_MIN_CREDITS = 90;
     
     // A course qualifies as "intense" if it counts 
     // for this many credits or more
     private static final int INTENSITY_THRESHOLD = 4;
     
     protected static Student generateStudent(){
         
         Scanner scan = new Scanner(System.in);
         System.out.print("Name: ");
         String name = scan.nextLine();
         System.out.print("Major: ");
         String major = scan.nextLine();
         System.out.print("Credits: ");
         int credits = scan.nextInt();
         System.out.print("Age: ");
         int age = scan.nextInt();
 
         double tuitionCost = credits * COST_PER_CREDIT;
         boolean isSenior = credits >= SENIOR_MIN_CREDITS;
 
         // replace 0.0 and false with appropriate double and boolean expressions, respectively
         return new Student(name, major, credits, age, tuitionCost, isSenior);
     }
     
     protected static Course generateCourse(){
         
         Scanner scan = new Scanner(System.in);
         System.out.print("Title: ");
         String title = scan.nextLine();
         System.out.print("Department: ");
         String department = scan.nextLine();
         System.out.print("Credits: ");
         int credits = scan.nextInt();
         System.out.print("Maximum Students: ");
         int maxStudents = scan.nextInt();
 
         double courseCost = credits * COST_PER_CREDIT;
         boolean isIntensive = credits >= INTENSITY_THRESHOLD;
 
         // replace 0.0 and false with appropriate double and boolean expressions, respectively
         return new Course(title, department, credits, maxStudents, courseCost, isIntensive);
     }
     
     protected static void printStudentInfo(Student s){
         
         // YOUR CODE GOES HERE
         System.out.println("Name: " + s.getName());
         System.out.println("Major: " + s.getMajor());
         System.out.println("Credits: " + s.getCredits());
         System.out.println("Age: " + s.getAge());
         System.out.println("Spent so far: " + s.getSpentSoFar());
         System.out.println("Student is senior? " + s.isStudentASenior());
         System.out.println("Courses: ");
         s.printCourses();
     }
     
     protected static void printCourseInfo(Course c){
         
         //YOUR CODE GOES HERE
         System.out.println("Title: " + c.getTitle());
         System.out.println("Department: " + c.getDepartment());
         System.out.println("Credits: " + c.getCredits());
         System.out.println("Enrollment: " + c.getEnrollment());
         System.out.println("Cost: " + c.getCost());
         System.out.println("Course is intensive: " + c.isCourseIntensive());
         System.out.println("Students currently enrolled: ");
         c.printStudents();
     }
 
     
     // Enrolls a student in a course, if the student's schedule and 
     // the course both have space
     protected static void enrollStudentInCourse(Student s, Course c){
         
         if (s.hasSpace() && c.hasSpace()) {
             s.addCourse(c);
             c.addStudent(s);
             System.out.println(s.getName() + " added to " + c.getTitle());
         }
         else {
             if (!s.hasSpace())
                 System.out.println(s.getName() + "'s schedule is full");
             if(!c.hasSpace())
                 System.out.println(c.getTitle() + " is full");
         }
         
     }
     
 }
 