package project1;

import javax.swing.JOptionPane;
public class StudentImplementation {
   public static void main(String[] args) {
      Student aStudent;
      boolean maxReached = false;
            
      while(!maxReached && JOptionPane.showConfirmDialog(null,
         "Do you want to enter a student?", "project1.Student Question", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
         try {
            aStudent = getStudent();
            JOptionPane.showMessageDialog(null,
               "The project1.Student GCode is " + aStudent.getCode());
         }
         catch (IllegalArgumentException e) {
            if(e.getMessage().equals("The class is full")){
               maxReached = true;
               JOptionPane.showMessageDialog(null, e.getMessage());
            }
            else
               JOptionPane.showMessageDialog(null, "project1.Student could not be created: " + e.getMessage());
            
         }
      }
   }
   
   private static Student getStudent() {
      Student aStudent = new Student();

      boolean gCodeSet = false;
      do {
         try {
            aStudent.setCode(Integer.parseInt(JOptionPane.showInputDialog("Enter the GNumber: ")));
            gCodeSet = true;
         }
         catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "You did not enter a valid GNumber. Please try again");
         }
         catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
         }
      }
      while (!gCodeSet);

      return aStudent;   
   }
}

