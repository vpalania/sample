package project1;

public class Student {
   private String name;
   private int code;
   private int maxStudents = 5;
   private static int numStudents = 0;
   
   public Student(int code) {
      if (code > 999 && code < 10000) {
         this.code = code;
         numStudents++;
      }
      else {
         throw new IllegalArgumentException("code must be a four-digit value");
      }
   }
   
   public Student(){
      if(this.numStudents < maxStudents)
         numStudents++;
      else {
         throw new IllegalArgumentException("The class is full");
      }
   }
   
   public int getCode() { 
      return this.code;   
   }
   
   public void setCode(int code) {
      if (code > 999 && code < 10000) {
         this.code = code;
      }
      else {
         throw new IllegalArgumentException("code must be a four-digit value");
      }
   }
   
   public int getNumStudents() { 
      return this.numStudents;   
   }
   
   public void setNumStudents(int numStudents) {
      if (numStudents > 0) {
         this.numStudents = numStudents;
      }
      else {
         throw new IllegalArgumentException("numbers of students cannot be more than 5");
      }
   }

   public String toString() {
      return "The student code " + this.getCode()
         + " with number of students " + this.getNumStudents();
    }
}


