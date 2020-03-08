package project3.arrays;

import javax.swing.JOptionPane;
public class ReturnArrayExample {

	public static void main(String[] args) {
		int[] initialArray = {1, 2, 3};
		int[] doubledArray;
		int[] thirdArray;

      String arrayContents = "";
      for (int number : initialArray) {
         arrayContents += number + " ";
      }
   	JOptionPane.showMessageDialog(null,
			"The initial array is: " + arrayContents
		);

		doubledArray = doubleArrayValues(initialArray);
		thirdArray = thirdArrayValues(initialArray);


		String doubledArrayContents = "";
      for (int number : doubledArray) {
         doubledArrayContents += number + " ";
      }
	
		JOptionPane.showMessageDialog(null,
			"The initial array is: " + arrayContents +
			"\nThe doubled array is: " + doubledArrayContents
		);

		String thirdArrayContents = "";
		for (int number : thirdArray) {
			thirdArrayContents += number + " ";
		}

		JOptionPane.showMessageDialog(null,
				"The initial array is: " + arrayContents +
						"\nThe third array is: " + thirdArrayContents
		);
	}
	
	private static int[] doubleArrayValues(int[] anArray) {
		int[] newArray = new int[anArray.length];
		
		for (int x = 0; x < anArray.length; x++) {
			newArray[x] = anArray[x] * 2;
		}
		
		return newArray;	
	}

	private static int[] thirdArrayValues(int[] anArray) {
		int[] newArray = new int[anArray.length];

		for (int x = 0; x < anArray.length; x++) {
			newArray[x] = anArray[x] * 3;
		}

		return newArray;
	}
}

