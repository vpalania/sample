package project2.variables;

public class Course {
   public static final String[] TERM_NAMES = {"Fall", "Spring", "Summer"};
   
   // Note: Even though TERM_IDS is a constant, it is being made private instead
   // of public since the information is only used in this class
   private static final String[] TERM_IDS = {"70", "10", "40"};
   public static final int MIN_YEAR = 2017;
   public static final int MAX_YEAR = 2030;
   private static int numberOfCourses;
   
   private String courseId;
   private String instructorName;
   private String term;
   
   public Course(String courseId) {
      if (courseId == null || courseId.equals("")) {
         throw new IllegalArgumentException("project2.variables.Course ID cannot be blank");
      }
      this.courseId = courseId;
   
      ++numberOfCourses;
   }
   
   public String getCourseId() { return this.courseId; }
   public String getInstructorName() { return this.instructorName; }
   public String getTerm() { return this.term; }
   public static String getTermNames() {
      String termNames = "";
      for (int x = 0; x < TERM_NAMES.length; x++) {
         if (x > 0) {
            termNames += " | ";
         }
         termNames += TERM_NAMES[x];
      }
      return termNames;
   }
   public static int getNumberOfCourses() { return numberOfCourses; }
   
   public void setCourseID(String courseId) {
      if (courseId == null || courseId.equals("")) {
         throw new IllegalArgumentException("project2.variables.Course ID cannot be blank");
      }
      this.courseId = courseId;
   }
   
   public void setInstructorName(String instructorName) {
      if (instructorName == null || instructorName.equals("")) {
         throw new IllegalArgumentException("Instructor name cannot be blank");
      }
      this.instructorName = instructorName;
   }
   
   public void setTerm(int year, String termName) {
      if (year < MIN_YEAR || year > MAX_YEAR) {
         throw new IllegalArgumentException(
            "The term year must be between " + MIN_YEAR + " and " + MAX_YEAR);
      }
      this.term = year + validateTerm(termName);
	}   

   public String toString() {
      return this.getCourseId() + "   " + this.getTerm() + "   " + this.getInstructorName();
   }   

   // Helper special purpose method, denoted as private because it will not be used outside the class
   private String validateTerm(String termName) {
      String termId = "";
      boolean termFound = false;
      int x = 0;
      
      // Use a sequential search to determine the term Id based on a term name
      while (!termFound && x < TERM_NAMES.length) {
         if (TERM_NAMES[x].equals(termName)) {
            termId = TERM_IDS[x];
            termFound = true;
         }
         else {
            ++x;
         }      
      }
      
      // When no term has been found, throw an exception
      if (termId.equals("")) {
         throw new IllegalArgumentException(termName + " could not be found. "
            + "The term name must be one of the following: " + getTermNames());
      }
      
      return termId;
   }
}


