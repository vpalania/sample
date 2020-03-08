package project3.arraysOfObjects;

public class DVD {
	private String title;
   private String genre;
	public static final String[] GENRES = {"Comedy", "Drama", "Horror"};
   private static int numDVDs; // Track number of DVD objects;

   public DVD(String title, String genre) {
      if (title == null || title.equals("")) {
         throw new IllegalArgumentException("A title must be provided");
      }
      if (!findGenre(genre)) {
         throw new IllegalArgumentException(
            "One of the following genres must be specified: " + this.getGenres());      
      }
      
      this.title = title;
      this.genre = genre;
      ++numDVDs;
   }

   public String getTitle() { return this.title; }
   public String getGenre() { return this.genre; }
   public static int getNumDVDs() { return numDVDs; }
   
	public static String getGenres() {
		String genres = "";
		for (int x = 0; x < GENRES.length; x++) {
			genres += GENRES[x];
         if (x < GENRES.length - 1) {
            genres += ", ";
         }         
      }
		return genres;
	}

   public void setTitle(String title) {
      if (title == null || title.equals("")) {
         throw new IllegalArgumentException("A title must be provided");
      }
      this.title = title;
   }
   
   public void setGenre(String genre) {
      if (!findGenre(genre)) {
         throw new IllegalArgumentException(
            "One of the following genres must be specified: " + this.getGenres());      
      }
      
      this.genre = genre;
	}   

   // Helper method for validating an accurate genre
   private boolean findGenre(String genre) {
      boolean genreFound = false;
      int x = 0;
      
      while (!genreFound && x < GENRES.length) {
         if (GENRES[x].equals(genre)) {
            genreFound = true;
         }
         else {
            ++x;
         }
      }   
      return genreFound;
   }

   public String toString() {
      return this.getTitle() + " (" + this.getGenre() + ")";
   }
}

