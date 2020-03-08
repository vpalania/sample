package project2.variables;

import javax.swing.JOptionPane;
public class Schedule {
   public static void main(String[] args) {
      String courseList = "";
      do {
         try {
            Course aCourse = addCourse();
            courseList += aCourse.toString() + "\n";
         }
         catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, "project2.variables.Course could not be created! " + e.getMessage());
         }
      } while (JOptionPane.showInputDialog("Enter another course? Enter Y or N").equalsIgnoreCase("Y"));
      
      printCourseReport(courseList, Course.getNumberOfCourses());
   }
   
   public static Course addCourse() {
      // Try to create a new course. If not possible (an exception happens), return control
      // to the calling method to see if another course should be created
      Course aCourse = new Course(JOptionPane.showInputDialog("Enter the ID of the course"));
      
      // Once a course is created, ensure an instructor is added. Exceptions can be handled
      // here to re-prompt the user to enter a new name
      boolean nameSet = false;
      do {
         try {
            aCourse.setInstructorName(JOptionPane.showInputDialog("Enter the instructor's name for " + aCourse.getCourseId()));
            nameSet = true;
         }
         catch(IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, "Instructor name could not be set. " + e.getMessage());
         }
      } while(!nameSet);

      // Once a course is created, ensure a term is added. Exceptions can be handled
      // here to re-prompt the user to enter a new term   
      boolean termSet = false;
      do {
         try {
            aCourse.setTerm(
               Integer.parseInt(JOptionPane.showInputDialog("Enter the year for " + aCourse.getCourseId()
                  + " between " + Course.MIN_YEAR + " and " + Course.MAX_YEAR)),
                  JOptionPane.showInputDialog("Enter the semester for " + aCourse.getCourseId()
                  + ". Valid terms are: " + Course.getTermNames())
            );
            termSet = true;
         }
         catch(NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "project2.variables.Course year must be entered as a number");
         }
         catch(IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, "project2.variables.Course term could not be set:\n" + e.getMessage());
         }
      } while(!termSet);
      
      return aCourse;
   }
   
   public static void printCourseReport(String courseList, int numberOfCourses) {
      if (numberOfCourses > 0) {
         JOptionPane.showMessageDialog(null, "project2.variables.Schedule of Courses\n\n"
            + courseList
            + "Total number of courses: " + numberOfCourses
         );   
      }
      else {
         JOptionPane.showMessageDialog(null, "There are no courses!");
      }
   }
}



