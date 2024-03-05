package Week7;

import java.util.Scanner;

public class DuplicateinArray {

	public static void main(String[] args) {

		int array[] = new int[10]; boolean isDuplicate=false;

		Scanner inScanner= new Scanner (System.in);

		System.out.println("enter array size"); int size=

             inScanner.nextInt();    

		System.out.println("enter elements one by one");

		for (int i=0; i<size; i++) 

			array[i]= inScanner.nextInt();

		int i,j=0;

		outer:for (i =0; i<size-1; i++) 

		{

			for  (j= i+1; j<size; j++)

			{

				if (array[j]== array[i])

				{

					isDuplicate= true; break outer;

				}

			}

		}	

	       if (isDuplicate)

			System.out.println("array conatains duplicate elements at  

                    position " + (i+1) + " and at " +  (j+1));

		else

			System.out.println("array doesn't contains duplicate 

                    elements ");

	}



}
