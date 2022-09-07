package week1.day2;

import java.util.Iterator;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String text = "We learn java basics as part of java sessions in java week1";
		int count;
//to split each word into an array
		String[] splitText = text.split(" ");
		// traversing to 2 loops to compare the duplicate values
		for (int i = 0; i < splitText.length; i++) {
			count = 1;
			for (int j = i + 1; j < splitText.length; j++) {
				if (splitText[i].equals(splitText[j])) {
					count++;
					splitText[j] = "";

				}

			}
			
			  if (count > 1 && splitText[i] != "") {
			  System.out.println("Duplicate word is : " + splitText[i]); }
			 
		}
		for (int k = 0; k < splitText.length; k++) {
			System.out.print(splitText[k] + " ");
		}

	}

}
