package project3.arrays;

import javax.swing.JOptionPane;
public class ArrayParameterPassing {

	public static void main(String[] args) {
		int[] initialArray = {1, 2, 3};
      
      String arrayContents = "";
      for (int number : initialArray) {
         arrayContents += number + " ";
      }
   	JOptionPane.showMessageDialog(null,
			"The initial array is: " + arrayContents
		);

		doubleArrayValues(initialArray);
		
      arrayContents = "";
      for (int number : initialArray) {
         arrayContents += number + " ";
      }
		JOptionPane.showMessageDialog(null,
			"The initial array is: " + arrayContents
		);
	}
	
	private static void doubleArrayValues(int[] anArray) {
		for (int x = 0; x < anArray.length; x++) {
			anArray[x] *= 2;
		}	
	}
}


